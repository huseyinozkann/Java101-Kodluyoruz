public class ArrayFrekansi {
    public static void main(String []args){
        int[] arr = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] tekrar = new int[arr.length];

        int visited = -1;

        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    tekrar[j] = visited;
                }
            }
            if (tekrar[i] != visited){
                tekrar[i] = count;
            }
        }
        for (int i = 0; i < tekrar.length; i++){
            if (tekrar[i] != visited) {
                System.out.println(arr[i] + " sayısı " + tekrar[i] + " kez tekrar etti !");
            }
        }
    }
}
