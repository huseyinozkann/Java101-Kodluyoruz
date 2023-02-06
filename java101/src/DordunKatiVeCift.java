import java.util.Scanner;

public class DordunKatiVeCift {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int sayi, toplam = 0;

        do {
            System.out.println("Sayi Giriniz : ");
            sayi = scanner.nextInt();

            if (sayi % 4 == 0){
                toplam += sayi;
            }
        }while (sayi % 2 != 1);

        System.out.println("4' ün katı olan sayıların toplamı :" + toplam);
    }
}
