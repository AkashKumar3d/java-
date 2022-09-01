 /*
 -------------------->Recursions<---------------------
 A function or methods in java can call itself such calling
 of function by itself is called recursion;
  */
 public class ak7_recursion{
  // recursion method
     static int factorial(int n){
         if (n == 0 || n==1) {
             return 1;
         }else{
             return n*factorial(n-1);
         }

         }
  // itrative method
     static int fact(int f){
         if (f == 0 || f==1) {
             return 1;
         }else{
             int multiply=1;
             for (int i=1;i<=f;i++){
                 multiply *=i;
             }
             return  multiply;
         }
     }
     public static void main(String[] args) {
         int a=5;
         System.out.println("the factorial of a is: "+factorial(a));
         System.out.println("the factorial of a is: "+fact(a));
     }
     }