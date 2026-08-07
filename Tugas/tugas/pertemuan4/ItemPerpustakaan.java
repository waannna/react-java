package tugas.pertemuan4;

public abstract class ItemPerpustakaan {
    private String idItem;
    private String judul;
    private String penulis;

    public ItemPerpustakaan(String idItem, String judul, String penulis) {
        this.idItem = idItem;
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getIdItem() {
        return idItem;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String setidItem(String idItem) {
        this.idItem = idItem;
        return idItem;
    }

    public String setJudul(String judul) {
        this.judul = judul;
        return judul;
    }

    public String setPenulis(String penulis) {
        this.penulis = penulis;
        return penulis;
    }

    public abstract void tampildetail();

}