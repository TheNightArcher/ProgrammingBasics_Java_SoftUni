import java.util.Scanner;

public class Vacantion_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    price = budget * 0.65;
                    System.out.printf("Alaska - Camp - %.2f", price);
                } else if (budget > 1000 && budget <= 3000) {
                    price = budget * 0.80;
                    System.out.printf("Alaska - Hut - %.2f", price);
                } else if (budget > 3000) {
                    price = budget * 0.90;
                    System.out.printf("Alaska - Hotel - %.2f", price);
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    price = budget * 0.45;
                    System.out.printf("Morocco - Camp - %.2f", price);
                } else if (budget > 1000 && budget <= 3000) {
                    price = budget * 0.60;
                    System.out.printf("Morocco - Hut - %.2f", price);
                } else if (budget > 3000) {
                    price = budget * 0.90;
                    System.out.printf("Morocco - Hotel - %.2f", price);
                }
                break;
        }
    }
}

