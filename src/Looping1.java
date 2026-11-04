public class Looping1 {
    // Program menampilkan bilangan 1 sampai 15 menggunakan perulangan do-while.
    public static void main(String[] args) {
        // Inisialisasi bilangan sebagai nilai awal perulangan.
        int bilangan = 1;

        // Blok do dijalankan minimal satu kali sebelum kondisi diperiksa.
        do {
            // Cetak bilangan tanpa berpindah baris.
            System.out.print(bilangan);

            // Tambahkan pemisah koma dan spasi, kecuali setelah bilangan terakhir (15).
            if (bilangan < 15) System.out.print(", ");

            // Naikkan nilai bilangan sebesar 1 untuk iterasi berikutnya.
            bilangan++;
        // Ulangi selama bilangan masih kurang dari atau sama dengan 15.
        } while (bilangan <= 15);

        // Pindah ke baris baru setelah seluruh bilangan selesai ditampilkan.
        System.out.println();
    }
}
