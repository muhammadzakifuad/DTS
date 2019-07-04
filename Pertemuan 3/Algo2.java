// Program Ganjil / Genap
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int x = scan.nextInt();
        if((x % 2 == 0)){
            System.out.println("Bilangan "+x+" adalah bilangan Genap");
        } else {
            System.out.println("Bilangan "+x+" adalah bilangan Ganjil");
        }
    }
}