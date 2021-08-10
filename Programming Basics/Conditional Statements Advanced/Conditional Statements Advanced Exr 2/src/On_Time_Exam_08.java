import java.util.Scanner;

public class On_Time_Exam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveTime = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int totalExamTime = examHours * 60 + examMinutes;
        int totalArriveTime = arriveTime * 60 + arriveMinutes;

        if (totalArriveTime > totalExamTime){
            System.out.println("Late");
            int lateMinutes = totalArriveTime - totalExamTime;
            if (lateMinutes < 60){
                System.out.printf("%d minutes after the start",lateMinutes );
            }else {
                int hours = lateMinutes /60;
                int minutes = lateMinutes % 60;

                System.out.printf("%d:%02d hours after the start",hours,minutes);
            }

        }
        else if (totalArriveTime == totalExamTime || totalExamTime - totalArriveTime <= 30){
            System.out.println("On time");
            int inTime = totalExamTime - totalArriveTime;
            if (inTime<= 30 && totalArriveTime != totalExamTime ){
                System.out.printf("%d minutes before the start",inTime );
            }
        }
        else if (totalExamTime - totalArriveTime > 30){
            System.out.println("Early");
            int earlyMinutes = totalExamTime - totalArriveTime;
            if (earlyMinutes < 60){
                System.out.printf("%d minutes before the start",earlyMinutes );
            }else {
                int hours = earlyMinutes /60;
                int minutes = earlyMinutes % 60;

                System.out.printf("%d:%02d hours before the start",hours,minutes);
            }
        }

    }
}
