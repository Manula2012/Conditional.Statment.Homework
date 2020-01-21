import java.util.Scanner;

public class OddEvenTernary {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = scanner.nextInt();
        String differentiate = a % 2 == 0 ? a + " is an even number" : a + " is an odd number";
        System.out.println(differentiate);

        System.out.println("Enter your second number");
        int b = scanner.nextInt();
        String differentiate1 = b % 2 == 0 ? a + " is an even number" : b+ " is an odd number";
        System.out.println(differentiate1);











    }
}
