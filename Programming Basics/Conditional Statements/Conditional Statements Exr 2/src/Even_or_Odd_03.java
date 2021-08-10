import java.util.Scanner;

public class Even_or_Odd_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.print("even");
        }else {
            System.out.print("odd");
        }
    }
}
