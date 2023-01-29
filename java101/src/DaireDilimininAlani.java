import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double r, aci, alan;
        double pi = 3.14;

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = scanner.nextDouble();

        System.out.println("Daire diliminin merkez açısını giriniz : ");
        aci = scanner.nextDouble();

        alan = (pi * r * r * aci) / 360;
        System.out.println("Daire diliminin alanı : " + alan);
    }
}
