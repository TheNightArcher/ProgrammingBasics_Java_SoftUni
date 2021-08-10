import java.util.Scanner;

public class GozillaVsKong_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double staticClothes = Double.parseDouble(scanner.nextLine());

        double decorSum = budget * 0.10;
        double clothesPrice = statists * staticClothes;


        if (statists > 150) {
            clothesPrice = clothesPrice - 0.10 * clothesPrice;

        }
        double expenses = decorSum + clothesPrice;

        if (budget >= expenses) {
            System.out.println("Action!");
            double leftMoney = budget - expenses;
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        } else {
            double neededMoney = expenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        }


    }
}
