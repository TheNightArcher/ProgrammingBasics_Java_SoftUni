import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xMeters = Double.parseDouble(scanner.nextLine());
        double yGrape = Double.parseDouble(scanner.nextLine());
        double zNeededLiters = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double sumGrape = xMeters * yGrape;
        double wine = sumGrape * 0.40 / 2.5;
        double totalWine = Math.floor(wine);

        if (wine >= zNeededLiters) {

            double wineLeft = Math.ceil(wine - zNeededLiters);
            double winePerPerson = Math.ceil(wineLeft / workers);

            System.out.printf("Good harvest this year! Total wine: %.0f liters." + "%n %.0f liters left -> %.0f liters per person. ", totalWine, wineLeft, winePerPerson);


        } else {
            double wineNeeded = zNeededLiters - wine;
            double totalWineNeeded = Math.floor(wineNeeded);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", totalWineNeeded);
        }


    }
}
