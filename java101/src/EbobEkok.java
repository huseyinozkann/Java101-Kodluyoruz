import java.util.Scanner;

public class EbobEkok {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,ebob = 0,ekok,sayac = 1;

        System.out.println("1.Sayıyı Giriniz : ");
        sayi1 = input.nextInt();

        System.out.println("2.Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        while (sayac <= sayi1 || sayac <= sayi2){
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0){
                if (sayac > ebob){
                    ebob = sayac;
                }
            }
            sayac++;
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
