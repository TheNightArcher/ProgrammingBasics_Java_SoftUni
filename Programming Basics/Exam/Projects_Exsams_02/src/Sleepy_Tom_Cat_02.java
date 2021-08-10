import java.util.Scanner;

public class Sleepy_Tom_Cat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int hollyDays = days * 127;
        int workDays = 365 - days;
        int playingDays = workDays * 63;
        int allPlayingDays = hollyDays + playingDays;
        int catPlayingTime = 30000;

        if (allPlayingDays <= catPlayingTime){
            int sumDays = catPlayingTime - allPlayingDays;
            double hours = sumDays /60;
            double minutes = sumDays % 60;

            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play",hours,minutes);

        }else if (allPlayingDays > catPlayingTime){
            int neededHours = allPlayingDays - catPlayingTime;
            double hoursNeeded = neededHours/60;
            double minutesNeeded = neededHours % 60;

            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",hoursNeeded,minutesNeeded);

        }
    }
}
