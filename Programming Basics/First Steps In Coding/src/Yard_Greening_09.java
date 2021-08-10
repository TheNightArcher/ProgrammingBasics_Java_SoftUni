import javax.sound.sampled.Line;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Yard_Greening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double place = Double.parseDouble(scanner.nextLine());
        double priceForAllGreening = place * 7.61;
        double discount = (0.18/100);
        double discountAllPrice = priceForAllGreening * 0.18;
        double TheFinalPrice = priceForAllGreening - discountAllPrice;
        System.out.printf("The final price is : %f lv. %n The discount is : %f lv.",TheFinalPrice,discountAllPrice);


    }
}
