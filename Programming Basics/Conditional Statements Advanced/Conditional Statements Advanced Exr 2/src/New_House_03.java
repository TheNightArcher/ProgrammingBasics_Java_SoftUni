import java.util.Scanner;

public class New_House_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        switch (flowers) {
            case "Roses" -> {
                price = 5 * numberFlowers;
                if (numberFlowers > 80) {
                    price = price - 0.10 * price;
                }
            }
            case "Dahlias" -> {
                price = 3.80 * numberFlowers;
                if (numberFlowers > 90) {
                    price = price - 0.15 * price;
                }
            }
            case "Tulips" -> {
                price = 2.80 * numberFlowers;
                if (numberFlowers > 80) {
                    price = price - 0.15 * price;
                }
            }
            case "Narcissus" -> {
                price = 3 * numberFlowers;
                if (numberFlowers < 120) {
                    price = price + 0.15 * price;
                }
            }
            case "Gladiolus" -> {
                price = 2.50 * numberFlowers;
                if (numberFlowers < 80) {
                    price = price + 0.20 * price;
                }
            }
        }
        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flowers, leftMoney);
        } else if (price > budget) {
            double neededMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}
