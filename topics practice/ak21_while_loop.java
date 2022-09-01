/*
   ------------------->while loop<---------------------
1)ek hi function ko baar execute karane loop ka use karate hai
2)pahale condition ko check karega phir agar condition true hua
to loop le andar ke code ko execute karega;

 */
import  java.util.Scanner;
public class ak21_while_loop {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int k= sc.nextInt();
        while (k<=1000){
            System.out.println(k);
            k++;
        }
    }
}
