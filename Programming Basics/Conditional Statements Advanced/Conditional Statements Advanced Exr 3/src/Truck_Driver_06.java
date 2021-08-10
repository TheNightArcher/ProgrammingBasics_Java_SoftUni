import java.util.Scanner;

public class Truck_Driver_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;

// "Spring", "Summer", "Autumn" или "Winter"
        switch (season){

            case "Spring":
            case "Autumn":
                if (km <= 5000){
                  price = km * 0.75;
                }else if (km > 5000 && km <= 10000){
                    price = km * 0.95;
                }else if (km > 10000 && km <= 20000){
                    price = km * 1.45;
                }
                totalPrice = price * 4;
                totalPrice = totalPrice - 0.10 * totalPrice;
                break;
            case "Summer":
                if (km <= 5000){
                    price = km * 0.90;
                }else if (km > 5000 && km <= 10000){
                    price = km * 1.10;
                }else if (km > 10000 && km <= 20000){
                    price = km * 1.45;
                }
                totalPrice = price * 4;
                totalPrice = totalPrice - 0.10 * totalPrice;
                break;
            case "Winter":
                if (km <= 5000){
                    price = km * 1.05;
                }else if (km > 5000 && km <= 10000){
                    price = km * 1.25;
                }else if (km > 10000 && km <= 20000){
                    price = km * 1.45;
                }
                totalPrice = price * 4;
                totalPrice = totalPrice - 0.10 * totalPrice;
                break;

        }
        System.out.printf("%.2f",totalPrice);
    }
}
