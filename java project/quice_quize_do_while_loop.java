
/*
write a program to print first n natural number;
 */
import java.util.Scanner;

public class quice_quize_do_while_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any number: ");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
