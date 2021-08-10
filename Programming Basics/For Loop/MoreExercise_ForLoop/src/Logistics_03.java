import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalTons = 0;

        int tonsMic = 0;
        int tonsTruck = 0;
        int tonsTrain = 0;



        for (int i = 1; i <= n;i++){

            int tons = Integer.parseInt(scanner.nextLine());

            totalTons += tons;

            if (tons <= 3){
                tonsMic += tons;


            }else if (tons >= 4 && tons <= 11){
                tonsTruck += tons;



            }else if (tons >= 12){
                tonsTrain += tons;


            }
        }

        double midPrice = (tonsMic *200 * 1.0 + tonsTruck * 175 + tonsTrain * 120) / totalTons ;

        double percentMicro = tonsMic * 1.0 / totalTons * 100;
        double percentTruck = tonsTruck * 1.0 / totalTons * 100;
        double percentTrain = tonsTrain * 1.0 / totalTons * 100;

        System.out.printf("%.2f %n",midPrice);
        System.out.printf("%.2f%% %n",percentMicro);
        System.out.printf("%.2f%% %n",percentTruck);
        System.out.printf("%.2f%% ",percentTrain);
    }
}
