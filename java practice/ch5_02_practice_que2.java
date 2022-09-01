/*
write a program to first n natural number using while loop;
 */
import  java.util.Scanner;
public class ch5_02_practice_que2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n:");
            int n= sc.nextInt();
            int i=0;
            while (i<=n){
                System.out.println(i);
                i++;
            }
        }
    }
}
