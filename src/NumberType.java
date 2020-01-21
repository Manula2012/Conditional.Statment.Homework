import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println(" value is zero");
        }
            else if (a<0) {
            System.out.println(a+ " is a negative number");
        }
            else {System.out.println(a+ " is a positive number");
        }
    }
}
