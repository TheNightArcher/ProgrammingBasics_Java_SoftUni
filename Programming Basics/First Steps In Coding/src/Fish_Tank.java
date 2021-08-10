import java.util.Scanner;

public class Fish_Tank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeOfAqarium = length * width * height;
        double totalLiters = volumeOfAqarium * 0.001;
        double Percentages = percentage * 0.01;
        double neededLiters = totalLiters * (1-Percentages);

        System.out.printf("%.2f",neededLiters);

    }
}
