import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i< 10; i++){
            int instances = 0;
            for (int j = 0; j< numbers.length; j++){
                if (numbers[j] == (i+1)){
                    instances++;
                }
            }
            System.out.println((i+1) + " - " + instances);
        }
    }
}