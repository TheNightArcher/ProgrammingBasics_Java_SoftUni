import java.util.Scanner;

public class Trade_Cmissions_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double commissions = 0;

        switch (city) {
            case "Sofia":
                if (amount >= 0 && amount <= 500) {

                    commissions = amount * 0.05;
                } else if (amount > 500 && amount <= 1000) {
                    commissions = amount * 0.07;
                } else if (amount > 1000 && amount <= 10000) {
                    commissions = amount * 0.08;
                } else if (amount > 10000) {
                    commissions = amount * 0.12;
                }
                break;
            case "Plovdiv":
                if (amount >= 0 && amount <= 500) {
                    commissions = amount * 0.055;
                } else if (amount > 500 && amount <= 1000) {
                    commissions = amount * 0.08;
                } else if (amount > 1000 && amount <= 10000) {
                    commissions = amount * 0.12;
                } else if (amount > 10000) {
                    commissions = amount * 0.145;
                }
                break;
            case "Varna":
                if (amount >= 0 && amount <= 500) {
                    commissions = amount * 0.045;
                } else if (amount > 500 && amount <= 1000) {
                    commissions = amount * 0.075;
                } else if (amount > 1000 && amount <= 10000) {
                    commissions = amount * 0.10;
                } else if (amount > 10000) {
                    commissions = amount * 0.13;
                }
                break;
        }
        if (city.equals("Sofia") && amount > 0 || city.equals("Varna") && amount > 0|| city.equals("Plovdiv") && amount > 0) {

            System.out.printf("%.2f", commissions);
        } else {
            System.out.println("error");
        }


    }
}

