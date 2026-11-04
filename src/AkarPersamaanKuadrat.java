// Locale mengatur format angka, sedangkan Scanner digunakan untuk membaca input.
import java.util.Locale;
import java.util.Scanner;

public class AkarPersamaanKuadrat {
    // Program mencari akar persamaan kuadrat berbentuk ax² + bx + c = 0.
    public static void main(String[] args) {
        // Buat pembaca input dari keyboard dengan titik sebagai pemisah desimal.
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Koefisien a harus bukan 0 agar persamaan merupakan persamaan kuadrat.
        double a;
        // Minta input minimal satu kali dan ulangi jika pengguna memasukkan a = 0.
        do {
            System.out.print("Koefisien a (tidak boleh 0): ");
            a = input.nextDouble();
            if (a == 0) System.out.println("a harus bukan 0.");
        } while (a == 0);

        // Baca koefisien b dan c yang boleh bernilai 0.
        System.out.print("Koefisien b: ");
        double b = input.nextDouble();
        System.out.print("Koefisien c: ");
        double c = input.nextDouble();

        // Hitung diskriminan D = b² - 4ac untuk menentukan jenis akar.
        double d = b * b - 4 * a * c;
        if (d > 0) {
            // D positif menghasilkan dua akar real berbeda dengan rumus kuadrat.
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            // %.2f menampilkan dua angka di belakang desimal; %n membuat baris baru.
            System.out.printf(Locale.US,
                    "Dua akar real: x1=%.2f, x2=%.2f%n", x1, x2);
        } else if (d == 0) {
            // D = 0 menghasilkan dua akar real yang sama (akar kembar).
            double x = -b / (2 * a);
            System.out.printf(Locale.US, "Akar kembar: x=%.2f%n", x);
        } else {
            // D negatif menghasilkan pasangan akar kompleks: real ± imag × i,
            // dengan i sebagai satuan imajiner yang memenuhi i² = -1.
            double real = -b / (2 * a);
            // Gunakan -D agar nilai di dalam akar positif dan nilai mutlak
            // penyebut agar besar bagian imajiner selalu positif.
            double imag = Math.sqrt(-d) / Math.abs(2 * a);
            System.out.printf(Locale.US,
                    "Akar kompleks: %.2f + %.2fi dan %.2f - %.2fi%n",
                    real, imag, real, imag);
        }
    }
}
