import java.util.Scanner;

public class StudentMarkSheet2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name");
        String name = scanner.next();
        System.out.println("Enter Roll Number");
        String roll = scanner.next();
        System.out.println("Enter Maths Marks");
        int n1 = scanner.nextInt();
        System.out.println("Enter English Marks");
        int n2 = scanner.nextInt();
        System.out.println("Enter Science Marks");
        int n3 = scanner.nextInt();
        System.out.print(" Total Marks = ");
        System.out.println(n1+n2+n3);
        System.out.print(" Percentage = ");
        int n4 = (n1+n2+n3)/3;
        System.out.println(n4+ "%");

        if (n4>=80) {
            System.out.println(name + " is Pass");
            System.out.println("Grade is A+");
        }
        else if (n4>=60){
            System.out.println(name + " is Pass");
            System.out.println("Grade is A");
        }
        else if (n4>=50){
            System.out.println(name + " is Pass");
            System.out.println("Grade is B");
        }
        else if (n4>-35){
            System.out.println(name + " is Pass");
            System.out.println("Grade is C");
        }else{
            System.out.println(name + " is Fail");

        }










    }
}
