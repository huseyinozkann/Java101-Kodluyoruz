import java.util.Scanner;

public class UstAlma2 {
    public static void power(){
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz : ");
        int sayi = input.nextInt();

        System.out.println("Üssü giriniz : ");
        int us = input.nextInt();

        int sonuc = 1;

        for (int i=1;i<=us;i++){
            sonuc *=sayi;
        }
        System.out.println("Sonuç : " + sonuc);
    }
    public static void main(String []args){
        power();
    }
}
