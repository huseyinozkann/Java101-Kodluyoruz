import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int matematik, turkce, fizik, kimya, muzik;
        int notToplam = 0, dersSayisi = 0;

        System.out.println("Matematik Notu : ");
        matematik = input.nextInt();

        System.out.println("Türkçe Notu : ");
        turkce = input.nextInt();

        System.out.println("Fizik Notu : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notu : ");
        kimya = input.nextInt();

        System.out.println("Müzik Notu : ");
        muzik = input.nextInt();

        if ((matematik > 0) && (matematik <= 100)){
            notToplam = notToplam + matematik;
            dersSayisi++;
        }

        if ((turkce > 0) && (turkce <= 100)){
            notToplam = notToplam + turkce;
            dersSayisi++;
        }

        if ((fizik > 0) && (fizik <= 100)){
            notToplam = notToplam + fizik;
            dersSayisi++;
        }

        if ((kimya > 0) && (kimya <= 100)){
            notToplam = notToplam + kimya;
            dersSayisi++;
        }

        if ((muzik > 0) && (muzik <= 100)){
            notToplam = notToplam + muzik;
            dersSayisi++;
        }

        double ortalama = notToplam / dersSayisi;

        System.out.println("ORTALAMA : " + ortalama);

        if (ortalama > 55){
            System.out.println("Geçtiniz !");
        }else {
            System.out.println("Kaldınız !");
        }


    }
}
