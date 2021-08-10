import java.util.Scanner;

public class Metric_Converter_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inPutDefinition = scanner.nextLine();
        String outPutDefinition = scanner.nextLine();

        if (inPutDefinition.equals("mm")){
            number = number / 1000;

        }else if (inPutDefinition.equals("cm")){
            number = number / 100;
        }
        if (outPutDefinition.equals("mm")){
            number = number * 1000;
        }else if (outPutDefinition.equals("cm")){
            number = number * 100;
        }

        System.out.printf("%.3f",number);


    }
}
