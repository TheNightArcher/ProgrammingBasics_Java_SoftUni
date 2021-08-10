import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());


        double statuetPrice = rent - rent * 0.30;
        double kuteringPrice = statuetPrice - statuetPrice * 0.15;
        double audioPrice = kuteringPrice / 2 ;

        double totalSum = rent + statuetPrice + kuteringPrice + audioPrice;

        System.out.printf("%.2f",totalSum);
    }
}
