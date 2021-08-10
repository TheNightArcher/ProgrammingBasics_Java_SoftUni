import java.util.Scanner;

public class plain_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int airLines = Integer.parseInt(scanner.nextLine());

        String nameCompany = "";

        int average = 0;

        int mostPeoples = 0;
        
        for (int i = 0; i < airLines; i++) {

            int currentPeoples = 0;
            String company = scanner.nextLine();
            String input = scanner.nextLine();

            int counter = 0;

            while (!"Finish".equals(input)) {
                counter++;
                int peoples = Integer.parseInt(input);

                currentPeoples += peoples;


                average = currentPeoples / counter;

                input = scanner.nextLine();

            }
            if (average > mostPeoples) {
                mostPeoples = average;
                nameCompany = company;

            }

            System.out.printf("%s: %d passengers.%n", company, average);

        }

        System.out.printf("%s has most passengers per flight: %d", nameCompany, mostPeoples);
    }
}
