import java.util.Scanner;

public class Equal_Sum_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int finishNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= finishNumber; i++) {
            int number = i;
            int even = 0;
            int odd = 0;

            for (int j = 6; j >= 1; j--) {

                int lastNumber = number % 10;
                number = number / 10;

                if (j % 2 == 0) {
                    even += lastNumber;
                }else {
                    odd +=lastNumber;
                }

            }
            if (even == odd){
                System.out.print(i + " ");
            }
        }
    }
}
