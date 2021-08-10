import java.util.Scanner;

public class Toy_Shop_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine());
        double talkingDolls = Double.parseDouble(scanner.nextLine());
        double bearsToys = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double tracks = Double.parseDouble(scanner.nextLine());

        double sum = puzzle * 2.60 + talkingDolls * 3 + bearsToys * 4.10 + minions * 8.20 + tracks * 2;
        double numberOfToys = puzzle + talkingDolls + bearsToys + minions + tracks;


        if (numberOfToys >= 50) {
            double discount = sum * 0.25;
            sum = sum - discount;
        }
        double rent = sum * 0.10;
        double profit = sum - rent;

        if (profit >= excursion) {
            double diff = profit - excursion;
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            double savings = excursion - profit;
            System.out.printf("Not enough money! %.2f lv needed.",savings);
        }
    }
}
