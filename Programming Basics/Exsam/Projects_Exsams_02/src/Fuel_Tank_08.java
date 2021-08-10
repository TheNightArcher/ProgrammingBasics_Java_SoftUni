import java.util.Scanner;

public class Fuel_Tank_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if ("Diesel".equals(fuel) || "Gasoline".equals(fuel) || "Gas".equals(fuel)) {
            if (liters >= 25){
                System.out.printf("You have enough %s.",fuel.toLowerCase());
            }else {
                System.out.printf("Fill your tank with %s!",fuel.toLowerCase());
            }
        }else {
            System.out.print("Invalid fuel!");
        }
    }
}
