import java.util.Scanner;

public class Greater_Number02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a > b) {
            System.out.print(a);
        }else {
            System.out.print(b);
        }
    }
}
