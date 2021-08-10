import java.util.Scanner;

public class dog_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ownFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int foodKg = ownFood * 1000;
        int counterFood = 0;


        while (!input.equals("Adopted")) {
            int foodDay = Integer.parseInt(input);

            counterFood += foodDay;

            input = scanner.nextLine();
        }

        if (foodKg >= counterFood) {
            int left = foodKg - counterFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", left);
        } else {
            int needed = counterFood - foodKg;
            System.out.printf("Food is not enough. You need %d grams more.", needed);
        }
    }
}
