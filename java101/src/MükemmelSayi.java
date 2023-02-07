import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        System.out.println("Bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                toplam +=i;
            }
        }
        if (sayi == toplam){
            System.out.println(sayi + " mükemmel bir sayıdır !");
        }else {
            System.out.println(sayi + " mükemmel bir sayı değildir !");
        }
    }
}
