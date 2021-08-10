import java.util.Scanner;

public class
Letters_Combinations_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char letterStart = scanner.nextLine().charAt(0);
        char letterEnd = scanner.nextLine().charAt(0);
        char letterIgnore = scanner.nextLine().charAt(0);

        int isFound = 0;

        for (char i = letterStart; i <= letterEnd; i++) {
            for (char j = letterStart; j <= letterEnd; j++) {
                for (char k = letterStart; k <= letterEnd; k++) {
                    if (i != letterIgnore && j != letterIgnore && k != letterIgnore) {
                        System.out.print("" + i + j + k + " ");
                        isFound++;
                    }

                }
            }
        }
        System.out.print(isFound);


    }
}
