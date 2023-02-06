import java.util.Scanner;

public class UceVeDordeBolunenSayiOrtalama {
    public static void main(String []args){
        int sayi, toplam = 0, x = -1;
        Scanner input = new Scanner(System.in);
        double ortalama;

        System.out.println("Sayi Giriniz : ");
        sayi = input.nextInt();

        for (int i= 0; i <= sayi ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam = toplam + i;
                //toplam+=i
                x++;
            }
        }
        ortalama = toplam / x;
        System.out.println("3'e ve 4' e tam bölünen sayıların toplamının ortalaması : " +ortalama);
    }
}
