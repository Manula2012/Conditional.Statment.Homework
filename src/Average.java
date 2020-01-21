import java.awt.*;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int i1 = scanner.nextInt();
        System.out.println("Enter Your Second Number");
        int i2 = scanner.nextInt();
        System.out.println("Enter Your Third Number");
        int i3 = scanner.nextInt();
        System.out.println("Enter Your Fourth  First Number");
        int i4 = scanner.nextInt();
        System.out.println("Enter Your Fifth Number");
        int i5 = scanner.nextInt();
        System.out.print("Average of Five Numbers = ");
        System.out.println((i1+i2+i3+i4+i5)/5);

    }
}
