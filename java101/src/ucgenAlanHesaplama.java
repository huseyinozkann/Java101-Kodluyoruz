import java.util.Scanner;

public class ucgenAlanHesaplama {
    public static void main(String []args){
        double a, b, c, u, alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kenarı giriniz : ");
        a = scanner.nextDouble();

        System.out.println("2.kenarı giriniz : ");
        b = scanner.nextDouble();

        System.out.println("3.kenarı giriniz : ");
        c = scanner.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);


    }
}
