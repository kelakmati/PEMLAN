# 🛒 Program Hitung Total Belanja Online

## 📘 Deskripsi
Program ini merupakan aplikasi sederhana berbasis **Java** untuk menghitung total belanja online.  
Pengguna dapat memasukkan daftar barang yang dibeli, lengkap dengan **nama barang**, **harga**, dan **jumlah pembelian**.  
Program akan menghitung total harga, memberikan **diskon otomatis** berdasarkan total belanja, dan menampilkan **struk pembayaran akhir** dengan format mata uang rupiah.

---

## ⚙️ Fitur Program
✅ Input nama, harga, dan jumlah barang  
✅ Validasi input agar hanya menerima angka pada harga dan jumlah  
✅ Perhitungan **subtotal per barang**  
✅ Perhitungan **diskon otomatis**:
- Diskon **10%** jika total ≥ Rp500.000
- Diskon **5%** jika total ≥ Rp300.000  
  ✅ Menampilkan **struk belanja** (total, diskon, dan total bayar)  
  ✅ Menggunakan **JavaDoc** untuk dokumentasi kode  
  ✅ Format tampilan harga menggunakan `DecimalFormat`

---

## 🧠 Struktur Kelas
### 1. `Barang`
Merepresentasikan data setiap barang dalam belanjaan.
- **Atribut:** `nama`, `harga`, `jumlah`
- **Method:**
    - `getSubtotal()` → Menghitung total harga per barang
    - `getNama()` → Mengambil nama barang

### 2. `Sesudah` (Kelas Utama)
Menangani input pengguna, logika perhitungan, dan tampilan hasil.
- `inputAngka()` → Validasi input agar hanya angka
- `hitungTotal()` → Menjumlahkan seluruh subtotal barang
- `hitungDiskon()` → Memberikan diskon sesuai total
- `tampilkanStruk()` → Menampilkan hasil akhir dalam format rupiah

---

## 💻 Cara Menjalankan Program
1. Pastikan sudah terinstal **Java Development Kit (JDK 17 atau lebih baru)**.
2. Simpan file dengan nama `Sesudah.java`.
3. Jalankan perintah berikut di terminal:
   ```bash
   javac Sesudah.java
   java Sesudah
