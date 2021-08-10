import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int totalSteps = 0;

        while (!input.equals("Going home")) {

            int steps = Integer.parseInt(input);

            totalSteps += steps;

            if (totalSteps >= 10000) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            int homeSteps = Integer.parseInt(scanner.nextLine());
            totalSteps += homeSteps;

        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            int moreSteps = totalSteps - 10000;
            System.out.printf("%d steps over the goal!", moreSteps);
        } else {
            int diff = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.", diff);

        }
    }
}