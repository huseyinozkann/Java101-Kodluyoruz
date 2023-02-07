import java.util.Scanner;

public class TersUcgen {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {

            for (int j = 1; j <= 1*i+1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <= 2*(sayi-i); k++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
