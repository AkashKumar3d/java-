// associativity of opretor:

import  java.util.Scanner;
public class ak09_associativity_of_opretor {
    public static void main(String[] args) {
//        associativity and precedence gose to *and/; then they are evaluate on the
//        basis of left to right associativity;
        int n= 6*4-34/2;
        /*
        // highest precendce
        6*4-34/2
        24-17
        7
         */
//        System.out.println(a);

        int m=6*4-34/2;
        /*
        jab dono opretor ki precedence same ho hame left to right equtions ko solve karana
        chahiye;
        6*4-34/2
        24-34/2
        24-17
        7
         */

// quick quiz solution
// que1
        int x=6;
        int y=4;
        int z=x-y/2;
//        System.out.println(z);

// que2:
//int a=2;
//int b=4;
//int c=3;
//   int equ=b*b-(4*a*c)/(2*a);
   /*
   pattern:
   4*4-(4*2*3)/(2*2)
   16-24/4
   16-6
   10
    */
//        System.out.println(equ);


// que3
int v=2;
int u=3;
int t=(v*v)-(u*u);
/*
pattern:
(2*2)-(3*3)
4-9
-5
 */
        System.out.println(t);

//que4:
int  a=2;
int b=3;
int d=2;
int equ1=a*b-d;
        System.out.println(equ1);
/*
pattern:
2*3-2
6-2
4
 */
    }
}


   /*
   notes:
Opretor precidence: the opretors are applied and evaluate based on precience .
   for example:
   +,- --> has les precidence;
   *,/ --> has highest precidence;
   hence * and / evaluate first


Associativity:tells the direction of excution of opretor , it can either be left to right or
right to left
  *,/ --> left to right
  +,- --> left to right
  ++,= --> right to left

    */


/*
Quick quiz:
how will you write the following expression in java ;
1)x-y/2;
2)b*b-(4*a*c)/(2*a);
3)v*v-u*u;
4)a*b-d;
 */