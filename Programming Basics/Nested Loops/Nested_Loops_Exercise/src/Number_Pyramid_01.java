import java.util.Scanner;

public class Number_Pyramid_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int lens = 1; lens <= rows; lens++) {
                if (current > n){
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ",current);
                current++;
            }

            if (isBigger){
                break;
            }
            System.out.println();
        }

    }
}
