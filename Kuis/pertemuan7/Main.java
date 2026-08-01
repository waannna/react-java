package kuis.pertemuan7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Buku buku1 = new Buku("B001", "Pemrograman C", "Dearma");
        Buku buku2 = new Buku("B002", "Pemrograman Java", "Dearma");
        Majalah majalah1 = new Majalah("M001", "Majalah Teknologi", 5);

        Scanner scanner = new Scanner(System.in);
        boolean x = true;

        while (x) {
            System.out.println("==========================================");
            System.out.println("        SISTEM PERPUSTAKAAN    ");
            System.out.println("==========================================\n");
            System.out.println("1. Tampilkan Semua Detail Koleksi  Perpustakaan");
            System.out.println("2. Pinjam Buku ");
            System.out.println("3. Pinjam Buku Dengan Durasi ");
            System.out.println("4. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DETAIL KOLEKSI ---");
                    buku1.tampilkanDetail();
                    buku2.tampilkanDetail();
                    majalah1.tampilkanDetail();
                    break;

                case 2:
                    System.out.println("\n--- PEMINJAMAN STANDAR ---");
                    System.out.print("Masukkan nama peminjam untuk Buku 1: ");
                    String peminjam1 = scanner.nextLine();
                    buku1.pinjam(peminjam1); 
                    break;

                case 3:
                    System.out.println("\n--- PEMINJAMAN DENGAN DURASI (OVERLOADING) ---");
                    System.out.print("Masukkan nama peminjam untuk Buku 2: ");
                    String peminjam2 = scanner.nextLine();
                    System.out.print("Masukkan durasi peminjaman (hari): ");
                    int durasi = scanner.nextInt();
                    buku2.pinjam(peminjam2, durasi); 
                    break;

                case 4:
                    System.out.println("\n--- PENGEMBALIAN BUKU ---");
                    buku1.kembalikan(); 
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem perpustakaan!");
                    x = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak valid");
                    break;
            }
        }

        scanner.close();
    }
}