package kuis.pertemuan7;

public class Majalah extends Perpustakaan {

    private int edisi;

    public Majalah(String idItem, String judul, int edisi) {
        super(idItem, judul);
        this.edisi = edisi;
    }

    @Override
    public void tampilkanDetail() {
        tampilkanHeader();
        System.out.println("Jenis   : Majalah (Hanya Baca di Tempat)");
        System.out.println("ID      : " + getIdItem());
        System.out.println("Judul   : " + getJudul());
        System.out.println("Edisi   : No. " + edisi);
        System.out.println("---------------------------------");
    }
}