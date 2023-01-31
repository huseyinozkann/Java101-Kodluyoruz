import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklıgını giriniz(C) : ");
        double derece = scanner.nextDouble();

        if (derece < 5){
            System.out.println("Kayak yapabilirsiniz !");
        } else if (derece >= 5 && derece < 15) {
            System.out.println("Sinemaya gidebilirsiniz !");
        } else if (derece >= 15 && derece < 25) {
            System.out.println("Piknik yapabilirsiniz !");
        } else if (derece >= 25) {
            System.out.println("Yüzebilirsiniz !");
        }else {
            System.out.println("Hatalı derece !");
        }
    }
}
