import java.util.Scanner;

public class Operations_Between_Numbers_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {

            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, sum);
                }
                break;

            case "-":
                int minus = n1 - n2;
                if (minus % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, minus);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, minus);
                }
                break;

            case "*":
                int sumIt = n1 * n2;
                if (sumIt % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, sumIt);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, sumIt);
                }
                break;

            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                }else {
                    double division = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f ", n1, n2, division);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                }else {
                    int divade = n1 % n2;
                    System.out.printf("%d %% %d = %d ", n1, n2, divade);
                }

                break;

        }


    }
}



