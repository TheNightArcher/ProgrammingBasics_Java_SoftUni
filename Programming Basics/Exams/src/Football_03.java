import java.util.Scanner;

public class Football_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int countSouvenirs = Integer.parseInt(scanner.nextLine());


        double price = 0;
        double totalPrice = 0;



        if ("Argentina".equals(team)) {
            switch (souvenir) {

                case "flags":
                    price = 3.25;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "caps":
                    price = 7.20;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "posters":
                    price = 5.10;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "stickers":
                    price = 1.25;

                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                default:{
                    System.out.print("Invalid stock!");
                    break;
                }
            }
        } else if ("Brazil".equals(team)) {
            switch (souvenir) {

                case "flags":
                    price = 4.20;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "caps":
                    price = 8.50;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "posters":
                    price = 5.35;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "stickers":
                    price = 1.20;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                default:{
                    System.out.print("Invalid stock!");
                    break;
                }
            }
        } else if ("Croatia".equals(team)) {
            switch (souvenir) {

                case "flags":
                    price = 2.75;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "caps":
                    price = 6.90;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "posters":
                    price = 4.95;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "stickers":
                    price = 1.10;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                default:{
                    System.out.print("Invalid stock!");
                    break;
                }
            }
        } else if ("Denmark".equals(team)) {
            switch (souvenir) {

                case "flags":
                    price = 3.10;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "caps":
                    price = 6.50;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "posters":
                    price = 4.80;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                case "stickers":
                    price = 0.90;
                    totalPrice = price * countSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenir, team, totalPrice);
                    break;
                default:{
                    System.out.print("Invalid stock!");
                    break;
                }

            }
        }else {
            System.out.print("Invalid country!");

        }

    }
}
