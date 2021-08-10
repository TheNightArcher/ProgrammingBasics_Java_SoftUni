import java.util.Scanner;

public class Flower_Shop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths= Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double price = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cacti * 8;
        double taxPrice = price - 0.05 * price;

        if (priceGift <= taxPrice){
            double moneyLeft = taxPrice - priceGift;
            double left = Math.floor(moneyLeft);

            System.out.printf("She is left with %.0f leva.",left);
        }else {
            double moneyBorrow = priceGift - taxPrice;
            double borrow = Math.ceil(moneyBorrow);
            System.out.printf("She will have to borrow %.0f leva.",borrow);
        }
    }
}
