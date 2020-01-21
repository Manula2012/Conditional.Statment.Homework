import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter");
        char ch = scanner.next().charAt(0);


        switch (ch) {

            case 'A': System.out.println("Anuradhapura");
            break;

            case 'B':System.out.println("Buththala");
            break;
            case 'C': System.out.println("Colombo");
            break;
            case 'D': System.out.println("Dehiwala");
            break;
            case 'E':System.out.println("Ella");
            break;
            case 'F':System.out.println("Frankfurt");
            break;
            default:System.out.println("Invalid");
        }
    }
}
