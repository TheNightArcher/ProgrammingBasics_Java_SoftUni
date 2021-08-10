import java.util.Scanner;

public class Average_Nubmer_05 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            counter++;

            sum += number;


        }

        double averageNumber = sum * 1.0/ counter;

        System.out.printf("%.2f", averageNumber);
    }
}
