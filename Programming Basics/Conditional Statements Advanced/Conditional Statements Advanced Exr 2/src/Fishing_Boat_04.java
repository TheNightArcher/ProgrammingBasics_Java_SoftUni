import java.util.Scanner;

public class Fishing_Boat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season  = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        //"Spring", "Summer", "Autumn", "Winter"

        switch (season){
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }if (fishermen <= 6){
            rent = rent - 0.10 * rent;
        }else if (fishermen >= 7 && fishermen <= 11){
            rent = rent - 0.15 * rent;
        }else if (fishermen >= 12){
            rent = rent - 0.25 * rent;
        }

        if (fishermen %2 == 0 && !season.equals("Autumn")){
            rent = rent - 0.05 * rent;
        }

        if (rent <= budget){
            double moneyLeft = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.",moneyLeft);
        }else {
            double moneyNeeded = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.",moneyNeeded);
        }

    }
}
