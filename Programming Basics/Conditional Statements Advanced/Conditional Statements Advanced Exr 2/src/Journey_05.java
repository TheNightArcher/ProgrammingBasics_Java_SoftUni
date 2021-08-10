import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;


        if (budget <= 100) {
            if (season.equals("summer")) {
                price = 0.30 * budget;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = 0.70 * budget;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", price);
            }
        }
        if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                price = 0.40 * budget;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = 0.80 * budget;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", price);
            }
        }
        if (budget > 1000) {
            if (season.equals("summer")) {
                price = 0.90 * budget;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", price);
            } else if (season.equals("winter")) {
                price = 0.90 * budget;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", price);
            }
        }
    }
}
