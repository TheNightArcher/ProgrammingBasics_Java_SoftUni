import java.util.Scanner;

public class Transport_Price_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double sum = 0;

        if (n < 20 && time.equals("day")) {
            sum = n * 0.79 + 0.70;

        } else if (n < 20 && time.equals("night")) {
            sum = n * 0.90 + 0.70;


        } else if (n >= 20 && n < 100) {
            sum = n * 0.09;

        } else if (n >= 100) {
            sum = n * 0.06;
        }
        System.out.printf("%.2f", sum);
    }


}