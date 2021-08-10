import java.util.Scanner;

public class AnotherSix {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int tournament = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;

        int totalWins = 0;
        int totalLose = 0;



        for (int i = 1; i <= tournament; i++) {


            int winCounter = 0;
            int loseCounter = 0;
            double money = 0;


            String input = scanner.nextLine();

            while (!input.equals("Finish")) {
                String end = scanner.nextLine();

                if (end.equals("win")) {
                    money += 20;
                    winCounter++;

                } else {
                    loseCounter++;

                }

                input = scanner.nextLine();

            }

            if (winCounter > loseCounter) {
                money = money + 0.10 * money;
                totalWins ++;
            }else {
                totalLose ++;
            }

            totalMoney += money;



            if ( i == tournament && totalWins > totalLose) {
                totalMoney += 0.20 * totalMoney ;
                System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
            }else if (i == tournament && totalWins < totalLose){
                System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
            }
        }



    }
}
