import java.util.Scanner;

public class Personal_Titles_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String title = scanner.nextLine();

                if ("m".equals(title)){
                    if (age >= 16){
                        System.out.println("Mr.");
                }else {
                        System.out.print("Master");
                    }

        }else if ("f".equals(title)){
                    if (age >= 16){
                        System.out.println("Ms.");
                    }else {
                        System.out.println("Miss");
                    }
                }

        }
    }

