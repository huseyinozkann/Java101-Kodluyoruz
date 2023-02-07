import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n,r,comb;

        System.out.println("n = ");
        n = input.nextInt();

        System.out.println("r = ");
        r = input.nextInt();
        comb= faktoriyel(n) / (faktoriyel(r) * faktoriyel((n - r)));
        System.out.println("Kombinasyon : " + comb);


    }
    public static int faktoriyel(int sayi){
        int fact = 1, sonuc = 0;
        for (int i = sayi; i>=1;i--){
            fact = fact * i;
            sonuc += fact;
        }
        return fact;
    }
}
