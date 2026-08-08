package ade.uts;

public class Peminjaman {

    private String idPeminjaman;
    private Anggota anggota;
    private ItemPerpustakaan buku;
    private int lamaHari;
    private double denda;

    public Peminjaman(String idPeminjaman, Anggota anggota, ItemPerpustakaan buku, int lamaHari) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
        this.lamaHari = lamaHari;
        this.denda = hitungDenda(lamaHari);

    }

    public double hitungDenda(int hari) {
        int batasHari = 7;
        int dendaPerHari = 1000;
        if (hari > batasHari) {
            return (hari - batasHari) * dendaPerHari;
        } else {
            return 0;
        }

    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public ItemPerpustakaan getBuku() {
        return buku;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public double getDenda() {
        return denda;
    }

    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi: " + idPeminjaman
                + " | Peminjam: " + anggota.getNama()
                + " | Buku: " + buku.getJudul()
                + " | Durasi: " + lamaHari + " Hari"
                + " | Denda: Rp " + denda);
    }
}
