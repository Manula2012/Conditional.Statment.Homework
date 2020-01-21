import java.util.Scanner;

public class MathsOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = scanner.nextDouble();
        System.out.println("Enter Second Number");
        double b = scanner.nextDouble();
        System.out.println("Enter an operator");
        char ch = scanner.next().charAt(0);

        switch (ch){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;

            default: System.out.println("invalid operator");

        }
    }
}
