import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int theNumberOfGroup = Integer.parseInt(scanner.nextLine());

        int groupMusala = 0;
        int groupMobbala = 0;
        int groupKilman = 0;
        int groupK2 = 0;
        int groupEverest = 0;

        int allPeoples = 0;

        for (int i = 0; i < theNumberOfGroup; i++) {

            int peoplesInGroup = Integer.parseInt(scanner.nextLine());

            allPeoples += peoplesInGroup;

            if (peoplesInGroup <= 5) {
                groupMusala += peoplesInGroup;
            } else if (peoplesInGroup >= 6 && peoplesInGroup <= 12) {

                groupMobbala += peoplesInGroup;
            } else if (peoplesInGroup >= 13 && peoplesInGroup <= 25) {

                groupKilman += peoplesInGroup;
            } else if (peoplesInGroup >= 26 && peoplesInGroup <= 40) {

                groupK2 += peoplesInGroup;
            } else if (peoplesInGroup >= 41) {
                groupEverest += peoplesInGroup;
            }
        }

        System.out.printf("%.2f%%%n", groupMusala * 1.0 / allPeoples * 100);
        System.out.printf("%.2f%%%n", groupMobbala * 1.0 / allPeoples * 100);
        System.out.printf("%.2f%%%n", groupKilman * 1.0 / allPeoples * 100);
        System.out.printf("%.2f%%%n", groupK2 * 1.0 / allPeoples * 100);
        System.out.printf("%.2f%%", groupEverest * 1.0 / allPeoples * 100);


    }
}
