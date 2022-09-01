/*
write a program using function to print the following pattern;
*
**
***
****
 */
public class ch7_02_practice_que2 {
    static void  t(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n=4;
        t(n);
    }
}
