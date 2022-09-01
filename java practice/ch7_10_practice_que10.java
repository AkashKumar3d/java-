/*
write a function to calculate sum of n natural number;
 */
import java.util.Scanner;
public class ch7_10_practice_que10 {
    static void sum(int n){
            int add=0;
            for (int i = 1; i <=n ; ++i) {
                add =add+ i;
            }
        System.out.println("the sum of n natural number is: "+add);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n= sc.nextInt();
            sum(n);
        }
    }
}
