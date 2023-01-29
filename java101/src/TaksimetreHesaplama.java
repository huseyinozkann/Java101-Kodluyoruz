import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilen yolun uzunluğu : ");
        double mesafe = scanner.nextDouble();

        double ucret = (mesafe * 2.20) + 10;

        double tutar = ucret < 20 ? (20) : ((mesafe * 2.20) + 10);
        System.out.println("Ücret : " + tutar);
    }
}
