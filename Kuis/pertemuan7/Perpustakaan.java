package kuis.pertemuan7;

public abstract class Perpustakaan {
    private String idItem;
    private String judul;

    public Perpustakaan(String idItem, String judul) {
        this.idItem = idItem;
        this.judul = judul;
    }

    public String getIdItem() {
        return idItem;
    }

    public String getJudul() {
        return judul;
    }

    public void tampilkanHeader() {
        System.out.println("=== INFO KOLEKSI PERPUSTAKAAN ===");
    }

    public abstract void tampilkanDetail();
}