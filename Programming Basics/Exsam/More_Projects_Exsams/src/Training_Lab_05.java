import java.util.Scanner;

public class Training_Lab_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());


        double hInCm = h * 100;
        double wInCm = w * 100 - 100;

        double desksInOrder = Math.floor(wInCm / 70);
        double order = Math.floor(hInCm / 120);

        double numberSpace = desksInOrder * order - 3;

        System.out.printf("%.0f", numberSpace);
    }
}
