import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double boy, kilo, endeks;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        endeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + endeks);

    }
}
