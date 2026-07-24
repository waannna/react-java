package  latihan.per3;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class User {

    public static void main(String[] args) {
        // Inisialisasi ArrayList
        // ArrayList<String> list = new ArrayList<>();

        // // Menambahkan data ke dalam ArrayList
        // list.add("Ade");
        // list.add("Ahmad");
        // list.add("Ali");
        // list.add("Fadlan");
        // // Menampilkan data sebelum dilakukan manipulasi indeks
        // System.out.println("Before update");
        // System.out.println(list);
        // // Melakukan update data pada indeks ke-1 menggunakan method set()
        // list.set(1, "Shani");
        // // Menampilkan data setelah dilakukan update
        // System.out.println("After remove");
        // System.out.println(list);
        HashMap<String, String> days = new HashMap<String, String>();

        days.put("senin", "Menghapal vocab");
        days.put("selasa", "Hapalan vocab");
        days.put("rabu", "Ada tes vocab");
        days.put("kamis", "Pengumuman nilai vocab");
        days.put("jumat", "Kecewa dengan pengumuman vocab");
        days.put("sabtu", "Dikasih vocab baru");
        days.put("minggu", "Aku suka vocab :)");

        for (Map.Entry<String, String> x : days.entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }

    }
}
