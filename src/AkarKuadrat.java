import java.util.Scanner;
public class AkarKuadrat {
    public static void main(String[] args) {

        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);
        // Baca data koefisien persamaan dari keyboard
        do{
            System.out.print(" Koefisien x2 (a) : ");
            a = dataKuadrat.nextDouble();
            System.out.println();
            if (a == 0 ){
                System.out.println(" Koefisien x2 (a) tidak boleh 0");
            }

        }while(a == 0);
        System.out.println(" Koefisien x (b) : ");
        b = dataKuadrat.nextDouble();
        System.out.println(" Konstanta (c) : ");
        c = dataKuadrat.nextDouble();

        // Hitung nilai D
        D = b* b - (4*a*c);

        if (D <0 || a == 0) {// tidak punya akar real
            System.out.println("Tidak mempunyai akar nyata/real");
        }
        else if (D == 0 ) {// akarnya sama
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni : "+x1);
        }
        else {// akarnya dua berbeda
            x1 = (-b + Math.sqrt(D))/ (2*a);
            x2 = (-b - Math.sqrt(D))/ (2*a);
            System.out.println("Akar pertama : "+x1);
            System.out.println("Akar kedua : "+x2);
        }
    }
}