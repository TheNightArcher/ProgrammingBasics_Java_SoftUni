import java.util.Scanner;

public class Equal_Pairs_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        boolean chek = true;
        int diff = 0;

        for (int i = 1 ; i <= n;i++){

            int num1= Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0){
                first = num1 + num2;
            }else {
                second = num1 + num2;
            }


            if (first == second || n < 2){
                chek = true;
            }else {
                diff = Math.abs(second - first);
                chek = false;
            }

        }

        if (chek){
            System.out.printf("Yes, value=%d",first);
        }else {
            System.out.printf("No, maxdiff=%d",diff);
        }

    }
}
