package ade.uts;

public class BukuPelajaran extends ItemPerpustakaan {
    private String mataPelajaran;

    public BukuPelajaran(String idItem, String judul, String penulis, String mataPelajaran) {
        super(idItem, judul, penulis);
        this.mataPelajaran = mataPelajaran;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void tampildetail() {
        System.out.println("ID (Buku Pelajaran): " + getIdItem());
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Mata Pelajaran: " + getMataPelajaran());
    }
}