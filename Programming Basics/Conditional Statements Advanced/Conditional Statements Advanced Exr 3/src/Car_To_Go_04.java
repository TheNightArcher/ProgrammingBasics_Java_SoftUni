import java.util.Scanner;

public class Car_To_Go_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        switch (season){
            case "Summer":
                if (budget <= 100) {
                    price = budget * 0.35;
                    System.out.printf("Economy class %n Cabrio - %.2f",price);
                }else if (budget > 100 && budget <= 500){
                    price = budget * 0.45;
                    System.out.printf("Compact class %n Cabrio - %.2f",price);
                }else if (budget > 500){
                    price = budget * 0.90;
                    System.out.printf("Luxury class %n Jeep - %.2f",price);
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    price = budget * 0.65;
                    System.out.printf("Economy class %n Jeep - %.2f",price);
                }else if (budget > 100 && budget <= 500){
                    price = budget * 0.80;
                    System.out.printf("Compact class %n Jeep - %.2f",price);
                }else if (budget > 500){
                    price = budget * 0.90;
                    System.out.printf("Luxury class %n Jeep - %.2f",price);
                }
                break;
        }
    }
}
