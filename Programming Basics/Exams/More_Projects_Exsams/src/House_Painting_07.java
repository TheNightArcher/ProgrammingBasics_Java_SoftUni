import java.util.Scanner;

public class House_Painting_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double bothSides = 2 * sideWall - 2 * window;
        double backSide = x * x;
        double entrance = 1.2 * 2;
        double allBackAndFront = 2 * backSide - entrance;
        double totalArea = bothSides + allBackAndFront;

        double greenPain = totalArea / 3.4;


        double rectangleRoof = 2 * (sideWall);
        double bothRectangle = 2 * (x * h / 2);
        double totalAreaRoof = rectangleRoof + bothRectangle;

        double redPain = totalAreaRoof / 4.3;

        System.out.printf("%.2f%n%.2f", greenPain, redPain);


    }
}
