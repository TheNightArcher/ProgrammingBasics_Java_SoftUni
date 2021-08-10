import java.util.Scanner;

public class Account_Balance_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double total = 0;

        while (!input.equals("NoMoreMoney")){

            double currentAmount = Double.parseDouble(input);

            if (currentAmount < 0){
                System.out.printf("Invalid operation! %n");
                break;
            }

            System.out.printf("Increase: %.2f %n",currentAmount);

            total += currentAmount;

            input = scanner.nextLine();


        }
        System.out.printf("Total: %.2f",total);
    }
}
