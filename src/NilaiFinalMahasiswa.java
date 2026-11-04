// Locale mengatur format angka, sedangkan Scanner digunakan untuk membaca input.
import java.util.Locale;
import java.util.Scanner;

public class NilaiFinalMahasiswa {
    // Program menghitung nilai total berbobot dan menentukan nilai akhir berupa huruf.
    public static void main(String[] args) {
        // Siapkan pembaca input dari keyboard dengan titik sebagai pemisah desimal.
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Deklarasikan variabel untuk menyimpan masing-masing nilai ujian.
        double uts1;
        double uts2;
        double uas;

        // Baca nilai UTS1 minimal satu kali dan ulangi jika nilainya negatif.
        do {
            System.out.print("Masukkan UTS1: ");
            uts1 = input.nextDouble();

            if (uts1 < 0) {
                System.out.println("Nilai tidak boleh negatif.");
            }
        } while (uts1 < 0);

        // Baca nilai UTS2 dengan validasi yang sama seperti UTS1.
        do {
            System.out.print("Masukkan UTS2: ");
            uts2 = input.nextDouble();

            if (uts2 < 0) {
                System.out.println("Nilai tidak boleh negatif.");
            }
        } while (uts2 < 0);

        // Baca nilai UAS dan ulangi sampai pengguna memasukkan nilai tidak negatif.
        do {
            System.out.print("Masukkan UAS: ");
            uas = input.nextDouble();

            if (uas < 0) {
                System.out.println("Nilai tidak boleh negatif.");
            }
        } while (uas < 0);

        // Hitung nilai total dengan bobot UTS1 30%, UTS2 30%, dan UAS 40%.
        double total = 0.30 * uts1 + 0.30 * uts2 + 0.40 * uas;

        // Periksa batas nilai dari yang tertinggi agar kategori huruf sesuai:
        // A: total >= 80; B: 65 <= total < 80; C: 55 <= total < 65;
        // D: 50 <= total < 55; E: total < 50.
        char huruf;
        if (total >= 80) {
            huruf = 'A';
        } else if (total >= 65) {
            huruf = 'B';
        } else if (total >= 55) {
            huruf = 'C';
        } else if (total >= 50) {
            huruf = 'D';
        } else {
            huruf = 'E';
        }

        // Tampilkan total dengan dua angka di belakang desimal (%.2f) dan huruf (%c).
        // %n digunakan untuk berpindah ke baris baru.
        System.out.printf(Locale.US,
                "Nilai total: %.2f%nNilai final: %c%n", total, huruf);
    }
}
