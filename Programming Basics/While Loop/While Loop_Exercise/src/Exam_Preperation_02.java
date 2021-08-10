import java.util.Scanner;

public class Exam_Preperation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int badMarks = Integer.parseInt(scanner.nextLine());

        int timeFailed = 0;
        int countProblems = 0;
        String lastProblem = "";
        double gradeSum = 0;
        boolean isFailed = false;


        while (timeFailed < badMarks) {

            String problemsName = scanner.nextLine();

            if (problemsName.equals("Enough")) {
                isFailed = true;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                timeFailed++;
            }

            countProblems++;
            gradeSum += grade;
            lastProblem = problemsName;
        }


        if (!isFailed) {
            System.out.printf(" You need a break, %d poor grades.", badMarks);
        } else {

            System.out.printf("Average score: %.2f %n", gradeSum / countProblems);
            System.out.printf("Number of problems: %d %n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }


    }
}
