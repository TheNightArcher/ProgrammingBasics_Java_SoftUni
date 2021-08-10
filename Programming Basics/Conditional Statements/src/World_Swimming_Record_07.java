import java.util.Scanner;

public class World_Swimming_Record_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double haveToSwim = distance * timeInSec;
        double delayTime = Math.floor(distance/15) * 12.5;
        double finalTime = haveToSwim + delayTime;

        if (finalTime < recordSec){
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.",finalTime);


        }else {
            finalTime = finalTime - recordSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.",finalTime);
        }
    }
}
