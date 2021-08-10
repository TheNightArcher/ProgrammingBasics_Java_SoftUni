import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;


        double totalGrades = 0;

        for (int i = 1; i <= students; i++) {

            double grades = Double.parseDouble(scanner.nextLine());

            totalGrades += grades;


            if (grades >= 2.00 && grades <= 2.99) {
                d1 += 1;

            } else if (grades >= 3.00 && grades <= 3.99) {
                d2 += 1;

            } else if (grades >= 4.00 && grades <= 4.99) {

                d3 += 1;

            } else if (grades >= 5) {

                d4 += 1;

            }



        }

       double average = totalGrades / students;


        double percentP1 = d1 * 1.0/ students  * 100;
        double percentP2 = d2 * 1.0/ students  * 100;
        double percentP3 = d3 * 1.0/ students  * 100;
        double percentP4 = d4 * 1.0/ students  * 100;


        System.out.printf("Top students: %.2f%% %n",percentP4);
        System.out.printf("Between 4.00 and 4.99: %.2f%% %n",percentP3);
        System.out.printf("Between 3.00 and 3.99: %.2f%% %n",percentP2);
        System.out.printf("Fail: %.2f%% %n",percentP1);
        System.out.printf("Average: %.2f",average);


    }
}
