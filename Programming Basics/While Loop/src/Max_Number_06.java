import java.util.Scanner;

public class Max_Number_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {

            int numbers = Integer.parseInt(input);

            if ( numbers > maxNumber){
                maxNumber = numbers;
            }

            input = scanner.nextLine();
        }

        System.out.print(maxNumber);
    }
}
