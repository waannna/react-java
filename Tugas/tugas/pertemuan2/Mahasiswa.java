package tugas.pertemuan2;

public class Mahasiswa {

    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    
    public Mahasiswa(String nama, String nim,double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    
     public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiUTS() {
        return nilaiUts;
    }

    public double getNilaiUAS() {
        return nilaiUas;
    }

}