// write to java program which ask the user to enter
// his/her name and greet than with "hello <name>,
// have a nice day" text;

import java.util.Scanner;

public class ch1_03_practice_que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name= sc.nextLine();

        System.out.print("hello "+ name +" Have a good day: ");

    }
}
