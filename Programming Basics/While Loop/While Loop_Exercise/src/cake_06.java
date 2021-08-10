import java.util.Scanner;

public class cake_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int together = width * height;
        int leftPieces = 0;
        boolean isLeft = false;


        while (!input.equals("STOP")) {

            int pieces = Integer.parseInt(input);

            together -= pieces;

            if (together < 0) {
                break;
            }
            input = scanner.nextLine();

        }

        if (input.equals("STOP")) {
            isLeft = true;
        }

        if (isLeft) {
            System.out.printf("%d pieces are left.", together);
        }

        if (!isLeft) {
                int neededPieces = Math.abs(leftPieces - together);
                System.out.printf("No more cake left! You need %d pieces more.", neededPieces);

        }


    }
}
