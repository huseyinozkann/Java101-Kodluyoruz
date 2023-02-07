import java.util.Scanner;

public class UsluSayiAlma {
    public static void main(String []args){
        int a, b, sonuc = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayıyı giriniz : ");
        a = input.nextInt();

        System.out.println("Üs derecesini giriniz : ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++){
            sonuc = sonuc * a;
        }
        System.out.println("Sonuç : " + sonuc);
    }
}
