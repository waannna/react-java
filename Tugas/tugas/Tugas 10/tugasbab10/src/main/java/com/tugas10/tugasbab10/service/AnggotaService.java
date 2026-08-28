package com.tugas10.tugasbab10.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas10.tugasbab10.entity.Anggota;
import com.tugas10.tugasbab10.repository.AnggotaRepository;

@Service
public class AnggotaService {

    private final AnggotaRepository anggotaRepository;

    public AnggotaService(AnggotaRepository anggotaRepository) {
        this.anggotaRepository = anggotaRepository;
    }

    public Anggota tambahAnggota(Anggota anggota) {
        return anggotaRepository.save(anggota);
    }

    public List<Anggota> getSemuaAnggota() {
        return anggotaRepository.findAll();
    }

    public Anggota getAnggotaById(Long id) {
        return anggotaRepository.findById(id).orElse(null);
    }

    public Anggota updateAnggota(Long id, Anggota anggotaBaru) {
        Anggota anggotaLama = anggotaRepository.findById(id).orElse(null);

        if (anggotaLama == null) {
            return null;
        }

        anggotaLama.setNama(anggotaBaru.getNama());
        anggotaLama.setNim(anggotaBaru.getNim());
        anggotaLama.setAlamat(anggotaBaru.getAlamat());

        return anggotaRepository.save(anggotaLama);
    }

    public boolean hapusAnggota(Long id) {
        if (!anggotaRepository.existsById(id)) {
            return false;
        }

        anggotaRepository.deleteById(id);
        return true;
    }
}