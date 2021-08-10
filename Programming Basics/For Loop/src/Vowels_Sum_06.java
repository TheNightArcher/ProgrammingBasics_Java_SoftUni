import java.util.Scanner;

public class Vowels_Sum_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        int sum = 0;

        for (int i = 0;i < words.length();i++){

            char letters = words.charAt(i);

            switch (letters){

                case'a':
                    sum += 1;
                    break;
                case'e':
                    sum += 2;
                    break;
                case'i':
                    sum += 3;
                    break;
                case'o':
                    sum += 4;
                    break;
                case'u':
                    sum += 5;
                    break;

            }

        }
        System.out.print(sum);

    }
}
