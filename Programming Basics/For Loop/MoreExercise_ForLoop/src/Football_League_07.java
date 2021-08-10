import java.util.Scanner;

public class Football_League_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int teamA = 0;
        int teamB = 0;
        int teamV = 0;
        int teamG = 0;



        for (int i = 1; i <= fans; i++) {

            String group = scanner.nextLine();

            if (group.equals("A")) {
                teamA += 1;
            } else if (group.equals("B")) {
                teamB += 1;
            } else if (group.equals("V")) {
                teamV += 1;
            } else if (group.equals("G")) {
                teamG += 1;
            }
        }


        double percentT1 = teamA * 1.0 / fans * 100;
        double percentT2 = teamB * 1.0 / fans * 100;
        double percentT3 = teamV * 1.0 / fans * 100;
        double percentT4 = teamG * 1.0 / fans * 100;
        double percentStadium = fans * 1.0 / stadium * 100;

        System.out.printf("%.2f%% %n",percentT1);
        System.out.printf("%.2f%% %n",percentT2);
        System.out.printf("%.2f%% %n",percentT3);
        System.out.printf("%.2f%% %n",percentT4);
        System.out.printf("%.2f%% ",percentStadium);

    }
}
