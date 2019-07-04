// Program Hitung Luas dan Keliling Lingkaran
import java.util.Scanner;

public class Algo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r, luas, keliling;
        System.out.print("Masukkan Jari-Jari : ");
        r = input.nextDouble();
        luas = 0.5 * phi * r * r;
        keliling = 2 * phi * r;
        System.out.println("Luas Lingkaran = " + (int)luas + " dan Keliling Lingkaran = "+ (int)keliling);
    }
}