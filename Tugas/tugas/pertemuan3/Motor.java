package tugas.pertemuan3;

public class Motor extends Kendaraan {

    private String motorTipe;
    private String bahanBakar;
    private String transmisiMotor;

    public Motor(
            String codeKendaraan,
            String merk,
            String warna,
            double harga,
            String motorTipe,
            String bahanBakar,
            String transmisiMotor
    ) {

        super(codeKendaraan, merk, warna, harga);

        this.motorTipe = motorTipe;
        this.bahanBakar = bahanBakar;
        this.transmisiMotor = transmisiMotor;

    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Informasi Motor ===");
        super.tampilInfo();
        System.out.println("Tipe Motor: " + motorTipe);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Transmisi: " + transmisiMotor);
    }

    public String getTipeMotor() {
        return motorTipe;
    }

    public void setTipeMotor(String tipeMotor) {
        this.motorTipe = tipeMotor;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getTransmisiMotor() {
        return transmisiMotor;
    }

    public void setTransmisiMotor(String transmisiMotor) {
        this.transmisiMotor = transmisiMotor;
    }

}
