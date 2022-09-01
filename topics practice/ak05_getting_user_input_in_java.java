
import java.util.Scanner;// jab hame user se  number ko input lena hoga to import java.util.scanner
// ka use karana padega

public class ak05_getting_user_input_in_java {
    public static void main(String[] args) {
        System.out.println("getting users input in java programm");
        Scanner sc = new Scanner(System.in);// user se input lene ke liye ek object banana padega jisame
        // user ka data store hoga;

        // System.out.println("enter the first number");
        // int a=sc.nextInt();

        // float a= sc.nextFloat();

        // System.out.println("enter the second number");
        // int b= sc.nextInt();
        // int c=a+b;

        // float b= sc.nextFloat();
        // float c=a+b;
        // System.out.println(c);

        String str = sc.next();// sc.next() kewal ek word ko print karta hai string
        // ke wo whitespace ke baad wale string ko nahi print karta
        System.out.println(str);

        // String str1=sc.nextLine();// sc.nextline() wo saare word ko print karta hai
        // jo user ne input kiya hai
        // System.out.println(str1);
    }
}
