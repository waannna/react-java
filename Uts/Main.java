package ade.uts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PerpustakaanService service = new PerpustakaanService();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("  SISTEM MANAJEMEN PERPUSTAKAAN  ");
            System.out.println("=================================");
            System.out.println("1.  Kelola Data Buku");
            System.out.println("2.  Kelola Data Anggota");
            System.out.println("3.  Pinjam Buku");
            System.out.println("4.  Kembalikan Buku");
            System.out.println("5.  Cari Buku");
            System.out.println("6.  Lihat Riwayat Transaksi");
            System.out.println("7.  Keluar");
            System.out.print("Pilih menu (1-7): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- MENU BUKU ---");
                    System.out.println("1. Tambah Buku");
                    System.out.println("2. Tampilkan Semua Buku");
                    System.out.println("3. Ubah Judul Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.print("Pilih: ");
                    int subBuku = scanner.nextInt();
                    scanner.nextLine();

                    if (subBuku == 1) {
                        System.out.print("Tipe (1: Fiksi, 2: Pelajaran): ");
                        int tipe = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("ID Buku: "); String id = scanner.nextLine();
                        System.out.print("Judul: "); String judul = scanner.nextLine();
                        System.out.print("Penulis: "); String penulis = scanner.nextLine();

                        if (tipe == 1) {
                            System.out.print("Genre: "); String genre = scanner.nextLine();
                            service.tambahBuku(new BukuFiksi(id, judul, penulis, genre));
                        } else {
                            System.out.print("Mata Pelajaran: "); String mapel = scanner.nextLine();
                            service.tambahBuku(new BukuPelajaran(id, judul, penulis, mapel));
                        }
                    } else if (subBuku == 2) {
                        service.tampilkanBuku();
                    } else if (subBuku == 3) {
                        System.out.print("ID Buku: "); String id = scanner.nextLine();
                        System.out.print("Judul Baru: "); String judulBaru = scanner.nextLine();
                        service.ubahBuku(id, judulBaru);
                    } else if (subBuku == 4) {
                        System.out.print("ID Buku yang mau dihapus: "); String id = scanner.nextLine();
                        service.hapusBuku(id);
                    }
                    break;

                case 2:
                    System.out.println("\n--- MENU ANGGOTA ---");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Tampilkan Anggota");
                    System.out.println("3. Ubah Nama Anggota");
                    System.out.println("4. Hapus Anggota");
                    System.out.print("Pilih: ");
                    int subAnggota = scanner.nextInt();
                    scanner.nextLine();

                    if (subAnggota == 1) {
                        System.out.print("ID Anggota: "); String idA = scanner.nextLine();
                        System.out.print("Nama Anggota: "); String namaA = scanner.nextLine();
                        service.tambahAnggota(new Anggota(idA, namaA));
                    } else if (subAnggota == 2) {
                        service.tampilkanAnggota();
                    } else if (subAnggota == 3) {
                        System.out.print("ID Anggota: "); String idA = scanner.nextLine();
                        System.out.print("Nama Baru: "); String namaBaru = scanner.nextLine();
                        service.ubahAnggota(idA, namaBaru);
                    } else if (subAnggota == 4) {
                        System.out.print("ID Anggota dihapus: "); String idA = scanner.nextLine();
                        service.hapusAnggota(idA);
                    }
                    break;

                case 3:
                    System.out.print("ID Transaksi Peminjaman: "); String idP = scanner.nextLine();
                    System.out.print("ID Anggota: "); String idA = scanner.nextLine();
                    System.out.print("ID Buku: "); String idB = scanner.nextLine();
                    System.out.print("Lama Peminjaman (Hari): "); int hari = scanner.nextInt();
                    scanner.nextLine();
                    service.pinjamBuku(idP, idA, idB, hari);
                    break;

                case 4:
                    System.out.print("ID Buku yang Dikembalikan: "); String idKembali = scanner.nextLine();
                    service.kembalikanBuku(idKembali);
                    break;

                case 5:
                    System.out.print("Masukkan ID / Kata Kunci Judul: ");
                    String q = scanner.nextLine();
                    service.cariBuku(q, true);
                    break;

                case 6:
                    service.tampilkanTransaksi();
                    break;

                case 7:
                    berjalan = false;
                    System.out.println("Terima kasih!!!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}