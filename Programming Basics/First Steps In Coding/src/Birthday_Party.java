import java.util.Scanner;

public class Birthday_Party {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = hallPrice * 0.2;
        double drinkPrice = cakePrice - 0.45 * cakePrice;
        double animatorPrice = hallPrice/ 3.0;
        double neededPrice = hallPrice + cakePrice + drinkPrice + animatorPrice;

        System.out.print(neededPrice);

    }
}
