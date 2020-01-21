import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String emp = scanner.next();
        System.out.println("Enter Employee Name");
        String name = scanner.next();
        System.out.println("Enter Basic Salary");
        int sal = scanner.nextInt();
        System.out.print("HRA =");
        System.out.println((sal * 10)/100);
        System.out.print("TA =");
        System.out.println((sal*9)/100);
        System.out.print("DA =");
        System.out.println((sal*8)/100);
        System.out.print("PF =");
        System.out.println((sal*20)/100);
        System.out.print("Gross Salary = ");
        System.out.println(sal +(sal*10/100)+(sal*9/100)+(sal*8/100)-(sal*20/100));


    }
}
