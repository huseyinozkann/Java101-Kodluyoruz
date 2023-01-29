import java.util.Scanner;

public class ManavKasa {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double armut = 2.14, elma =3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;

        System.out.println("Armut Kaç Kilo ? : ");
        armutkg = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        elmakg = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        domateskg = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        muzkg = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlicankg = scanner.nextDouble();

        double toplam = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg);

        System.out.println("Toplam Tutar : " + toplam + " TL");

    }
}
