import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin Elemanlarını giriniz : ");

        for (int i = 0; i < list.length; i++){
            System.out.println((i+1)+". Eleman : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
