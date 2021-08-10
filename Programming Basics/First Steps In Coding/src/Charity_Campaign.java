import java.util.Scanner;

public class Charity_Campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int campaingDays = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int  cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int totalCakePrice = cakes * 45;
        double totalWafflesPrice = waffles * 5.80;
        double totalPanckesPrice = pancakes * 3.20;

        double totalPriceFoeEachPerson = (totalCakePrice + totalWafflesPrice + totalPanckesPrice) * confectioner;
        double priceFromWholeCampaign = totalPriceFoeEachPerson * campaingDays;
        double finalProfit = (priceFromWholeCampaign / 8) * 7;
        System.out.printf("%.2f",finalProfit);

    }
}
