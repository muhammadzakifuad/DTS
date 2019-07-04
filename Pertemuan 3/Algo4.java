   // Project Name : Program Mengecek Bilangan di antara 2 bilangan
import java.util.Scanner;

public class Algo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama : ");
        int bil_a = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        int bil_b = input.nextInt();
        if(bil_a == bil_b){
            System.out.println("Bilangan Pertama dan Kedua sama");
        } else if(bil_a > bil_b){
            System.out.println("Bilangan Pertama lebih besar dari Bilangan Kedua");
        } else {
            System.out.println("Bilangan Pertama lebih kecil dari Bilangan Kedua");
        }
    }
}