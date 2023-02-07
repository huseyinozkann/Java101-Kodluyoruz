import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int sayi;
        int bas = 0, toplam = 0;

        System.out.println("Sayiyi Giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0){
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
            ++bas;
        }
        System.out.println("Basamak Toplamı : " + toplam);
    }
}
