package tugas.pertemuan4;

public interface LayananPerpustakaan {

    void tambahBuku(ItemPerpustakaan buku);
    void tampilkanBuku();
    void ubahBuku(String id, String judulBaru);
    void hapusBuku(String id);
}