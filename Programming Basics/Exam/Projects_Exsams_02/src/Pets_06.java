import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFoods = Integer.parseInt(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodTurtle = Double.parseDouble(scanner.nextLine());

        double dogFood = days * foodDog;
        double catFood = days * foodCat;
        double turtleFood = days * foodTurtle / 1000;


        double totalFood = dogFood + catFood + turtleFood;

        if (totalFood <= leftFoods) {

            double leftFood = leftFoods - totalFood;
            double left = Math.floor(leftFood);
            System.out.printf("%.0f kilos of food left.", left);
        } else {

            double foodNeeded = totalFood - leftFoods;
            double needed = Math.ceil(foodNeeded);
            System.out.printf("%.0f more kilos of food are needed.", needed);
        }


    }
}
