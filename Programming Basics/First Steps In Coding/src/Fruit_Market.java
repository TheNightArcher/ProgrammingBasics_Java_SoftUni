import java.util.Scanner;

public class Fruit_Market {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double amountBananasKg = Double.parseDouble(scanner.nextLine());
        double amountOrangeKg = Double.parseDouble(scanner.nextLine());
        double amountRaspberriesKg = Double.parseDouble(scanner.nextLine());
        double amountStrawberriesKg = Double.parseDouble(scanner.nextLine());

        double priceRaspberriesKg = strawberriesPrice - (0.5 * strawberriesPrice);
        double priceOrangeKg = priceRaspberriesKg - (0.4 * priceRaspberriesKg);
        double priceBananasKg = priceRaspberriesKg -(0.8 * priceRaspberriesKg);

        double sumForRaspberries = amountRaspberriesKg * priceRaspberriesKg;
        double sumForOranges = amountOrangeKg * priceOrangeKg;
        double sumForBananas = priceBananasKg * amountBananasKg;
        double sumForStrawberries = amountStrawberriesKg * strawberriesPrice;
        double sumForAll = sumForRaspberries + sumForOranges + sumForBananas + sumForStrawberries;

        System.out.printf("%.2f",sumForAll);


    }
}
