import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Satır Sayısı : ");
        a = scanner.nextInt();

        System.out.println("Sütün Sayısı : ");
        b = scanner.nextInt();

        int[][] matris = new int[a][b];
        int[][] transpoz = new int[a][b];

        for (int i = 0; i < a ; i++){
            for (int j = 0 ; j < b; j++){
                System.out.println((i+1) + " X " + (j+1)+ " sayıyı gir : ");
                matris[i][j] = scanner.nextInt();
                transpoz[i][j] = matris[i][j];
            }
        }
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("-------Matris--------");
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println("-------Transpozu--------");
                System.out.print(transpoz[j][i] + "\t");
            }
            System.out.println(" ");
        }

    }
}
