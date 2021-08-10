import java.util.Scanner;

public class Vegetable_Market_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceForVegetable = Double.parseDouble(scanner.nextLine());
        double priceForFruits = Double.parseDouble(scanner.nextLine());
        double allKgForVeg = Double.parseDouble(scanner.nextLine());
        double allKgForFruits = Double.parseDouble(scanner.nextLine());

        double vegPrice = priceForVegetable * allKgForVeg;
        double fruiPrice = priceForFruits * allKgForFruits;
        double finalSum = vegPrice + fruiPrice;
        double priceInEuro = finalSum / 1.94;

        System.out.printf("%.2f",priceInEuro);


    }
}
