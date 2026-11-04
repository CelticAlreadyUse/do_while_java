public class Looping3 {
    // Program menghitung jumlah bilangan kelipatan 5 dari 5 sampai 100.
    public static void main(String[] args) {
        // Inisialisasi jumlah sebagai penampung hasil penjumlahan, dimulai dari 0.
        int jumlah = 0;

        // Inisialisasi bilangan dengan kelipatan 5 pertama yang akan dijumlahkan.
        int bilangan = 5;

        // Blok do dijalankan minimal satu kali sebelum kondisi diperiksa.
        do {
            // Tambahkan bilangan saat ini ke jumlah (sama dengan jumlah = jumlah + bilangan).
            jumlah += bilangan;

            // Naikkan bilangan sebesar 5 untuk mendapatkan kelipatan berikutnya.
            bilangan += 5;
        // Ulangi selama bilangan masih kurang dari atau sama dengan 100.
        } while (bilangan <= 100);

        // Tampilkan hasil penjumlahan seluruh kelipatan 5 tersebut, yaitu 1050.
        System.out.println("Jumlah 5 + 10 + ... + 100 = " + jumlah);
    }
}
