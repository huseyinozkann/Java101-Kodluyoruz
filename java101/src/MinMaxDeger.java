import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int x;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int sayi;

        System.out.println("Kaç tane sayı gireceksiniz : ");
        x = input.nextInt();

        for (int i = 1;i<=x;i++){
            System.out.println(i+".sayıyı giriniz : ");
            sayi = input.nextInt();

            if (sayi > max){
                max = sayi;
            }
            if (sayi < min){
                min = sayi;
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
