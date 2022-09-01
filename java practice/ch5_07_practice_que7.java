/*
write a program to print the following pattern. using while loop
* * * *
 * * *
  * *
   *
 */
// ye code ek baar teacher se puchana hai;

public class ch5_07_practice_que7 {
    public static void main(String[] args) {
        int n = 4;
       int i = n;
        int j = 0;
          while (i>0){
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }

     /* for(int i=n; i>0;i--){
            for (int j=0;j<i;j++){
// j<i ka matlab tab tak excute hoga jab tak i ki value j ke barabar n ho jaye
                System.out.print("*");
            }
            System.out.print("\n");
        }
      */



    }
}