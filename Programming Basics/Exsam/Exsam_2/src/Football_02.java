import java.util.Scanner;

public class Football_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tshirt = Double.parseDouble(scanner.nextLine());
        double winBall = Double.parseDouble(scanner.nextLine());

        double discount = 0;

        double shorts = tshirt * 0.75;
        double socks = shorts * 0.20;
        double buttons = (tshirt + shorts) * 2;

        double sum = tshirt + shorts + socks + buttons;

        if (sum >= winBall) {
            discount = sum - 0.15 * sum;
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", discount);

        } else {
            discount = sum - 0.15 * sum;
            double needed = winBall - discount;
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", needed);
        }
    }
}
