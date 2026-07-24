package tugas.pertemuan3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Kendaraan> daftar = new ArrayList<>();

    static HashMap<String, String> kategori = new HashMap<>();

    public static void main(String[] args) {

        int pilih;

        do {

            tampilMenu();

            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    tambah();
                    break;

                case 2:
                    tampil();
                    break;

                case 3:
                    ubah();
                    break;

                case 4:
                    hapus();
                    break;

                case 5:
                    cari();
                    break;

                case 6:
                    statistik();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");

            }

        } while (pilih != 0);

    }

    static void tampilMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("     SISTEM MANAJEMEN DATA KENDARAAN");
        System.out.println("========================================");

        System.out.println("1. Tambah Data Kendaraan");
        System.out.println("2. Lihat Seluruh Data");
        System.out.println("3. Ubah Data Kendaraan");
        System.out.println("4. Hapus Data Kendaraan");
        System.out.println("5. Cari Kendaraan");
        System.out.println("6. Statistik Kendaraan");
        System.out.println("0. Keluar");

        System.out.println("========================================");

    }

    static void tambah() {

        System.out.println("\n===== TAMBAH DATA =====");

        System.out.println("1. Mobil");
        System.out.println("2. Motor");

        System.out.print("Pilih jenis kendaraan : ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Kode Kendaraan : ");
        String kode = input.nextLine();

        System.out.print("Merk : ");
        String merk = input.nextLine();

        System.out.print("Warna : ");
        String warna = input.nextLine();

        System.out.print("Harga : ");
        double harga = input.nextDouble();
        input.nextLine();

        if (jenis == 1) {

            System.out.print("Tipe Mobil : ");
            String tipeMobil = input.nextLine();

            System.out.print("Bahan Bakar : ");
            String bahanBakar = input.nextLine();

            System.out.print("Jumlah Pintu : ");
            int jumlahPintu = input.nextInt();
            input.nextLine();

            Mobil mobil = new Mobil(
                    kode,
                    merk,
                    warna,
                    harga,
                    tipeMobil,
                    bahanBakar,
                    jumlahPintu
            );

            daftar.add(mobil);

            kategori.put(kode, "Mobil");

        } else if (jenis == 2) {

            System.out.print("Tipe Motor : ");
            String tipeMotor = input.nextLine();

            System.out.print("Bahan Bakar : ");
            String bahanBakar = input.nextLine();

            System.out.print("Transmisi : ");
            String transmisi = input.nextLine();

            Motor motor = new Motor(
                    kode,
                    merk,
                    warna,
                    harga,
                    tipeMotor,
                    bahanBakar,
                    transmisi
            );

            daftar.add(motor);

            kategori.put(kode, "Motor");

        } else {

            System.out.println("Jenis kendaraan tidak tersedia");
            return;

        }

        System.out.println("Data kendaraan berhasil ditambahkan!");

    }

    static void tampil() {

        System.out.println("\n===== SELURUH DATA KENDARAAN =====");

        if (daftar.isEmpty()) {

            System.out.println("Belum ada data kendaraan");

        } else {

            for (int i = 0; i < daftar.size(); i++) {

                System.out.println("\nData ke-" + (i + 1));

                daftar.get(i).tampilInfo();

                System.out.println(
                        "Kategori : "
                        + kategori.get(
                                daftar.get(i).getCodeKendaraan()
                        )
                );

                System.out.println("-------------------------------");

            }

        }

    }

    static void ubah() {

        System.out.print("\nMasukkan kode kendaraan : ");
        String kode = input.nextLine();

        for (Kendaraan k : daftar) {

            if (k.getCodeKendaraan().equals(kode)) {

                System.out.print("Merk baru : ");
                k.setMerk(input.nextLine());

                System.out.print("Warna baru : ");
                k.setWarna(input.nextLine());

                System.out.print("Harga baru : ");
                k.setHarga(input.nextDouble());
                input.nextLine();

                System.out.println("Data berhasil diubah");

                return;

            }
        }
        System.out.println("Data kendaraan tidak ditemukan");

    }

    static void hapus() {

        System.out.print("\nMasukkan kode kendaraan : ");
        String kode = input.nextLine();

        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i)
                    .getCodeKendaraan()
                    .equals(kode)) {
                daftar.remove(i);
                kategori.remove(kode);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }
        System.out.println("Data tidak ditemukan");

    }

    static void cari() {
        System.out.print("\nMasukkan kode kendaraan : ");
        String kode = input.nextLine();

        for (Kendaraan k : daftar) {
            if (k.getCodeKendaraan().equals(kode)) {
                System.out.println("\nData ditemukan:");
                k.tampilInfo();
                System.out.println(
                        "Kategori : "
                        + kategori.get(kode)
                );
                return;
            }
        }

        System.out.println("Kendaraan tidak ditemukan");

    }

    static void statistik() {

        int jumlahMobil = 0;
        int jumlahMotor = 0;

        for (Kendaraan k : daftar) {
            if (kategori.get(k.getCodeKendaraan())
                    .equals("Mobil")) {

                jumlahMobil++;
            } else {
                jumlahMotor++;
            }
        }

        System.out.println("\n===== STATISTIK KENDARAAN =====");
        System.out.println("Jumlah Mobil  : " + jumlahMobil);
        System.out.println("Jumlah Motor  : " + jumlahMotor);
        System.out.println("Total Data    : " + daftar.size());

    }

}
