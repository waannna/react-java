package tugas.pertemuan2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlah;
        String nama, nim;
        double nilaiTugas, nilaiUTS, nilaiUAS;

        System.out.print("jumlah mahasiswa: ");
        jumlah = input.nextInt();
        input.nextLine();

        Mahasiswa[] dataMahasiswa = new Mahasiswa[jumlah];
        int jumlahMahasiswa = 0;

        while (jumlahMahasiswa < jumlah) {

            System.out.println("\nData Mahasiswa ke-" + (jumlahMahasiswa + 1));

            System.out.print("Nama: ");
            nama = input.nextLine();

            System.out.print("NIM: ");
            nim = input.nextLine();

            System.out.print("Nilai Tugas: ");
            nilaiTugas = input.nextDouble();

            System.out.print("Nilai UTS: ");
            nilaiUTS = input.nextDouble();

            System.out.print("Nilai UAS: ");
            nilaiUAS = input.nextDouble();
            input.nextLine();

            dataMahasiswa[jumlahMahasiswa] = new Mahasiswa(nama, nim, nilaiTugas, nilaiUTS, nilaiUAS);
            jumlahMahasiswa++;

        }

        NilaiService nilaiService = new NilaiService();

        System.out.println("\n========================================");
        System.out.println("Hasil Perhitungan Nilai Akhir Mahasiswa:");
        System.out.println("========================================");

        for (int i = 0; i < jumlah; i++) {
            Mahasiswa mahasiswa = dataMahasiswa[i];
            double nilaiAkhir = nilaiService.hitungNilaiAkhir(mahasiswa);
            String grade = nilaiService.hitungGrade(nilaiAkhir);
            String statusKelulusan = nilaiService.statusKelulusan(nilaiAkhir);

            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Grade: " + grade);
            System.out.println("Status Kelulusan: " + statusKelulusan);
            System.out.println();
        }
    }
}
