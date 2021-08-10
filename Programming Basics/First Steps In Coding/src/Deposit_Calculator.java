import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int Month = Integer.parseInt(scanner.nextLine());
        double precent = Double.parseDouble(scanner.nextLine());

        double increasePerYear = depositSum * (precent/100);
        double increasePerMonth = increasePerYear / 12;
        double  sum = depositSum + Month * increasePerMonth;
        System.out.print(sum);
    }
}
