import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;

        for (int i = 0; i <= number; i++) {
            for (int x = 0; x <= number; x++) {
                for (int y = 0; y <= number; y++) {

                    int result = i + x + y;

                    if ( result == number){
                        combinationCounter++;
                    }
                }

            }

        }

        System.out.print(combinationCounter);
    }
}
