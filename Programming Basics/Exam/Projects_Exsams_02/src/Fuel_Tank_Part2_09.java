import java.util.Scanner;

public class Fuel_Tank_Part2_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;
        double fuelPrice = 0;
        double totalPrice = 0;

        switch (typeFuel){

            case "Diesel":
                double dieselPrice = 2.33;
                if (clubCard.equals("Yes")){
                    price = dieselPrice - 0.12;
                }else {
                    price = dieselPrice;
                }

                if (liters >= 20 && liters <=25){
                     fuelPrice = price * liters;
                     totalPrice = fuelPrice - 0.08 * fuelPrice;
                }else if ( liters > 25){
                    fuelPrice = price * liters;
                    totalPrice = fuelPrice - 0.10 * fuelPrice;
                }else {
                    totalPrice = price * liters;
                }
                break;
            case "Gasoline":
                double gasolinePrice = 2.22;
                if (clubCard.equals("Yes")){
                    price = gasolinePrice - 0.18;
                }else {
                    price = gasolinePrice;
                }

                if (liters >= 20 && liters <=25){
                    fuelPrice = price * liters;
                    totalPrice = fuelPrice - 0.08 * fuelPrice;
                }else if ( liters > 25){
                    fuelPrice = price * liters;
                    totalPrice = fuelPrice - 0.10 * fuelPrice;
                }else {
                    totalPrice = price * liters;
                }
                break;
            case "Gas":
                double gasPrice = 0.93;
                if (clubCard.equals("Yes")){
                    price = gasPrice - 0.08;
                }else {
                    price = gasPrice;
                }

                if (liters >= 20 && liters <=25){
                    fuelPrice = price * liters;
                    totalPrice = fuelPrice - 0.08 * fuelPrice;
                }else if ( liters > 25){
                    fuelPrice = price * liters;
                    totalPrice = fuelPrice - 0.10 * fuelPrice;
                }else {
                    totalPrice = price * liters;
                }
                break;

        }
        System.out.printf("%.2f lv.",totalPrice);
    }
}
