import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int periodDays = Integer.parseInt(scanner.nextLine());

        int treated = 0;
        int untreated = 0;
        int doctors = 7;


        for (int i = 1; i <= periodDays;i++){

          int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreated > treated){
                doctors += 1;
            }

          if (patients > doctors){
              treated += doctors;
              untreated += patients - doctors;
          }else {
              treated += patients;
          }


        }
        System.out.printf("Treated patients: %d.%n",treated);
        System.out.printf("Untreated patients: %d.",untreated);
    }
}
