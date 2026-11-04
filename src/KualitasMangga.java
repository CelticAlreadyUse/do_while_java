// Locale mengatur format angka, sedangkan Scanner digunakan untuk membaca input.
import java.util.Locale;
import java.util.Scanner;

public class KualitasMangga {
    // Program menghitung jumlah mangga pada setiap kategori berdasarkan beratnya.
    public static void main(String[] args) {
        // Siapkan pembaca input dari keyboard dengan titik sebagai pemisah desimal.
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Jumlah mangga harus lebih dari 0 agar ada data yang dapat diproses.
        int n;
        // Minta jumlah mangga minimal satu kali dan ulangi jika n masih 0 atau negatif.
        do {
            System.out.print("Jumlah mangga (>0): ");
            n = input.nextInt();
        } while (n <= 0);

        // Inisialisasi penghitung setiap kategori dengan nilai 0.
        int biasa = 0, bagus = 0, unggul = 0, belum = 0;
        // Penghitung urutan mangga dimulai dari 1.
        int i = 1;

        // Perulangan luar memproses seluruh mangga satu per satu sebanyak n kali.
        do {
            double berat;
            // Perulangan dalam meminta ulang berat sampai nilainya lebih dari 0.
            do {
                System.out.print("Berat mangga ke-" + i + " (gram): ");
                berat = input.nextDouble();
                // Tanda ! membalik kondisi: tampilkan pesan jika berat tidak lebih dari 0.
                if (!(berat > 0)) System.out.println("Berat harus > 0.");
            } while (!(berat > 0));

            // Tambahkan 1 pada penghitung kategori yang sesuai dengan berat mangga:
            // BIASA: berat < 500 gram; BAGUS: 500 <= berat < 750 gram;
            // UNGGUL: berat > 750 gram; tepat 750 gram masuk kategori belum terklasifikasi.
            if (berat < 500) biasa++;
            else if (berat < 750) bagus++;
            else if (berat > 750) unggul++;
            else belum++; // Tepat 750 g: tidak tercakup di soal.
            // Naikkan urutan mangga untuk iterasi berikutnya.
            i++;
        } while (i <= n);

        // Tampilkan jumlah mangga yang telah dihitung pada setiap kategori.
        System.out.println("BIASA: " + biasa);
        System.out.println("BAGUS: " + bagus);
        System.out.println("UNGGUL: " + unggul);
        System.out.println("BELUM TERKLASIFIKASI (750 g): " + belum);
    }
}
