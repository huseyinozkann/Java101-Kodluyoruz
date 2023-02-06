import java.util.Scanner;

public class DordunBesinKuvvetleri {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int sayi;

        System.out.println("Bir sınır giriniz : ");
        sayi = scanner.nextInt();

        for (int i = 1; i<=sayi;i=i * 4){
            System.out.println("Girilen sayıdan küçük 4' ün katları : " +i);
        }
        System.out.println("----------------------------------------");
        for (int j = 1; j<=sayi;j=j * 5){
            System.out.println("Girilen sayıdan küçük 5' in katları : " +j);
        }
    }
}
