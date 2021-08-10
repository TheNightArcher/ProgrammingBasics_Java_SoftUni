import java.util.Scanner;

public class Report_System_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int neededMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int stuffCount = 0;
        int sumCash = 0;
        int sumCard = 0;
        int counter1 = 0;
        int counter2 = 0;

        while (!input.equals("End")) {

            int stuffPrice = Integer.parseInt(input);

            stuffCount++;

            if (stuffPrice <= 100 && stuffCount % 2 != 0) {
                sumCash += stuffPrice;
                counter1++;
                System.out.println("Product sold!");
            } else if (stuffPrice >= 10 && stuffCount % 2 == 0) {
                sumCard += stuffPrice;
                counter2++;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }

            int totalSum = sumCash + sumCard;

            if (totalSum >= neededMoney) {
                double averageCS = sumCash * 1.0 / counter1;
                double averageCC = sumCard * 1.0/ counter2;
                System.out.printf("Average CS: %.2f %n Average CC: %.2f", averageCS, averageCC);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
