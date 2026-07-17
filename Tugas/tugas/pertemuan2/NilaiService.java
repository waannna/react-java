package tugas.pertemuan2;

public class NilaiService {

    public double hitungNilaiAkhir(Mahasiswa m) {

        return (m.getNilaiTugas() * 0.3) + (m.getNilaiUTS() * 0.35) + (m.getNilaiUAS() * 0.35);

    }

    public String hitungGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String statusKelulusan(double nilaiAkhir) {
        return nilaiAkhir >= 60 ? "Lulus" : "Tidak Lulus";
    }
}
