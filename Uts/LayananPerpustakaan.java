package ade.uts;

public interface LayananPerpustakaan {

    void tambahBuku(ItemPerpustakaan buku);
    void tampilkanBuku();
    void ubahBuku(String id, String judulBaru);
    void hapusBuku(String id);

    void tambahAnggota(Anggota anggota);
    void tampilkanAnggota();
    void ubahAnggota(String id, String namaBaru);
    void hapusAnggota(String idAnggota);

    void pinjamBuku(String idPeminjaman, String idAnggota, String idBuku, int lamaHari);
    void kembalikanBuku(String idBuku);
}
