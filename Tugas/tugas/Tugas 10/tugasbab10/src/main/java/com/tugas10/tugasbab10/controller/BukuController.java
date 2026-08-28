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

import com.tugas10.tugasbab10.entity.Buku;
import com.tugas10.tugasbab10.service.BukuService;

@RestController
@RequestMapping("/api/buku")
public class BukuController {

    private final BukuService bukuService;

    public BukuController(BukuService bukuService) {
        this.bukuService = bukuService;
    }

    @PostMapping
    public ResponseEntity<Buku> tambahBuku(@RequestBody Buku buku) {
        Buku bukuBaru = bukuService.tambahBuku(buku);
        return ResponseEntity.status(HttpStatus.CREATED).body(bukuBaru);
    }

    @GetMapping
    public ResponseEntity<List<Buku>> getSemuaBuku() {
        return ResponseEntity.ok(bukuService.getSemuaBuku());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBukuById(@PathVariable Long id) {
        Buku buku = bukuService.getBukuById(id);

        if (buku == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Buku dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok(buku);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBuku(
            @PathVariable Long id,
            @RequestBody Buku buku) {

        Buku bukuUpdate = bukuService.updateBuku(id, buku);

        if (bukuUpdate == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Buku dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok(bukuUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> hapusBuku(@PathVariable Long id) {

        boolean berhasil = bukuService.hapusBuku(id);

        if (!berhasil) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Buku dengan ID " + id + " tidak ditemukan");
        }

        return ResponseEntity.ok("Buku dengan ID " + id + " berhasil dihapus");
    }
}