import java.util.Scanner;

public class Area_of_Figures_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double aera = 0;



        if (shape.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            aera = squareSide * squareSide;
            System.out.printf("%.3f", aera);
        }else if (shape.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            aera = sideA * sideB;
            System.out.printf("%.3f",aera);

        }else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            aera = radius * radius * Math.PI;
            System.out.printf("%.3f",aera);
        }else if (shape.equals("triangle")) {
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());
            aera = triangleSide * triangleHeight / 2;
            System.out.printf("%.3f",aera);

        }

    }
}
