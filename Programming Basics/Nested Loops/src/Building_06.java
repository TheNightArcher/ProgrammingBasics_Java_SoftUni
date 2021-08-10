import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        String z = " ";

        for (int i = floors; i >= 1; i--) {
            for (int x = 0; x < rooms; x++) {

                if (i == floors) {
                    System.out.printf("L%d%d%s", i, x,z);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d%s", i, x,z);
                } else {
                    System.out.printf("A%d%d%s", i, x,z);
                }
            }
            System.out.println();
        }
    }
}
