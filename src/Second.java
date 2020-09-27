import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int power = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= size ; i++) {
            sum += Math.pow(i,power);
        }
        System.out.println(sum);
    }
}
