import java.util.Scanner;

public class Game_Of_Intervals_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;

        double total = 0;

        for (int i = 1; i <= n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());



            if (numbers >= 0 && numbers <= 9) {
                p1 += 1;
                total += numbers * 0.20;
            } else if (numbers >= 10 && numbers <= 19) {
                p2 += 1;
                total += numbers * 0.30;
            } else if (numbers >= 20 && numbers <= 29) {
                p3 += 1;
                total += numbers * 0.40;
            } else if (numbers >= 30 && numbers <= 39) {
                p4 += 1;
                total += 50;
            } else if (numbers >= 40 && numbers <= 50) {
                p5 += 1;
                total +=  100;
            } else {
                p6 += 1;
                total /=  2;
            }
        }

        double percentP1 = p1 * 1.0 / n * 100;
        double percentP2 = p2 * 1.0 / n * 100;
        double percentP3 = p3 * 1.0 / n * 100;
        double percentP4 = p4 * 1.0 / n * 100;
        double percentP5 = p5 * 1.0 / n * 100;
        double percentP6 = p6 * 1.0 / n * 100;


        System.out.printf("%.2f %n", total);
        System.out.printf("From 0 to 9: %.2f%% %n", percentP1);
        System.out.printf("From 10 to 19: %.2f%% %n", percentP2);
        System.out.printf("From 20 to 29: %.2f%% %n", percentP3);
        System.out.printf("From 30 to 39: %.2f%% %n", percentP4);
        System.out.printf("From 40 to 50: %.2f%% %n", percentP5);
        System.out.printf("Invalid numbers: %.2f%% %n", percentP6);
    }
}
