import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysHave = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double minusTraining = daysHave - (daysHave * 0.10);
        double daysOverTime = minusTraining * 8;
        double overTime = Math.floor(workers * (daysHave * 2));
        double allHours = Math.floor(daysOverTime + overTime);

        double left = 0;
        double needed = 0;

        if (hoursNeeded <= allHours) {
            left = allHours - hoursNeeded;
            System.out.printf("Yes!%.0f hours left.%n", left);
        } else {
            needed = hoursNeeded - allHours;
            System.out.printf("Not enough time!%.0f hours needed.%n", needed);
        }


    }
}
