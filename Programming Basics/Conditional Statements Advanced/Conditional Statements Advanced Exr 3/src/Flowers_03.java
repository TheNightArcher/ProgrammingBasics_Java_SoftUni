import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidays = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        //[Spring, Summer, Аutumn, Winter]

        switch (holidays) {
            case "Y":
                switch (season) {
                    case "Spring":
                        price = chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50;
                        price = price + 0.15 * price;

                        if (season.equals("Spring")&& tulips > 7) {
                            price = price - 0.05 * price;
                        }

                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Summer":
                        if (season.equals("Spring")&& tulips > 7) {
                            price = price - 0.05 * price;
                        }

                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "Autumn":
                    case "Winter":
                        price = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
                        price = price + 0.15 * price;

                        if (season.equals("Winter") && roses >= 10) {
                            price = price - 0.10 * price;
                        }

                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);
                        break;

                }
                break;

            case "N":
                switch (season) {
                    case "Spring":
                        price = chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50;

                        if (tulips > 7) {
                            price = price - 0.05 * price;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);
                    case "Summer":
                        price = chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50;

                        if (tulips > 7 && season.equals("Spring")) {
                            price = price - 0.05 * price;
                        }
                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);

                        break;
                    case "Autumn":

                    case "Winter":
                        price = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;

                        if (season.equals("Winter") && roses >= 10) {
                            price = price - 0.10 * price;
                        }

                        if (chrysanthemums + roses + tulips > 20) {
                            price = price - 0.20 * price;
                        }

                        totalPrice = price + 2;
                        System.out.printf("%.2f", totalPrice);
                        break;

                }

        }
    }
}
