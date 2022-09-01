import java.util.Scanner;

public class ch7_04_practice_que4 {
    static int n(int n){

        if (n == 0 || n==1) {
            return 1;
        }else {
            return n*(n+1)/2;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the any number");
            int n= sc.nextInt();
            System.out.println("the sum of n numbers is: "+n(n));
        }
    }
}
