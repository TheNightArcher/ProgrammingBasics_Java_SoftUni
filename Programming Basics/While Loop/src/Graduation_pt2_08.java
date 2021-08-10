import java.util.Scanner;

public class Graduation_pt2_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        double average = 0;
        int repetitions = 0;
        boolean isExcluded = false;

        while (grade <= 12){

            double mark = Double.parseDouble(scanner.nextLine());

            if ( mark < 4){
                repetitions ++;
                if (repetitions == 2){

                    System.out.printf("%s has been excluded at %d grade",name,grade);
                    isExcluded = true;
                    break;
                }
                continue;
            }

            average += mark;
            grade ++;

        }
        if (!isExcluded){
            double totalAverage = average / 12;
            System.out.printf("%s graduated. Average grade: %.2f",name,totalAverage);
        }
    }
}
