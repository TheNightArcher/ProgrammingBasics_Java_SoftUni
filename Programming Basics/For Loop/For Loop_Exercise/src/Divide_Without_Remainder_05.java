import java.util.Scanner;

public class Divide_Without_Remainder_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;


        for (int i = 1; i <= n; i++){

            int number = Integer.parseInt(scanner.nextLine());

            if ( number % 2 == 0){
                p1 += 1;

            }
            if (number % 3 == 0) {
                p2 += 1;

            }
            if (number % 4 == 0){
                p3 += 1;
            }

        }

        double percentP1 = p1 * 1.0 / n * 100;
        double percentP2 = p2 * 1.0 / n * 100;
        double percentP3 = p3 * 1.0 / n * 100;

        System.out.printf("%.2f%% %n",percentP1);
        System.out.printf("%.2f%% %n",percentP2);
        System.out.printf("%.2f%% %n",percentP3);
    }
}
