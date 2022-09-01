/*
write a program of fibonacci series using the recursion;
 */
import java.util.Scanner;
public class ch7_05_practice_que5 {
    static int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {

            return f(n - 1) + f(n - 2);
        }
    }
    /*
    logic fibonacci series f(n-1) + f(n-2)
   fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to find fibonacci series: ");
            int m= sc.nextInt();
            System.out.println(f(m));
        }
    }
}
