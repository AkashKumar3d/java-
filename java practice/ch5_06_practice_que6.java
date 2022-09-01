/*
write a program to find the factorial of a
given number using while loop
 */

import java.util.Scanner;

public class ch5_06_practice_que6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of n");
            int n= sc.nextInt();
            int fact=1;
            int i=1;
            while (i<=n){
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
