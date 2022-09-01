/*
write a program to find the factorial of a
given number using for loop
 */

import java.util.Scanner;

public class ch5_04_practice_que4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the any number: ");
            int n= sc.nextInt();
            int fact=1;
            for (int i = 1; i <=n ; i++) {
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}
