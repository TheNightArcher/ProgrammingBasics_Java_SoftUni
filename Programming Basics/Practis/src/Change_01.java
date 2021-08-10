import java.util.Scanner;

public class Change_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double bitcoins = Double.parseDouble(scanner.nextLine());
        double yane = Double.parseDouble(scanner.nextLine());
        double comissions = Double.parseDouble(scanner.nextLine());


        double bitcoinPrice = bitcoins * 1168;
        double yeanPriceDollars = yane * 0.15;
        double yeanPriceLeva = yeanPriceDollars * 1.76;
        double pacentComison = comissions / 100;

        double totalSumEuro = (bitcoinPrice + yeanPriceLeva) / 1.95;

        double totalLeft = totalSumEuro - pacentComison * totalSumEuro;

        System.out.printf("%.2f",totalLeft);


    }
}
