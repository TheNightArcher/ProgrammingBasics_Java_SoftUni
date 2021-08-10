import java.util.Scanner;

public class Pipes_Pool_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double v = Double.parseDouble(scanner.nextLine());
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double litersBothPipes = p1*h + p2*h;

        if (litersBothPipes <= v){

            double percentV = (litersBothPipes/v*100);
            double percentP1 = (p1 * h/ litersBothPipes * 100);
            double percentP2 = (p2 * h/litersBothPipes * 100);

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentV,percentP1,percentP2);
        }else{
            double overflow = litersBothPipes - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,overflow);
        }
    }
}
