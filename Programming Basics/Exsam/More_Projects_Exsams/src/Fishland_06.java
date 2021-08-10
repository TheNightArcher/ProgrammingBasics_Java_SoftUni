import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double toyPricePerKg = Double.parseDouble(scanner.nextLine());
        double bonitoGk = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        double clamKg = Double.parseDouble(scanner.nextLine());

        double mackerelPriceKg = mackerelPrice + mackerelPrice * 0.60;
        double sumBonito = bonitoGk * mackerelPriceKg;
        double horseMackerelPrice = toyPricePerKg + toyPricePerKg * 0.80;
        double sumHorseMackerel = horseMackerelPrice * horseMackerelKg;
        double sumClam = clamKg * 7.50;

        double finalSum = sumBonito + sumHorseMackerel + sumClam;

        System.out.printf("%.2f",finalSum);


    }
}
