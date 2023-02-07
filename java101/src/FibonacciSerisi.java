import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, n;

        System.out.println("N Sayısını Giriniz : ");
        n = scanner.nextInt();

        System.out.println(n1+" "+n2);
        for (i=2;i<n;++i){
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
