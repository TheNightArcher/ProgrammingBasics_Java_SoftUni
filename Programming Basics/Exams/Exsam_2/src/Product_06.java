import java.util.Scanner;

public class Product_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 9; l >= k; l--) {

                        double sum = (i + j + k + l);
                        double product = (i * j * k * l);
                        double some = Math.floor(product / sum);


                        if (some == 3.0 && n % 3 == 0 ) {
                            System.out.printf("%d%d%d%d",l,k,j,i);
                            return;
                        } else if (sum == product && n % 10 == 5) {

                            System.out.printf("%d%d%d%d",i,j,k,l);
                            return;
                        }

                    }
                }
            }
        }
        System.out.print("Nothing found");
    }
}
