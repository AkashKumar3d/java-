/*
write a program to print multiplication table of given
number n;
 */

import java.util.Scanner;

public class ch5_03_practice_que3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the any number:");
            int n= sc.nextInt();
            for (int i = 1; i <=10 ; i++) {
                System.out.printf("%d X %d =%d\n",n,i,(n*i));
            }
        }
    }
}
