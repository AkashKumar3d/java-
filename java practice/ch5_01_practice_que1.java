/*
write a program to print the following pattern .
* * * *
 * * *
  * *
   *
 */


public class ch5_01_practice_que1 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n; i>0;i--){
            for (int j=0;j<i;j++){
                // j<i ka matlab tab tak excute hoga jab tak i ki value j ke barabar n ho jaye
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
