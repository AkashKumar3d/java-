/*
write a java method to print multiplication table of a number;
 */
import java.util.Scanner;
public class ch7_01_practice_que1 {
    static void t(int n){
        for (int i = 1; i <=10 ; i++) {
                System.out.printf("%d*%d=%d\n",n,i,(n*i));
        }

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("please enter the table: ");
            int n= sc.nextInt();
            t(n);
        }

    }
}
