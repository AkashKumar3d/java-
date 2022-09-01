/*
      if else condition;
 */
import  java.util.Scanner;
public class ak16_if_else_condition {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your:  ");
        int age= sc.nextInt();

// if else condition:

        if (age>=50) {
            System.out.println("you are eligible for a senior citizen");
        }else{
            System.out.println("you are not eligible for a senior citizen");
        }
    }
}
