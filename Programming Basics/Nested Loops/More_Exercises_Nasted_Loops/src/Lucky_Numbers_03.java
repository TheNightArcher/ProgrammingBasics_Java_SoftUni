import java.util.Scanner;

public class Lucky_Numbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    for (int l = 1; l < n; l++) {
                        int sumA = i + j;
                        int sumB = k + l;
                        if (sumA == sumB && n % sumA == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }

        }
    }
}
