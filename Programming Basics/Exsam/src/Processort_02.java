import java.util.Scanner;

public class Processort_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int procesors = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());


        int totalHours = workers * workingDays * 8;
        int madeProcesors = Math.abs(totalHours / 3);

        if ( madeProcesors < procesors){
            double needed = procesors - madeProcesors;
            double losses = needed * 110.10;

            System.out.printf("Losses: -> %.2f BGN",losses);
        }else {
            double left = madeProcesors - procesors;
            double win = left * 110.10;
            System.out.printf("Profit: -> %.2f BGN",win);
        }


    }
}
