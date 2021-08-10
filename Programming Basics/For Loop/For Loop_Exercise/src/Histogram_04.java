import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 1; i <= n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());


            if (numbers < 200) {
                p1 += 1;

            } else if (numbers >= 200 && numbers <= 399) {

                p2 += 1;
            } else if (numbers >= 400 && numbers <= 599) {

                p3 += 1;
            } else if (numbers >= 600 && numbers <= 799) {

                p4 += 1;
            } else if (numbers >= 800) {

                p5 += 1;
            }
        }

        double percentP1 = p1 * 1.0/ n * 100;
        double percentP2 = p2 * 1.0 / n * 100;
        double percentP3 = p3 * 1.0/ n * 100;
        double percentP4 = p4 * 1.0/ n * 100;
        double percentP5 = p5 * 1.0/ n * 100;

        System.out.printf("%.2f%% %n %.2f%% %n %.2f%% %n %.2f%% %n %.2f%% ", percentP1,percentP2,percentP3,percentP4,percentP5);
    }
}
