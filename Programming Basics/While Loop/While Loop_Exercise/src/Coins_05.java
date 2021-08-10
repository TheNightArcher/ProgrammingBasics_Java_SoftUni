import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double coins = Double.parseDouble(scanner.nextLine());

        double coinsSt = Math.round(coins * 100);
        int coinsCount = 0;

       while (coinsSt > 0){
           if ( coinsSt >= 200){
               coinsSt -= 200;
               coinsCount++;
           }else if (coinsSt >= 100){
               coinsSt -= 100;
               coinsCount++;
           }else if (coinsSt >= 50){
               coinsSt -= 50;
               coinsCount++;
           }else if (coinsSt >= 20){
               coinsSt -= 20;
               coinsCount++;
           }else if (coinsSt >= 10){
               coinsSt -= 10;
               coinsCount++;
           }else if (coinsSt >= 5){
               coinsSt -= 5;
               coinsCount++;
           }else if (coinsSt >= 2){
               coinsSt -= 2;
               coinsCount++;
           }else if (coinsSt >= 1){
               coinsSt -= 1;
               coinsCount++;
           }
       }

       System.out.print(coinsCount);
    }
}
