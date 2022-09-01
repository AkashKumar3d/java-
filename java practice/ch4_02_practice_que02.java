/*
write a program to find out whether a student is pass
or fail ;if require total 40% at least 33% in each
student to pass. assume 3 subject and take markes from
the user;
 */


import  java.util.Scanner;
public class ch4_02_practice_que02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks for Tunumamaji :");

            // enter marks from user
            System.out.println("enter the marks of Tunumamaji in maths");
            int maths= sc.nextInt();
            System.out.println("enter the marks of Tunumamaji in hindi");
            int hindi= sc.nextInt();
            System.out.println("enter the marks of Tunumamaji in science");
            int science= sc.nextInt();

            System.out.println("math marks: "+maths);
            System.out.println("hindi marks: "+hindi);
            System.out.println("science marks: "+science);

            if (maths<=33) {
                System.out.println("you are fail in maths!");
            }else if (hindi<=33) {
                System.out.println("you are fail in hindi!");
            }else if (science<=33) {
                System.out.println("you are fail in science!");
            }else {
                System.out.println("you are passed in each subject!");
            }

            int t1=maths+hindi+science;
            System.out.println("your total marks is: "+t1);
            int total=t1*100/300;
            if (total <= 120) {
                System.out.println("Congratulation Tunumamji you are qualify railway exam and your percentage is: "+total+"%");
            }else{
                System.out.println("SORRY: you are fail try to next time: ");
            }
        }
    }
}
