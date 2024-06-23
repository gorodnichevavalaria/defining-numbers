import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        int start = Math.min(number1, number2);
        int step = start;
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i += step) {
            System.out.print((i * i) + " ");
        }

        scanner.close();
    }
}