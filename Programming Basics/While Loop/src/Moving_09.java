import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length  =Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        String space = scanner.nextLine();
        int boxesSpace = 0;
        int freeSpace = width * length * height;
        boolean isSpace = false;

        while (!space.equals("Done")){

            int boxes = Integer.parseInt(space);
            boxesSpace +=boxes;

            if (freeSpace < boxesSpace ){
                int needed = boxesSpace - freeSpace;
                System.out.printf("No more free space! You need %d Cubic meters more.",needed);
                isSpace = true;
                break;
            }
            space = scanner.nextLine();
        }

        if (!isSpace){
            int left = freeSpace - boxesSpace;
            System.out.printf("%d Cubic meters left.",left);
        }
    }
}
