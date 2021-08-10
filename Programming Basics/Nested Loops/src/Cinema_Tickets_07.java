import java.util.Scanner;

public class Cinema_Tickets_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();

        int ticketsCounterStudent = 0;
        int ticketsCounterStandard = 0;
        int ticketsCounterKid = 0;

        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int currentPeoples = 0;

            for (int i = 0; i < seats; i++) {
                String tickets = scanner.nextLine();
                if (tickets.equals("standard")) {
                    ticketsCounterStandard++;
                } else if (tickets.equals("student")) {
                    ticketsCounterStudent++;
                } else if (tickets.equals("kid")) {
                    ticketsCounterKid++;
                } else if (tickets.equals("End")) {
                    break;
                }
                currentPeoples++;

            }
            double percentTickets = currentPeoples * 1.0 / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentTickets);
            movie = scanner.nextLine();
        }
        int totalTickets = ticketsCounterStandard + ticketsCounterKid + ticketsCounterStudent;
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",ticketsCounterStudent * 1.0 / totalTickets * 100 );
        System.out.printf("%.2f%% standard tickets.%n",ticketsCounterStandard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.",ticketsCounterKid * 1.0 / totalTickets * 100);

    }
}

