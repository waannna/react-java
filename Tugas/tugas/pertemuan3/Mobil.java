package tugas.pertemuan3;

public class Mobil extends Kendaraan {

    private String mobilTipe;
    private String bahanBakar;
    private int jumlahPintu;

    public Mobil(
            String codeKendaraan,
            String merk,
            String warna,
            double harga,
            String mobilTipe,
            String bahanBakar,
            int jumlahPintu
    ) {

        super(codeKendaraan, merk, warna, harga);

        this.mobilTipe = mobilTipe;
        this.bahanBakar = bahanBakar;
        this.jumlahPintu = jumlahPintu;

    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Informasi Mobil ===");
        super.tampilInfo();
        System.out.println("Tipe Mobil: " + mobilTipe);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public String getTipeMobil() {
        return mobilTipe;
    }

    public void setTipeMobil(String tipeMobil) {
        this.mobilTipe = tipeMobil;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

}
