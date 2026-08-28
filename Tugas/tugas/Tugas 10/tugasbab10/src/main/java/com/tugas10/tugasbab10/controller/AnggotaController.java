package com.tugas10.tugasbab10.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tugas10.tugasbab10.entity.Anggota;
import com.tugas10.tugasbab10.service.AnggotaService;

@RestController
@RequestMapping("/api/anggota")
public class AnggotaController {

    private final AnggotaService anggotaService;

    public AnggotaController(AnggotaService anggotaService) {
        this.anggotaService = anggotaService;
    }

    @PostMapping
    public ResponseEntity<Anggota> tambahAnggota(@RequestBody Anggota anggota) {
        Anggota anggotaBaru = anggotaService.tambahAnggota(anggota);
        return ResponseEntity.status(HttpStatus.CREATED).body(anggotaBaru);
    }

    @GetMapping
    public ResponseEntity<List<Anggota>> getSemuaAnggota() {
        return ResponseEntity.ok(anggotaService.getSemuaAnggota());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAnggotaById(@PathVariable Long id) {
        Anggota anggota = anggotaService.getAnggotaById(id);

        if (anggota == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Anggota dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok(anggota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAnggota(
            @PathVariable Long id,
            @RequestBody Anggota anggota) {

        Anggota anggotaUpdate = anggotaService.updateAnggota(id, anggota);

        if (anggotaUpdate == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Anggota dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok(anggotaUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> hapusAnggota(@PathVariable Long id) {

        boolean berhasil = anggotaService.hapusAnggota(id);

        if (!berhasil) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Anggota dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok("Anggota dengan ID " + id + " berhasil dihapus");
    }
}