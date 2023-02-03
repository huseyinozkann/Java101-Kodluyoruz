import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int KM, yas,yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplamTutar;

        System.out.println("Yolculuk mesafenizi giriniz : ");
        KM = input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz : ");
        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();

        if (KM > 0 && yas > 0){
            if(yas <= 12 && yolculukTipi == 1){
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            } else if (yas <= 12 && yolculukTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)* 2.0;
                System.out.println("Toplam Tutar : " + toplamTutar);
            }else if(yas > 12 && yas <= 24 && yolculukTipi == 1){
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            } else if (yas > 12 && yas <= 24 && yolculukTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)* 2.0;
                System.out.println("Toplam Tutar : " + toplamTutar);
            }else if(yas > 65 && yolculukTipi == 1){
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            } else if (yas > 65 && yolculukTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.30;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)* 2.0;
                System.out.println("Toplam Tutar : " + toplamTutar);
            } else if (yas > 24 && yas < 65 && yolculukTipi == 1) {
                normalTutar = KM * 0.10;
                System.out.println("Toplam Tutar : " + normalTutar);
            } else if (yas > 24 && yas < 65 && yolculukTipi == 2) {
                normalTutar = KM * 0.10;
                toplamTutar = normalTutar * 2.0;
                System.out.println("Toplam Tutar : " + toplamTutar);
            }
        }else {
            System.out.println("Hatalı giriş yaptınız !");
        }
    }
}
