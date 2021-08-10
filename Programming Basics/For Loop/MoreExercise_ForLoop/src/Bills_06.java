import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int months = Integer.parseInt(scanner.nextLine());

        double total = 0;
        double water = 0;
        double internet = 0;
        double other = 0;
        double average = 0;



        for ( int i = 1;i <= months;i++) {

            double electricity = Double.parseDouble(scanner.nextLine());

            total += electricity;

        }
        water = months * 20;
        internet = months * 15;
        other = ( total + water + internet) * 1.2;
        average = (total + water + internet + other) / months;



        System.out.printf("Electricity: %.2f lv %n",total);
        System.out.printf("Water: %.2f lv %n",water);
        System.out.printf("Internet: %.2f lv %n",internet);
        System.out.printf("Other: %.2f lv %n",other);
        System.out.printf("Average: %.2f lv",average);

    }
}
