import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minWalking = Integer.parseInt(scanner.nextLine());
        int walkingPerDay = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinPerDay = minWalking * walkingPerDay;

        int burnCalories = totalMinPerDay * 5;

        int halfCaloriesGoal = calories / 2;


        if (halfCaloriesGoal <= burnCalories){

            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnCalories);
        }
    }
}
