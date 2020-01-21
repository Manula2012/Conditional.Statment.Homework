import java.util.Scanner;

public class StudentMarkSheet1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name");
        String s1 = scanner.next();
        System.out.println("Enter Roll Number");
        String s2 = scanner.next();
        System.out.println("Enter maths marks");
        int i1 = scanner.nextInt();
        System.out.println("Enter English marks");
        int i2 = scanner.nextInt();
        System.out.println("Enter Science marks");
        int i3 = scanner.nextInt();
        System.out.print("Total Marks = ");
        System.out.println(i1+i2+i3);
        System.out.print(" Percentage = ");
        int i4 = (i1+i2+i3)/3;
        System.out.println(i4+ "%");

        if(i1<35 ||i2<35||i3<35){
            System.out.println("Fail");
        }
        else if (i4>=80){
            System.out.println("Pass");
            System.out.println("Grade is A+" );
        }
        else if (i4>=60){
            System.out.println("Pass");
            System.out.println("Grade is A");
        }
        else if (i4>=50){
            System.out.println("Pass");
            System.out.println("Grade is B");
        }
        else if (i4>=35){
            System.out.println("Pass");
            System.out.println("Grade is C");
        }



    }
}
