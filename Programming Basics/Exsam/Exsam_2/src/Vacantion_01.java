import java.util.Scanner;

public class Vacantion_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardTrans = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());


        int totalNights = nights * 20;
        double totalCards = cardTrans * 1.60;
        double totalTickets = tickets * 6;

        double sum = totalNights + totalCards + totalTickets;
        double group = sum * peoples;
        double totalSum = group + 0.25 * group;

        System.out.printf("%.2f",totalSum);
    }
}
