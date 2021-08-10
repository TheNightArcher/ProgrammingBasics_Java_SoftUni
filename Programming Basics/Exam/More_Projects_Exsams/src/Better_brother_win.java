import java.util.Scanner;

public class Better_brother_win {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double weather = Double.parseDouble(scanner.nextLine());

        if (weather < 5.00){
            System.out.print("unknown");
        }else if (weather <= 11.9){
            System.out.print("Cold");
        }else if (weather <=14.9){
            System.out.print("Cool");
        }else if (weather <=20.00){
            System.out.print("Mild");
        }else if (weather <= 25.9){
            System.out.print("Warm");
        } else if (weather <= 35.00) {
            System.out.print("Hot");
        }else {
            System.out.print("unknown");
        }
    }
}
