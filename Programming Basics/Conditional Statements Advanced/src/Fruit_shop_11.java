import java.util.Scanner;

public class Fruit_shop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                switch (fruit) {
                    case "banana":
                        price = amount * 2.50;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = amount * 1.20;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = amount * 0.85;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = amount * 1.45;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = amount * 2.70;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = amount * 5.50;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = amount * 3.85;
                        System.out.printf("%.2f", price);
                        break;
                    default:
                        System.out.println("error");

                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = amount * 2.70;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = amount * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = amount * 0.90;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = amount * 1.60;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = amount * 3.00;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = amount * 5.60;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = amount * 4.20;
                        System.out.printf("%.2f", price);
                        break;

                }break;

            default:
                System.out.println("error");

        }
    }
}
