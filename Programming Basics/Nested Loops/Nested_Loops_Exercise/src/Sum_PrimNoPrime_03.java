import java.util.Scanner;

public class Sum_PrimNoPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int noPrime = 0;
        int isPrime = 0;


        while (!input.equals("stop")) {

            int numbers = Integer.parseInt(input);
            boolean isNoPrime = false;

            if (numbers < 0) {
                System.out.printf("Number is negative.%n");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0){
                    isNoPrime = true;
                    break;
                }
            }

            if (isNoPrime){
                noPrime += numbers;
            }else {
                isPrime += numbers;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d %n",isPrime);
        System.out.printf("Sum of all non prime numbers is: %d",noPrime);
    }
}
