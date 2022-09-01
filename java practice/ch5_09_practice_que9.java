/*
write a program to calculate  the sum of the numbers
accruing in the multiplication table of 8;
 */

public class ch5_09_practice_que9 {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum =sum+(n*i);
        }
        System.out.println(sum);
    }
}
