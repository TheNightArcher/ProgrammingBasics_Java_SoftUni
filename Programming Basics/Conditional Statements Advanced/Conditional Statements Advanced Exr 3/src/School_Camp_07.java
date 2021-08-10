import java.util.Scanner;

public class School_Camp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;


        //“Winter”, “Spring” или “Summer”
        //“boys”, “girls” или “mixed”

        switch (season) {
            case "Winter":
                switch (group) {
                    case "boys":
                        price = nights * 9.60;

                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Judo %.2f lv.", totalPrice);
                        break;
                    case "girls":
                        price = nights * 9.60;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Gymnastics %.2f lv.", totalPrice);
                        break;
                    case "mixed":
                        price = nights * 10;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Ski %.2f lv.", totalPrice);
                        break;
                }
                break;
            case "Spring":
                switch (group) {
                    case "boys":
                        price = nights * 7.20;

                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Tennis %.2f lv.", totalPrice);
                        break;
                    case "girls":
                        price = nights * 7.20;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Athletics %.2f lv.", totalPrice);
                        break;
                    case "mixed":
                        price = nights * 9.50;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Cycling %.2f lv.", totalPrice);
                        break;



                }
                break;
            case "Summer":
                switch (group) {
                    case "boys":
                        price = nights * 15;

                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Football %.2f lv.", totalPrice);
                        break;
                    case "girls":
                        price = nights * 15;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Volleyball %.2f lv.", totalPrice);
                        break;
                    case "mixed":
                        price = nights * 20;
                        if (students >= 50) {
                            price = students * price;
                            totalPrice = price - 0.50 * price;
                        } else if (students >= 20 && students < 50) {
                            price = students * price;
                            totalPrice = price - 0.15 * price;
                        } else if (students >= 10 && students < 20) {
                            price = students * price;
                            totalPrice = price - 0.05 * price;
                        } else {
                            totalPrice = students * price;
                        }
                        System.out.printf("Swimming %.2f lv.", totalPrice);
                }
                break;
        }
    }
}
