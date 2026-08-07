package tugas.pertemuan4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PerpustakaanService perpustakaan = new PerpustakaanService();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("  SISTEM MANAJEMEN PERPUSTAKAAN  ");
            System.out.println("=================================");
            System.out.println("1.  Tambah Buku");
            System.out.println("2.  Tampilkan Semua Buku");
            System.out.println("3.  Ubah Judul Buku");
            System.out.println("4.  Hapus Buku");
            System.out.println("5.  Cari Buku ");
            System.out.println("6.  Keluar");
            System.out.print("Pilih menu (1-6): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Pilih Tipe Buku ---");
                    System.out.println("1. Buku Fiksi");
                    System.out.println("2. Buku Pelajaran");
                    System.out.print("Pilihan: ");
                    int tipe = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan ID Buku: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = scanner.nextLine();

                    if (tipe == 1) {
                        System.out.print("Masukkan Genre: ");
                        String genre = scanner.nextLine();
                        perpustakaan.tambahBuku(new BukuFiksi(id, judul, penulis, genre));
                    } else if (tipe == 2) {
                        System.out.print("Masukkan Mata Pelajaran: ");
                        String mapel = scanner.nextLine();
                        perpustakaan.tambahBuku(new BukuPelajaran(id, judul, penulis, mapel));
                    } else {
                        System.out.println(" Tipe buku tidak valid.");
                    }
                    break;

                case 2:
                    perpustakaan.tampilkanBuku();
                    break;

                case 3:
                    System.out.print("Masukkan ID Buku yang ingin diubah: ");
                    String idUbah = scanner.nextLine();
                    System.out.print("Masukkan Judul Baru: ");
                    String judulBaru = scanner.nextLine();
                    perpustakaan.ubahBuku(idUbah, judulBaru);
                    break;

                case 4:
                    System.out.print("Masukkan ID Buku yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    perpustakaan.hapusBuku(idHapus);
                    break;

                case 5:
                    System.out.println("\n--- Cari Buku ---");
                    System.out.println("1. Cari berdasarkan ID");
                    System.out.println("2. Cari berdasarkan Judul");
                    System.out.print("Pilih: ");
                    int optCari = scanner.nextInt();
                    scanner.nextLine();

                    if (optCari == 1) {
                        System.out.print("Masukkan ID: ");
                        String cId = scanner.nextLine();
                        perpustakaan.cariBuku(cId);
                    } else if (optCari == 2) {
                        System.out.print("Masukkan Kata Kunci Judul: ");
                        String cJudul = scanner.nextLine();
                        perpustakaan.cariBuku(cJudul, true);
                    }
                    break;

                case 6:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
