import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Pet_Shop_08 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double dogs = Double.parseDouble(scanner.nextLine());
      double another = Double.parseDouble(scanner.nextLine());
      double dogFood = dogs * 2.50;
      double anotherFood = another * 4.00;
      System.out.print(dogFood + anotherFood);
    }
}
