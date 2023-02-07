import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String []args){
        int sayi;
        double sonuc = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz : ");
        sayi = scanner.nextInt();

        for (double i = 1;i <= sayi;i++){
            sonuc += (1/i);
        }
        System.out.println("Sonuç : " + sonuc);
    }
}
