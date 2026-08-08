#  Mini Project UTS - Sistem Manajemen Perpustakaan

Aplikasi Sistem Manajemen Perpustakaan berbasis **Java Console** yang dibangun menggunakan konsep Pemrograman Berorientasi Objek (OOP), Java Collections, serta Validasi Transaksi untuk memenuhi  UTS Pelatihan Java.

---

##  Fitur Utama Application

1. ** Kelola Data Buku :**
   - Menambahkan buku baru (Buku Fiksi & Buku Pelajaran).
   - Menampilkan seluruh daftar buku beserta status ketersediaannya.
   - Mengubah judul buku berdasarkan ID.
   - Menghapus data buku.

2. ** Kelola Data Anggota:**
   - Menambahkan data anggota perpustakaan baru.
   - Menampilkan daftar anggota terdaftar.
   - Mengubah nama anggota.
   - Menghapus data anggota.

3. **  Transaksi Peminjaman & Pengembalian:**
   - Pencatatan transaksi peminjaman buku oleh anggota.
   - Pengecekan otomatis ketersediaan buku dan validasi anggota.
   - Perhitungan denda keterlambatan secara otomatis (Batas peminjaman 7 hari, denda Rp 1.000/hari).
   - Pengembalian buku dan pembaruan status buku menjadi "Tersedia".

4. ** Pencarian Data :**
   - Pencarian spesifik berdasarkan ID Buku.
   - Pencarian berdasarkan kata kunci pada Judul Buku.

5. ** Validasi Data Ketat:**
   - Pencegahan duplikasi ID Buku dan ID Anggota.
   - Buku yang sedang dipinjam **tidak dapat dihapus** atau dipinjam ulang.
   - Transaksi peminjaman hanya bisa dilakukan oleh Anggota terdaftar.

---

##  Implementasi Konsep Pemrograman

- **OOP Core:** *Class, Object, Access Modifier, Encapsulation (Getter & Setter),           Constructor, Keyword `this`.*
- **Inheritance & Polymorphism:** Class `BukuFiksi` dan `BukuPelajaran` meng-override method `tampildetail()` milik class induk `ItemPerpustakaan`.
- **Abstract Class:** Class `ItemPerpustakaan` sebagai cetak biru item perpustakaan.
- **Interface:** Interface `LayananPerpustakaan` sebagai kontrak layanan sistem.
- **Method Overloading:** Method `cariBuku()` di kelas `PerpustakaanService`.
- **Java Collections:** 
  - `ArrayList` untuk mengelola daftar buku, anggota, dan riwayat transaksi.
  - `HashMap` untuk mengelola status ketersediaan buku secara *key-value*.

---

##  Struktur Folder Project


ade/
└── uts/
    ├── Anggota.java
    ├── BukuFiksi.java
    ├── BukuPelajaran.java
    ├── ItemPerpustakaan.java
    ├── LayananPerpustakaan.java
    ├── Main.java
    ├── Peminjaman.java
    └── PerpustakaanService.java
