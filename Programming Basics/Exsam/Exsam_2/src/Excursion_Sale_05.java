import java.util.Scanner;

public class Excursion_Sale_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seaExcursion = Integer.parseInt(scanner.nextLine());
        int mountainExcursion = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int counterSea = 0;
        int counterMountain = 0;
        int price = 0;
        int price2 = 0;


        while (!input.equals("Stop")) {

            if (input.equals("sea") && counterSea < seaExcursion) {
                price += 680;
                counterSea++;

            } else if (input.equals("mountain") && counterMountain < mountainExcursion) {
                price2 += 499;
                counterMountain++;
            }

            if (counterSea == seaExcursion && counterMountain == mountainExcursion) {

                System.out.println("Good job! Everything is sold.");
                break;
            }

            input = scanner.nextLine();
        }

        int totalPrice = price + price2;
            System.out.printf("Profit: %d leva.", totalPrice);

    }
}
