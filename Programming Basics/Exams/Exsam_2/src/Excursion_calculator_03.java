import java.util.Scanner;

public class Excursion_calculator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();


        //"spring", "summer", "autumn" или "winter"

        double price = 0;

        if (peoples <= 5) {

            switch (season) {
                case "spring":
                    price = 50.00;
                    break;
                case "summer":
                    price = 48.50;
                    break;
                case "autumn":
                    price = 60.00;
                    break;
                case "winter":
                    price = 86.00;
                    break;
            }

        } else {

            switch (season) {
                case "spring":
                    price = 48.00;
                    break;
                case "summer":
                    price = 45.00;
                    break;
                case "autumn":
                    price = 49.50;
                    break;
                case "winter":
                    price = 85.00;
                    break;
            }
        }


        if (season.equals("summer")){
            price -= 0.15 * price;
        }else if (season.equals("winter")){
            price += 0.08 * price;
        }


        double sum = price * peoples;

        System.out.printf("%.2f leva.",sum);
    }
}
