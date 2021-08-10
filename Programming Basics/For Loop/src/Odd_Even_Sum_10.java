import java.time.Year;
import java.util.Scanner;

public class Odd_Even_Sum_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;

        for (int i =0; i < n;i++){

            int powerTwo  = Integer.parseInt(scanner.nextLine());
            if ( i % 2 == 0){
                even += powerTwo;
            }else {
                odd += powerTwo;
            }
        }

        if (odd == even){

            System.out.printf("Yes %nSum = " + odd);
        }else {
            int diff = Math.abs(odd - even);
            System.out.printf("No %nDiff = " + diff);
        }
    }
}
