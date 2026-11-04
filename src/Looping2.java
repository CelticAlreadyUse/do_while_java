public class Looping2 {
    // Program menampilkan bilangan 1 sampai 20 menggunakan perulangan do-while.
    public static void main(String[] args) {
        // Inisialisasi bilangan sebagai nilai awal perulangan.
        int bilangan = 1;

        // Blok do dijalankan minimal satu kali sebelum kondisi diperiksa.
        do {
            // Cetak bilangan tanpa berpindah baris.
            System.out.print(bilangan);

            // Tambahkan pemisah koma dan spasi, kecuali setelah bilangan terakhir (20).
            if (bilangan < 20) System.out.print(", ");

            // Naikkan nilai bilangan sebesar 1 untuk iterasi berikutnya.
            bilangan++;
        // Ulangi selama bilangan masih kurang dari atau sama dengan 20.
        } while (bilangan <= 20);

        // Pindah ke baris baru setelah seluruh bilangan selesai ditampilkan.
        System.out.println();
    }
}
