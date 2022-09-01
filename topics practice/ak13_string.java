/*
string:
1) A string is a sequence of characters ;
2) String is a class but can be use like a data type;
3) string are imputable and can not be change ;

// define the string ;
  String name =new string("akash");
          or
  String name = "akash";


// Different way to print in java;
there are four types to print java;
1) System.out.println();
2)System.out.print();
3)System.out.printf();
4)System.out.format();


// format specifiers;
%d=use for integer;
%f=use for float;
%s=use for string;
%c=use for character;
 */

import  java.util.Scanner;
public class ak13_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //String name= new String("akash");// optional
        // or
         String name="akash";
        System.out.print("my name is : ");
        System.out.println(name);

        int a=10;
        float b=12.0f;
        System.out.printf("the value of a is: %d and value of %10.2f\n",a,b);
       System.out.format(name);
    }
}
