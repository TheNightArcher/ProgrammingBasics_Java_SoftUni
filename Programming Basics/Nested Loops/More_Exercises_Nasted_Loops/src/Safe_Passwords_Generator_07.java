import java.util.Scanner;

public class Safe_Passwords_Generator_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aNumber = Integer.parseInt(scanner.nextLine());
        int bNumber = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int i = 35;
        int j = 64;


        while (i <= 55) {
            while (j <= 96) {

                for (int k = 1; k <= aNumber; k++) {
                    for (int l = 1; l <= bNumber; l++) {


                        char one = (char) i;
                        char two = (char) j;

                        i++;
                        j++;

                        if (counter >= maxNumber ||k == aNumber && l == bNumber) {
                            return;
                        }
                        if (i > 55) {
                            i = 35;
                        }

                        if (j > 96) {
                            j = 64;
                        }

                        System.out.printf("%c%c%d%d%c%c|", one, two, k, l, two, one);
                        counter++;



                    }
                }
            }
        }
    }
}

