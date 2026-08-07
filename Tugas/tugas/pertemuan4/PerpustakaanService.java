package tugas.pertemuan4;

import java.util.ArrayList;
import java.util.HashMap;

public class PerpustakaanService implements LayananPerpustakaan {

    private ArrayList<ItemPerpustakaan> daftarBuku = new ArrayList<>();

    private HashMap<String, String> statusBuku = new HashMap<>();

    @Override
    public void tambahBuku(ItemPerpustakaan buku) {

        daftarBuku.add(buku);
        statusBuku.put(buku.getIdItem(), "Tersedia");
        System.err.println("Buku berhasil ditambahkan.");

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
            System.err.println("buku dengan ID " + id + " tidak ditemukan");
        }
    }

    @Override
    public void hapusBuku(String id) {
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
            System.out.println(" Buku berhasil dihapus!");
        } else {
            System.out.println("Buku dengan ID " + id + " tidak ditemukan");
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
