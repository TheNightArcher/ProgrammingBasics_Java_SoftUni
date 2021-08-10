import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String country = scanner.nextLine();


        while (!country.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double saving = 0;
            while (saving < budget ){
                saving += Double.parseDouble(scanner.nextLine());

            }
                System.out.printf("Going to %s!%n",country);
            country = scanner.nextLine();
        }

    }
}
