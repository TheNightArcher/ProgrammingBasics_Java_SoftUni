import java.util.Scanner;

public class Invalid_Number_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 100 && number <= 200 || number == 0) {

        } else if (number < 0 || number < 100 || number >200) {
            System.out.println("invalid");
        }
    }
}
