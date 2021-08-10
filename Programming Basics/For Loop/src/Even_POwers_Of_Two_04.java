import java.util.Scanner;

public class Even_POwers_Of_Two_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        for (int i = 0; i <= n; i += 2) {
            if (i == 0) {
                number *= 1;
            }else{
                number *= 4;
            }
            System.out.println(number);

        }

    }
}


