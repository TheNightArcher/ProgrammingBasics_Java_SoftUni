import java.util.Scanner;

public class Bike_Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeRace = scanner.nextLine();

        double price = 0;

        //"trail", "cross-country", "downhill" или "road"

        switch (typeRace) {
            case "trail":
                price = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                if (typeRace.equals("cross-country") && juniors + seniors >= 50) {
                    price = juniors * 8 + seniors * 9.50;
                    price = price - 0.25 * price;
                } else if (typeRace.equals("cross-country") && juniors + seniors < 50){
                    price = juniors * 8 + seniors * 9.50;
                }
                break;
            case "downhill":
                price = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                price = juniors * 20 + seniors * 21.50;
                break;

        }

        double totalPrice = price - 0.05 * price;

        System.out.printf("%.2f", totalPrice);

    }
}
