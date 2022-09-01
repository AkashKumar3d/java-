// write a program to calculate CGPA using marks of three subject;
// (out of 100);
import  java.util.Scanner;
public class ch1_02_practice_que2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the grade of java: ");
            float sub1= sc.nextFloat();

            System.out.println("Enter the grade of c language: ");
            float sub2= sc.nextFloat();

            System.out.println("Enter the grade of javascript: ");
            float sub3= sc.nextFloat();

      double CGPA=(sub1+sub2+sub3)/(3.0);// logic to calculate CGPA;
            System.out.print("the CGPA of total marks: ");
            System.out.println(CGPA);
        }
    }
}
