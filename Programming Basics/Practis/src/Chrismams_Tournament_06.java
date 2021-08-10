import java.util.Scanner;

public class Chrismams_Tournament_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournamentsDays = Integer.parseInt(scanner.nextLine());


        double totalMoney = 0;

        int totalWins = 0;
        int totalLose = 0;

        for (int i = 0; i < tournamentsDays; i++) {

            int winCounter = 0;
            int loseCounter = 0;
            double money = 0;

            String input = scanner.nextLine();

            while (!input.equals("Finish")){

                String result = scanner.nextLine();

                if (result.equals("win")){
                    winCounter++;
                    money +=20;
                }else if (result.equals("lose")){

                    loseCounter++;
                }

                input = scanner.nextLine();
            }

            if (winCounter > loseCounter){
                money += money * 0.10;
                totalWins++;
            }else {
                totalLose++;
            }

            totalMoney += money;


        }

        if (  totalWins > totalLose){
            totalMoney += totalMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
