import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String project = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (project.equals("Premiere")){
            income = rows * columns * 12;
        }else if (project.equals("Normal")){
            income = rows * columns * 7.50;
        }else if (project.equals("Discount")){
            income = rows * columns * 5;
        }
        System.out.printf("%.2f",income);


    }
}
