import java.util.Scanner;

public class Clever_Lily_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toys = Integer.parseInt(scanner.nextLine());

        int bonusMoney = 10;
        int toyCount = 0;
        int presentMoney = 0;
        int brother = 0;
        int finalmoney= 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {

                presentMoney += bonusMoney;
                bonusMoney += 10;
                brother++;

            } else {
                toyCount++;
            }
        }

        double moneyLeft = (toyCount * toys) + presentMoney - brother;

        if (moneyLeft > washingMachine) {
            double left = moneyLeft - washingMachine;
            System.out.printf("Yes! %.2f", left);
        } else {
            double needed = Math.abs(moneyLeft - washingMachine);
            System.out.printf("No! %.2f", needed);
        }
    }
}
