import java.util.Scanner;

public class Main{

    public static boolean Number(int number, int a, int b) {
        return number % a == 0 && number % b != 0;
    }
    public static int Sum(int n, int a, int b) {
        int sum = 0;
        int count = 0;
        int currentNumber = 1;

        while (count < n) {
            if (Number(currentNumber, a, b)) {
                sum += currentNumber;
                count++;
            }
            currentNumber++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number a (divisor): ");
        int a = scanner.nextInt();

        System.out.print("Enter the number b (non-divisor): ");
        int b = scanner.nextInt();

        if (n <= 0 || a <= 0 || b <= 0) {
            System.out.println("LEEEEE all numbers must be positive!");
            return;
        }

        int result = Sum(n, a, b);

        System.out.println("The sum of the first " + n + " numbers that divided by " + a + " and not divided by " + b + ": " + result);

        scanner.close();
    }
}