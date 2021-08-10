import java.util.Scanner;

public class Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BookPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHours = Integer.parseInt(scanner.nextLine());
        int ReadDays = Integer.parseInt(scanner.nextLine());

        int HoursReading = BookPages/PagesPerHours;
        int NeedHoursReading = HoursReading / ReadDays;
        System.out.print(NeedHoursReading);
    }
}
