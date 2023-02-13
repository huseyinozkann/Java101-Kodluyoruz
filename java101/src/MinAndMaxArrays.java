import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxArrays {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int[] array = {6,7,12,-8,75,20,-3,4,40,10};
        Arrays.sort(array);

        int min = array[0];
        int max = array[0];

        System.out.println("Girilen Sayı : ");
        number = scanner.nextInt();

        for (int i=0; i<array.length;i++){
            if (array[i] < number){
                min = array[i];
            }
            if (array[i] > number){
                max = array[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
