import java.util.Scanner;

public class Sum_of_Two_Numbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstCombination = Integer.parseInt(scanner.nextLine());
        int secondCombination = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFlag = false;

        for (int i = firstCombination; i <= secondCombination; i++) {

            for (int x = firstCombination; x <= secondCombination; x++) {
                counter++;
                if (i + x == magicNumber) {
                    isFlag = true;
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, x, magicNumber);
                    break;
                }
            }
            if (isFlag){
                break;
            }
        }

        if (!isFlag) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
