import java.util.Scanner;

public class Old_Books_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String input = scanner.nextLine();

        int countBooks = 0;


        while (true){

            if (input.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",countBooks);
                break;
            }
            else if (input.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.",countBooks);
                break;
            }
            else {
                countBooks++;

                input = scanner.nextLine();

            }
        }
    }
}
