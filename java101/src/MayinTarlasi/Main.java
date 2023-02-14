package MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz !");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz : ");
        System.out.println("Satır sayısı : ");
        row = scanner.nextInt();
        System.out.println("Sütün sayıdı : ");
        column = scanner.nextInt();

        MayinTarlasi mayinTarlasi = new MayinTarlasi(row,column);
        mayinTarlasi.run();
    }
}
