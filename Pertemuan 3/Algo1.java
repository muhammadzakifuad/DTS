// Program Akar
import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int a = scan.nextInt();
        int x = 1;
        int y = x * x;
        while(y != a){
            x = x + 1;
            y = x * x;
        }
        System.out.println("Akar dari Bilangan "+a+" adalah " + x);
    }
}