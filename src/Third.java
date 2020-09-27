import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }

        for (int i : array) {
            System.out.println(i + "\n");
        }
    }
}
