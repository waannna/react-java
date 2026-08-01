package kuis.pertemuan7;

public class Buku extends Perpustakaan implements Peminjaman {
    private String penulis;
    private boolean statusDipinjam;

    public Buku(String idItem, String judul, String penulis) {
        super(idItem, judul);
        this.penulis = penulis;
        this.statusDipinjam = false;
    }

    @Override
    public void pinjam(String namaPeminjam) {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println("Buku " + getJudul() + " berhasil dipinjam oleh " + namaPeminjam + ".");
        } else {
            System.out.println("Buku " + getJudul() + " sedang dipinjam.");
        }
    }

    public void pinjam(String namaPeminjam, int durasiHari) {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println("Buku " + getJudul() + " berhasil dipinjam oleh " + namaPeminjam + " selama " + durasiHari + " hari.");
        } else {
            System.out.println("Buku " + getJudul() + " sedang dipinjam.");
        }
    }

    @Override
    public void kembalikan() {
        if (statusDipinjam) {
            statusDipinjam = false;
            System.out.println("Buku " + getJudul() + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku " + getJudul() + " tidak sedang dipinjam.");
        }
    }

    @Override
    public void tampilkanDetail() {
        tampilkanHeader();
        System.out.println("Jenis   : Buku");
        System.out.println("ID      : " + getIdItem());
        System.out.println("Judul   : " + getJudul());
        System.out.println("Penulis : " + penulis);
        System.out.println("Status  : " + (statusDipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println("---------------------------------");
    }
}