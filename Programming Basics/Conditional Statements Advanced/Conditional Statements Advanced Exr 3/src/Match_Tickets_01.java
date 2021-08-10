import java.util.Scanner;

public class Match_Tickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peoples = Integer.parseInt(scanner.nextLine());

        double transport = 0;
        double ticket = 0;

        if (peoples >= 1 && peoples <= 4){
            transport = budget - 0.75 * budget;
        }else if (peoples >= 5 && peoples <= 9){
            transport = budget - 0.60 * budget;
        }else if (peoples >= 10 && peoples <= 24){
            transport = budget - 0.50 * budget;
        }else if (peoples >= 25 && peoples <=49){
            transport = budget - 0.40 * budget;
        }else if (peoples >= 50 ){
            transport = budget - 0.25 * budget;
        }

        if (category.equals("VIP")){
            ticket = 499.99 * peoples;
        }else if (category.equals("Normal")){
            ticket = 249.99 * peoples;
        }

        if (ticket > transport){
            double moneyNeeded = ticket - transport;
            System.out.printf("Not enough money! You need %.2f leva.",moneyNeeded);
        }else {
            double moneyLeft = transport - ticket;

            System.out.printf("Yes! You have %.2f leva left.",moneyLeft);
        }



    }
}
