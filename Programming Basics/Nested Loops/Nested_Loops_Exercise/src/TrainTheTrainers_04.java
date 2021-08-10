import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        double totalSum = 0;

        while (!input.equals("Finish")){
            String presentation = input;
            counter++;

            double markSum = 0;

            for (int i = 1; i <= n; i++) {
                double marks = Double.parseDouble(scanner.nextLine());

                markSum += marks;
            }
           double average = markSum / n;
            totalSum += average;
            System.out.printf("%s - %.2f.%n",presentation,average);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalSum / counter);
    }
}
