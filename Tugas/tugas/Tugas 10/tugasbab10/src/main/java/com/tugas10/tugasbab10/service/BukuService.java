package com.tugas10.tugasbab10.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas10.tugasbab10.entity.Buku;
import com.tugas10.tugasbab10.repository.BukuRepository;

@Service
public class BukuService {

    private final BukuRepository bukuRepository;

    public BukuService(BukuRepository bukuRepository) {
        this.bukuRepository = bukuRepository;
    }

    public Buku tambahBuku(Buku buku) {
        return bukuRepository.save(buku);
    }

    public List<Buku> getSemuaBuku() {
        return bukuRepository.findAll();
    }

    public Buku getBukuById(Long id) {
        return bukuRepository.findById(id).orElse(null);
    }

    public Buku updateBuku(Long id, Buku bukuBaru) {
        Buku bukuLama = bukuRepository.findById(id).orElse(null);

        if (bukuLama == null) {
            return null;
        }

        bukuLama.setJudul(bukuBaru.getJudul());
        bukuLama.setPenulis(bukuBaru.getPenulis());
        bukuLama.setPenerbit(bukuBaru.getPenerbit());
        bukuLama.setTahunTerbit(bukuBaru.getTahunTerbit());

        return bukuRepository.save(bukuLama);
    }

    public boolean hapusBuku(Long id) {
        if (!bukuRepository.existsById(id)) {
            return false;
        }

        bukuRepository.deleteById(id);
        return true;
    }
}