/*
repeat que 2 using for loop
 */
import java.util.Scanner;

public class ch5_11_practice_que11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the any number");
            int n= sc.nextInt();
            for (int i = 0; i <=n ; i++) {
                System.out.println(i);
            }
        }
    }
}
