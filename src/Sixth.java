import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Integer number = scanner.nextInt();
        while (Arrays.binarySearch(array, number) > 0) {
            List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
            arrayList.remove(Arrays.binarySearch(array, number));
            array = arrayList.toArray(new Integer[arrayList.size()]);
        }
        for (Integer integer : array) {
            System.out.println(integer);
        }

//        int[] array = new int[]{3,4,5,6,7,8,9};
//        System.out.println(Arrays.binarySearch(array,4));
    }
}
