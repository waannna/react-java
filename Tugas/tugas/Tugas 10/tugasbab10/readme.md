# Sistem Manajemen Perpustakaan

## Deskripsi

Aplikasi Sistem Manajemen Perpustakaan berbasis REST API
menggunakan Java Spring Boot, Spring Data JPA, dan MySQL.

## Teknologi

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## Endpoint API

### Buku

| Method | Endpoint | Keterangan |
|---|---|---|
| POST | `/api/buku` | Menambahkan buku |
| GET | `/api/buku` | Menampilkan semua buku |
| GET | `/api/buku/{id}` | Menampilkan buku berdasarkan ID |
| PUT | `/api/buku/{id}` | Mengubah data buku |
| DELETE | `/api/buku/{id}` | Menghapus buku |

### Anggota

| Method | Endpoint | Keterangan |
|---|---|---|
| POST | `/api/anggota` | Menambahkan anggota |
| GET | `/api/anggota` | Menampilkan semua anggota |
| GET | `/api/anggota/{id}` | Menampilkan anggota berdasarkan ID |
| PUT | `/api/anggota/{id}` | Mengubah data anggota |
| DELETE | `/api/anggota/{id}` | Menghapus anggota |

## Pengujian

Seluruh endpoint telah diuji menggunakan Postman, meliputi:

- Create data
- Read semua data
- Read data berdasarkan ID
- Update data
- Delete data
- Pengujian data yang tidak ditemukan (404)

## Database

Nama database:

`tugas_perpustakaan`

## Cara Menjalankan

1. Pastikan MySQL aktif.
2. Buat database `perpustakaan`.
3. Konfigurasi koneksi database pada `application.properties`.
4. Jalankan aplikasi dengan:

```bash
mvn spring-boot:run