import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class Eighth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = scanner.nextInt();

        HashMap<Integer, Integer> resultArray = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!resultArray.containsKey(array[i])) {
                resultArray.put(array[i], 0);
            }
            Integer value = resultArray.get(array[i]);
            resultArray.put(array[i], value + 1);
        }
        System.out.println(resultArray.toString());


//        for (Integer key: resultArray.keySet()) {
//            if (resultArray.get(key) >= 2 && count != 0){
//                System.out.println(key);
//                count--;
//            }
//        }

        while (count != 0) {
            int max = 1;
            int index = 0;
            for (Integer key : resultArray.keySet()) {
                if (resultArray.get(key) > max) {
                    max = resultArray.get(key);
                    index = key;
                }
            }
            resultArray.remove(index);
            count--;
            if (index >= 1) {
                System.out.println(index);
            }

        }
    }
}
