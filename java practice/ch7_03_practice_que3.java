/*
write a program to print the following pattern .
* * * *
 * * *
  * *
   *
 */
public class ch7_03_practice_que3 {
    static void t(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
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
