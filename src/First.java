import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println("Middle: " + sum / size);
        System.out.println("Min: " + array[0]);
        System.out.println("Max: " + array[size - 1]);
    }
}
