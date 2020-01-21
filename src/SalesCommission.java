import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID");
        String id = scanner.next();
        System.out.println("Enter Seller's Name");
        String name = scanner.next();
        System.out.println("Sales Amount");
        int a = scanner.nextInt();
        System.out.println("Salary Basic");
        int sal = scanner.nextInt();


        if(a >=50000) {
            System.out.print("Sales Commission is ");
            System.out.println(a*35/100);

        }else if (a>=30000){
            System.out.print("Sales Commission is ");
            System.out.println(a*20/100);

        }else if (a>=20000) {
            System.out.print("Sales Commission is ");
            System.out.println(a*10/100);
        }
        else if (a>=10000) {
            System.out.print("Sales Commission is ");
            System.out.println(a*5/100);
        }else {
            System.out.print("Sales Commission is ");
            System.out.println(a*2/100);
        }
    }
}
