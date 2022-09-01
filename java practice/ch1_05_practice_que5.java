// Write a java program to detect whether a number entered
// by the user is integer or not;

import java.util.Scanner;
public class ch1_05_practice_que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        System.out.println(sc.hasNextInt());
    }
}
