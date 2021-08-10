import java.util.Scanner;

public class Ski_Trip_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double price = 0;


        switch (room) {
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                price = nights * 25.00;
                break;
            case "president apartment":
                price = nights * 35.00;
                break;

        }switch (room){

            case "apartment":
                if (nights < 10){
                    price = price - 0.30 * price;
                }else if (nights >= 10 && nights <= 15){
                    price = price - 0.35 * price;
                }else if (nights > 15){
                    price = price - 0.50 * price;
                }break;
            case "president apartment":
                if (nights < 10){
                    price = price - 0.10 * price;
                }else if (nights >= 10 && nights <= 15){
                    price = price - 0.15 * price;
                }else if (nights > 15){
                    price = price - 0.20 * price;
                }
        }if (rating.equals("positive")){
            price = price + 0.25 * price;
        }else if (rating.equals("negative")){
            price = price - 0.10 * price;
        }
        System.out.printf("%.2f",price);
    }
}
