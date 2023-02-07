import java.util.Scanner;

public class AsalSayiRecursive {
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        boolean prime = isPrime(sayi);

        if (prime == true){
            System.out.println(sayi + " asaldır !");
        }else {
            System.out.println(sayi + " asal değildir !");
        }
    }
}
