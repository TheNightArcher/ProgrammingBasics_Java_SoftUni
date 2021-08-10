import java.util.Scanner;

public class SuietcasesLoad_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double onwSpace = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int counterCase = 0;
        double leftSpace = onwSpace;
        boolean isDone = true;


        while (!input.equals("End")) {

            double suitcases = Double.parseDouble(input);

            counterCase++;
            if (counterCase % 3 == 0 ) {
                suitcases += 0.10 * suitcases;
            }

            leftSpace -= suitcases;


            if (0 >= leftSpace) {

                counterCase -= 1;
                System.out.printf("No more space!%nStatistic: %d suitcases loaded.",counterCase);
                isDone = false;
                break;
            }

            input = scanner.nextLine();
        }

        if (isDone){
            System.out.printf("Congratulations! All suitcases are loaded!%nStatistic: %d suitcases loaded.", counterCase);
        }

    }
}
