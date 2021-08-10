import java.util.Scanner;

public class Volleyball_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekend = Integer.parseInt(scanner.nextLine());
        double totalGames = 0;
        double yearWeekends = 48 - weekend;

        double weekendsSofia = yearWeekends * 3.0/4;
        double gamesInSofia = holidays * 2.0/3;
        totalGames = weekendsSofia + weekend + gamesInSofia;

        if (year.equals("leap")){

            double leapGames = totalGames * 0.15;
            double totalYearGames = totalGames + leapGames;
            double finalResult = Math.floor(totalYearGames);
            System.out.printf("%.0f",finalResult);
        }else {
             totalGames = weekendsSofia + weekend + gamesInSofia;

            double Result = Math.floor(totalGames);
            System.out.printf("%.0f",Result);
        }
    }
}
