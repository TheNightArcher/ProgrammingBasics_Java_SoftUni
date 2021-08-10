import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int soap = bottles * 750;
        int dishCount = 0;
        int washedPlates = 0;
        int washedPot = 0;
        int afterWashed = 0;

        while (!input.equals("End")) {

            int dishes = Integer.parseInt(input);
            dishCount++;


            if (dishCount % 3 == 0) {
                afterWashed = dishes * 15;
                soap -= afterWashed;
                washedPot += dishes;
            } else {
                afterWashed =  dishes * 5;
                soap -= afterWashed;
                washedPlates +=dishes;
            }
            if (soap < 0 ) {
                System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(soap) );
                break;
            }

            input = scanner.nextLine();


        }


        if (input.equals("End")){
            System.out.printf("Detergent was enough! %n");
            System.out.printf("%d dishes and %d pots were washed. %n",washedPlates,washedPot);
            System.out.printf("Leftover detergent %d ml.",soap);
        }
    }
}


