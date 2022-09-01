package com.company;
import java.util.Scanner;

public class ak05_exercise_calculate_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // for first sub marks
        System.out.println("Enter nf marks outof 100: ");
        float s1=sc.nextFloat();

        // for second sub marks
        System.out.println("Enter OS marks outof 100: ");
        float s2=sc.nextFloat();

        //for third sub marks
        System.out.println("Enter DEM marks outof 100: ");
        float s3=sc.nextFloat();

        // for four sub marks
        System.out.println("Enter oops marks outof 100: ");
        float s4=sc.nextFloat();

        // for five sub marks
        System.out.println("Enter DBMS marks outof 100: ");
        float s5=sc.nextFloat();


        float sum=s1+s2+s3+s4+s5;
        System.out.print("total marks of the student: ");
        System.out.println(sum);


        float  total=sum*100/500;// logic ko calculate the percentage;
        System.out.print("percentage of the student :");
        System.out.print(total);
        System.out.println("%");
    }
}
