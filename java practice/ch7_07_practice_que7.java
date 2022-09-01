import java.util.Scanner;

public class ch7_07_practice_que7 {
    static void pattern(int n){
        if (n>0) {
            for (int i = n; i >0 ; i--) {
                System.out.print("*");
            }
            System.out.println(" ");
            pattern(n-1);
        }

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the  any number for print the star : ");
            int n=sc.nextInt();
     pattern(n);
        }

    }
}
