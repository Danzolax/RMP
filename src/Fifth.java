import java.util.Scanner;

public class Fifth {
    private static int fibonachi(int number) {
        if (number == 1)
            return 0;
         else if (number == 2)
            return 1;
        return fibonachi(number - 1) + fibonachi(number - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fibonachi(number));
    }
}
