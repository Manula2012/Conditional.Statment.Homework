import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter in uppercase ");
        String l=scanner.next();

        System.out.println("Lowercase of " +l+ " is " +l.toLowerCase());

    }
}

