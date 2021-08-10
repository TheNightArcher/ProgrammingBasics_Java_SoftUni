import java.util.Scanner;

public class Password_Generator_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int a = 97 +l;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < a; k++) {
                    char symbol = (char) k;
                    for (int x = 97; x < a; x++) {
                        char symbol2 = (char) x;
                        for (int m = 1; m <= n; m++) {
                            if (m > i && m > j){
                                System.out.printf("%d%d%c%c%d ",i,j,k,x,m);
                            }

                        }
                    }
                }

            }

        }
    }
}
