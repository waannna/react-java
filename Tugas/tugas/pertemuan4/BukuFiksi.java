package tugas.pertemuan4;

public class BukuFiksi extends ItemPerpustakaan {
    private String genre;

    public BukuFiksi(String idItem, String judul, String penulis, String genre) {
        super(idItem, judul, penulis);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void tampildetail() {
        System.out.println("ID (Fiksi): " + getIdItem());
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Genre: " + getGenre());
    }
}