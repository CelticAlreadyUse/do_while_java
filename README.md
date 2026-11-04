# Modul 14 — Perulangan Do-While

Kumpulan latihan Java untuk praktikum Algoritma dan Pemrograman Dasar tentang perulangan `do-while`. Materi mencakup pencetakan deret, penjumlahan, validasi masukan, perhitungan akar persamaan kuadrat, nilai mahasiswa, dan klasifikasi mangga.

## Konsep dasar

Blok `do` dijalankan terlebih dahulu, kemudian kondisi `while` diperiksa. Dengan demikian, badan perulangan selalu dijalankan minimal satu kali.

```java
int bilangan = 1;
do {
    System.out.println(bilangan);
    bilangan++;
} while (bilangan <= 15);
```

## Isi repositori

Setiap kelas berikut memiliki titik masuk sendiri dan dapat dijalankan secara terpisah.

| Berkas | Kegunaan |
| --- | --- |
| [Looping1.java](src/Looping1.java) | Menampilkan bilangan 1–15. |
| [Looping2.java](src/Looping2.java) | Menampilkan bilangan 1–20. |
| [Looping3.java](src/Looping3.java) | Menjumlahkan kelipatan 5 dari 5 hingga 100; hasilnya 1050. |
| [AkarKuadrat.java](src/AkarKuadrat.java) | Menghitung akar real persamaan kuadrat dan memberi pesan jika tidak ada akar real. |
| [AkarPersamaanKuadrat.java](src/AkarPersamaanKuadrat.java) | Menghitung akar real berbeda, akar kembar, atau akar kompleks; koefisien `a = 0` diminta ulang. |
| [NilaiFinalMahasiswa.java](src/NilaiFinalMahasiswa.java) | Menghitung nilai total dari 30% UTS1, 30% UTS2, dan 40% UAS, lalu menentukan nilai huruf. |
| [KualitasMangga.java](src/KualitasMangga.java) | Menghitung jumlah mangga per kategori berdasarkan beratnya. |

Berkas tanpa ekstensi di `src/` berisi pseudocode: `1sampai15`, `1sampai20`, `5sampai100`, `nilaiUts`, `pseudocode_akar`, dan `statistik`. Pseudocode statistik belum memiliki implementasi `StatistikSederhana.java`. Berkas `Looping4.java` juga belum tersedia.

`Main.java` merupakan template awal IntelliJ IDEA, terpisah dari latihan di atas. Konfigurasi proyek IntelliJ terdapat pada `.idea/` dan `doWhile.iml`.

## Cara menjalankan

Siapkan JDK dan pastikan perintah `java` serta `javac` tersedia. Latihan pada tabel dapat dikompilasi dengan JDK 21 atau lebih baru. Konfigurasi IntelliJ saat ini menunjuk OpenJDK 26; sesuaikan Project SDK dengan JDK yang terpasang. Template `Main.java` menggunakan bentuk main ringkas dan `IO` dari Java versi lebih baru, sehingga tidak disertakan dalam perintah kompilasi latihan berikut.

Clone repositori dan masuk ke direktorinya:

```sh
git clone https://github.com/CelticAlreadyUse/modul_14_do-while.git
cd modul_14_do-while
```

Kompilasi satu latihan dari direktori utama repositori, lalu jalankan nama kelasnya tanpa ekstensi:

```sh
mkdir -p out
javac -d out src/Looping1.java
java -cp out Looping1
```

Contoh keluaran:

```text
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
```

Untuk program interaktif, gunakan cara yang sama dan masukkan nilai saat diminta:

```sh
javac -d out src/AkarPersamaanKuadrat.java
java -cp out AkarPersamaanKuadrat
```

Masukkan `a = 1`, `b = -3`, dan `c = 2` secara berurutan. Hasil akhirnya:

```text
Dua akar real: x1=2.00, x2=1.00
```

Di IntelliJ IDEA, buka proyek, atur Project SDK, lalu jalankan metode `main` pada kelas latihan yang dipilih.

## Aturan masukan

- `AkarPersamaanKuadrat`, `NilaiFinalMahasiswa`, dan `KualitasMangga` memakai titik sebagai pemisah desimal, misalnya `749.99`. `AkarKuadrat` mengikuti locale bawaan komputer.
- Nilai ujian negatif diminta ulang. Nilai huruf: A untuk total ≥ 80, B untuk ≥ 65, C untuk ≥ 55, D untuk ≥ 50, dan E untuk total < 50. Program belum membatasi nilai maksimum ke 100.
- Jumlah mangga dan berat setiap mangga harus positif. Kategori BIASA untuk berat < 500 gram, BAGUS untuk 500 ≤ berat < 750 gram, dan UNGGUL untuk berat > 750 gram. Berat tepat 750 gram dicatat sebagai BELUM TERKLASIFIKASI.
- Masukkan data numerik sesuai petunjuk. Masukan berupa teks belum ditangani oleh program yang menggunakan `Scanner`.

Hasil kompilasi disimpan di `out/`, yang sudah dikecualikan melalui `.gitignore`.
