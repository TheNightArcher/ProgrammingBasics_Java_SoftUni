import java.util.Scanner;

public class ChallengeThe_Wedding_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());


        int counter = 0;

            for (int j = 1; j <= men; j++) {
                for (int k = 1; k <= women; k++) {
                    counter++;
                    if (counter <= tables){
                        System.out.printf("(%d <-> %d) ", j, k);
                    }
                }
            }

    }
}
