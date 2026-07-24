package tugas.pertemuan3;


public class Kendaraan {
    private String codeKendaraan;
    private String merk;
    private String warna;
    private double harga;

    public Kendaraan( String codeKendaraan, String merk, String warna, double harga) {
        this.codeKendaraan = codeKendaraan;
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public String getCodeKendaraan() {
        return codeKendaraan;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setCodeKendaraan(String codeKendaraan) {
        this.codeKendaraan = codeKendaraan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Kode Kendaraan: " + codeKendaraan);
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
    }


}