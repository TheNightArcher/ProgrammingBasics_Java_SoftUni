import java.util.Scanner;

public class Programing_Book_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double oneList = Double.parseDouble(scanner.nextLine());
        double oneCover = Double.parseDouble(scanner.nextLine());
        double percentageDiscount = Integer.parseInt(scanner.nextLine());
        double sumDisainer = Double.parseDouble(scanner.nextLine());
        double percentTeamPay = Integer.parseInt(scanner.nextLine());

        double startingSum = (oneList * 899) + (oneCover * 2);
        double parcent1 = percentageDiscount / 100;
        double parcent2 = percentTeamPay / 100;


        double priceWithDiscount = startingSum - parcent1 * startingSum;

        double afterDisainer = priceWithDiscount + sumDisainer;

        double totalPrice = afterDisainer - parcent2 * afterDisainer;


        System.out.printf("Avtonom should pay %.2f BGN.", totalPrice);
    }


}
