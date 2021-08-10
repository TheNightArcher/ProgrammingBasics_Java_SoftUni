import java.util.Scanner;

public class Circle_Area_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = Math.PI * (r * r);
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f%n%.2f",calculatedArea,perimeter);

    }
}
