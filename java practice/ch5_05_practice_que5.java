/*
write a program to print table multiplication table of 10 in
reverse order;
 */

public class ch5_05_practice_que5 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 10; i >=1 ; i--) {
            System.out.printf("%d X %d=%d\n",n,i,(n*i));
        }
    }
}
