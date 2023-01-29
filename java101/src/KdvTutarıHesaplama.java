import java.util.Scanner;

public class KdvTutarıHesaplama {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        double tutar, kdvOran, kdvTutar, toplamTutar;

        System.out.println("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        if (tutar >= 1000){
            kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
        }else{
            kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
        }

        toplamTutar = kdvTutar + tutar;
        System.out.println("Toplam tutar : " + toplamTutar);


    }
}
