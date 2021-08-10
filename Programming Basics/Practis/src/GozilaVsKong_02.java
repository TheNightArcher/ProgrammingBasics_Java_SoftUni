import java.util.Scanner;

public class GozilaVsKong_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceForDress = Double.parseDouble(scanner.nextLine());


        double priceForDecor = budget - budget * 0.90;
        double dressPrice = statists * priceForDress;

        if (statists >= 150) {
            dressPrice -= dressPrice * 0.10;
        }

        double totalSum = priceForDecor + dressPrice;

        if (budget >= totalSum) {
            double sumLeft = budget - totalSum;
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", sumLeft);
        } else {
            double needed = totalSum - budget;
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", needed);
        }


    }
}
