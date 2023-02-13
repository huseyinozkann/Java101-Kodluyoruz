public class HarmonikOrtalama {
    public static void main(String []args){
        double[] numbers = {2.0,5.0,11.0,7.0};
        double sum = 0;

        for (int i = 0; i < numbers.length;i++){
            sum += 1 / numbers[i];
        }

        double avarage = numbers.length / sum;

        System.out.println("Harmonik Seri : " +sum);
        System.out.println("Harmonik Ortalama : " + avarage);
    }
}
