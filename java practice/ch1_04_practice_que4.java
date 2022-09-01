// write a java program to convert kilometers into meals ;

import java.util.Scanner;
public class ch1_04_practice_que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the Distance in kilometer: ");
        float km= sc.nextFloat();

        double miles=km*0.621371;
        System.out.println("converted distance value km to miles: ");
        System.out.print(miles);
        System.out.println(" meals");
    }
}
