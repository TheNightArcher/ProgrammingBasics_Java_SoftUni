import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double neededMoneyVac = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spendCount = 0;

        while (ownedMoney < neededMoneyVac && spendCount < 5) {

            String spend = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;

            if (spend.equals("save")) {
                ownedMoney += money;
                spendCount = 0;
            } else if (spend.equals("spend")) {
                ownedMoney -= money;
                spendCount++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }


        }

        if (ownedMoney >= neededMoneyVac) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (spendCount == 5) {
            System.out.printf("You can't save the money.%n %d", days);
        }
    }
}
