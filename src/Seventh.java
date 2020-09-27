import java.util.HashMap;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> resultArray = new HashMap<>();
        for (int item : array) {
            if (!resultArray.containsKey(item)) {
                resultArray.put(item, 0);
            }
            Integer value = resultArray.get(item);
            resultArray.put(item, value + 1);
        }
        

        for (Integer key: resultArray.keySet()) {
            if (resultArray.get(key) == 1 ){
                System.out.println(key);
                break;
            }
        }
    }
}
