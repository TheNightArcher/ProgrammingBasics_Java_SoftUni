import java.util.Scanner;

public class Half_Sum_Elements_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;

            if (numbers > max) {
                max = numbers;

            }
        }

        int sumMinusMax = sum - max;

        if (max == sumMinusMax) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumMinusMax);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }


    }
}
