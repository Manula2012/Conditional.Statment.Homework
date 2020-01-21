import java.util.Scanner;

public class InterchangedValue {

    public static void main(String[] a1rgs) {

        int a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A and B");
        System.out.print(" A = ");
         a  = scanner.nextInt();
        System.out.print(" B = ");
         b = scanner.nextInt();

         a=a+b;
         b=a-b;
         a=a-b;

        System.out.println(" A = " +a);
        System.out.println(" B = " +b);








    }
}
