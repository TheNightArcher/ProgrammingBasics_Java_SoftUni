import java.util.Scanner;

public class Hotel_Room_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        // May, June, July, August, September или October
        if ("May".equals(month) || "October".equals(month)) {
            studio = 50 * nights;
            apartment = 65 * nights;
            if (nights > 7 && nights <= 14) {
                studio = studio - 0.05 * studio;
            } else if (nights > 14) {
                studio = studio - 0.30 * studio;
            }
            if (nights > 14) {
                apartment = apartment - 0.10 * apartment;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            studio = 75.20 * nights;
            apartment = 68.70 * nights;
            if (nights > 14) {
                studio = studio - 0.20 * studio;
            }
            if (nights > 14) {
                apartment = apartment - 0.10 * apartment;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            studio = 76 * nights;
            apartment = 77 * nights;
            if (nights > 14) {
                apartment = apartment - 0.10 * apartment;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);
    }
}
