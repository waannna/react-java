package ade.uts;

import java.util.ArrayList;
import java.util.HashMap;

public class PerpustakaanService implements LayananPerpustakaan {

    private ArrayList<ItemPerpustakaan> daftarBuku = new ArrayList<>();
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();

    private HashMap<String, String> statusBuku = new HashMap<>();

    @Override
    public void tambahBuku(ItemPerpustakaan buku) {
        for (ItemPerpustakaan b : daftarBuku) {
            if (b.getIdItem().equalsIgnoreCase(buku.getIdItem())) {
                System.out.println("Buku dengan ID " + buku.getIdItem() + " sudah terdaftar.");
                return;
            }
        }

        daftarBuku.add(buku);
        statusBuku.put(buku.getIdItem(), "Tersedia");
        System.out.println("Buku berhasil ditambahkan.");
    }

    @Override
    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
            return;
        }
        System.out.println("\n=== DAFTAR BUKU PERPUSTAKAAN ===");
        for (ItemPerpustakaan buku : daftarBuku) {
            buku.tampildetail();
            System.out.println("Status: " + statusBuku.get(buku.getIdItem()));
            System.out.println("-------------------------");
        }
    }

    @Override
    public void ubahBuku(String id, String judulBaru) {
        boolean ditemukan = false;
        for (ItemPerpustakaan buku : daftarBuku) {
            if (buku.getIdItem().equalsIgnoreCase(id)) {
                buku.setJudul(judulBaru);
                ditemukan = true;
                System.out.println("Judul buku berhasil diubah.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
        }
    }

    @Override
    public void hapusBuku(String id) {
        if ("Dipinjam".equalsIgnoreCase(statusBuku.get(id))) {
            System.out.println("Buku sedang dipinjam dan tidak dapat dihapus");
            return;
        }

        ItemPerpustakaan bukuDiHapus = null;
        for (ItemPerpustakaan buku : daftarBuku) {
            if (buku.getIdItem().equalsIgnoreCase(id)) {
                bukuDiHapus = buku;
                break;
            }
        }

        if (bukuDiHapus != null) {
            daftarBuku.remove(bukuDiHapus);
            statusBuku.remove(id);
            System.out.println("Buku berhasil dihapus!");
        } else {
            System.out.println("Buku dengan ID " + id + " tidak ditemukan.");
        }
    }

    @Override
    public void tambahAnggota(Anggota anggota) {
        for (Anggota a : daftarAnggota) {
            if (a.getIdAnggota().equalsIgnoreCase(anggota.getIdAnggota())) {
                System.out.println("Anggota dengan ID " + anggota.getIdAnggota() + " sudah terdaftar.");
                return;
            }
        }
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan.");
    }

    @Override
    public void tampilkanAnggota() {
        if (daftarAnggota.isEmpty()) {
            System.out.println("Tidak ada anggota yang terdaftar.");
            return;
        }
        System.out.println("\n=== DAFTAR ANGGOTA PERPUSTAKAAN ===");
        for (Anggota a : daftarAnggota) {
            a.tampilkanDetail();
        }
    }

    @Override
    public void ubahAnggota(String id, String namaBaru) {
        boolean ditemukan = false;
        for (Anggota a : daftarAnggota) {
            if (a.getIdAnggota().equalsIgnoreCase(id)) {
                a.setNama(namaBaru);
                ditemukan = true;
                System.out.println("Nama anggota berhasil diubah.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Anggota dengan ID " + id + " tidak ditemukan.");
        }
    }

    @Override
    public void hapusAnggota(String idAnggota) {
        Anggota anggotaDiHapus = null;
        for (Anggota a : daftarAnggota) {
            if (a.getIdAnggota().equalsIgnoreCase(idAnggota)) {
                anggotaDiHapus = a;
                break;
            }
        }

        if (anggotaDiHapus != null) {
            daftarAnggota.remove(anggotaDiHapus);
            System.out.println("Anggota berhasil dihapus!");
        } else {
            System.out.println("Anggota dengan ID " + idAnggota + " tidak ditemukan.");
        }
    }

    @Override
    public void pinjamBuku(String idPeminjaman, String idAnggota, String idBuku, int lamaHari) {
        Anggota peminjam = null;
        for (Anggota a : daftarAnggota) {
            if (a.getIdAnggota().equalsIgnoreCase(idAnggota)) {
                peminjam = a;
                break;
            }
        }

        if (peminjam == null) {
            System.out.println("Anggota dengan ID " + idAnggota + " tidak ditemukan.");
            return;
        }

        ItemPerpustakaan bukuTarget = null;
        for (ItemPerpustakaan b : daftarBuku) {
            if (b.getIdItem().equalsIgnoreCase(idBuku)) {
                bukuTarget = b;
                break;
            }
        }

        if (bukuTarget == null) {
            System.out.println("Buku dengan ID " + idBuku + " tidak ditemukan.");
            return;
        }

        if ("Dipinjam".equalsIgnoreCase(statusBuku.get(idBuku))) {
            System.out.println("Buku dengan ID " + idBuku + " sedang dipinjam.");
            return;
        }

        Peminjaman p = new Peminjaman(idPeminjaman, peminjam, bukuTarget, lamaHari);
        daftarPeminjaman.add(p);
        statusBuku.put(idBuku, "Dipinjam");

        System.out.println("Buku berhasil dipinjam.");
        p.tampilkanTransaksi();
    }

    @Override
    public void kembalikanBuku(String idBuku) {
        if (!"Dipinjam".equalsIgnoreCase(statusBuku.get(idBuku))) {
            System.out.println("Buku ini sedang tidak dalam status dipinjam.");
            return;
        }

        statusBuku.put(idBuku, "Tersedia");
        System.out.println("Buku dengan ID " + idBuku + " berhasil dikembalikan.");
    }

    public void tampilkanTransaksi() {
        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Belum ada riwayat transaksi peminjaman.");
            return;
        }
        System.out.println("\n=== RIWAYAT PEMINJAMAN ===");
        for (Peminjaman p : daftarPeminjaman) {
            p.tampilkanTransaksi();
        }
    }

    public void cariBuku(String id) {
        System.out.println("\n--- Hasil Pencarian ID: " + id + " ---");
        for (ItemPerpustakaan buku : daftarBuku) {
            if (buku.getIdItem().equalsIgnoreCase(id)) {
                buku.tampildetail();
                return;
            }
        }
        System.out.println("Buku dengan ID tersebut tidak ditemukan.");
    }

    public void cariBuku(String keyword, boolean cariJudul) {
        System.out.println("\n--- Hasil Pencarian Kata Kunci Judul: " + keyword + " ---");
        boolean ada = false;
        for (ItemPerpustakaan buku : daftarBuku) {
            if (buku.getJudul().toLowerCase().contains(keyword.toLowerCase())) {
                buku.tampildetail();
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada buku yang cocok dengan kata kunci tersebut.");
        }
    }
}