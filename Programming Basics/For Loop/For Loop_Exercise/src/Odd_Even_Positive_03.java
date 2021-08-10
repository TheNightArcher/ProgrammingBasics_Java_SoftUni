import java.util.Scanner;

public class Odd_Even_Positive_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());


        double maxOdd = Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;
        double sumOdd = 0;
        double maxEven = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double sumEven = 0;

        if (n == 0) {
            System.out.printf("OddSum=%.2f, %n OddMin=No, %n OddMax=No, %n EvenSum=%.2f, %n EvenMin=No, %n EvenMax=No", sumOdd, sumEven);

        } else if (n == 1) {
            for (int i = 1; i <= n; i++) {

                double numbers = Double.parseDouble(scanner.nextLine());

                if (i % 2 == 0) {

                    sumEven += numbers;

                    if (numbers > maxEven) {
                        maxEven = numbers;
                    }
                    if (numbers < minEven) {
                        minEven = numbers;
                    }
                } else {

                    sumOdd += numbers;
                    if (numbers > maxOdd) {
                        maxOdd = numbers;
                    }
                    if (numbers < minOdd) {
                        minOdd = numbers;
                    }
                }


            }
            System.out.printf("OddSum=%.2f, %n OddMin=%.2f, %n OddMax=%.2f, %n EvenSum=%.2f, %n EvenMin=No, %n EvenMax=No ", sumOdd, minOdd, maxOdd, sumEven);

        } else {


            for (int i = 1; i <= n; i++) {

                double numbers = Double.parseDouble(scanner.nextLine());

                if (i % 2 == 0) {

                    sumEven += numbers;

                    if (numbers > maxEven) {
                        maxEven = numbers;
                    }
                    if (numbers < minEven) {
                        minEven = numbers;
                    }
                } else {

                    sumOdd += numbers;
                    if (numbers > maxOdd) {
                        maxOdd = numbers;
                    }
                    if (numbers < minOdd) {
                        minOdd = numbers;
                    }
                }


            }
            System.out.printf("OddSum=%.2f, %n OddMin=%.2f, %n OddMax=%.2f, %n EvenSum=%.2f, %n EvenMin=%.2f, %n EvenMax=%.2f ", sumOdd, minOdd, maxOdd, sumEven, minEven, maxEven);
        }
    }
}
