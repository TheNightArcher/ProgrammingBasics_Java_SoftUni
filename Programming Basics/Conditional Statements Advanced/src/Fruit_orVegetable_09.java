import java.util.Scanner;

public class Fruit_orVegetable_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String someShit = scanner.nextLine();

        switch (someShit){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
