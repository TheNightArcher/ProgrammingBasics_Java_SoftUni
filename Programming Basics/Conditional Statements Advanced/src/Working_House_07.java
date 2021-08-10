import java.util.Scanner;

public class Working_House_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();


        if (day.equals("Monday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else if (day.equals("Tuesday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else if (day.equals("Wednesday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else if (day.equals("Thursday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else if (day.equals("Friday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else if (day.equals("Saturday") && hour >= 10 && hour <= 18) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}

