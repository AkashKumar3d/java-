// resulting datatype after arithamatic opretion;

/*
Notes:
Resultng datatype: following table summarise the resulting datatype
after after arithametic operation on them;
 */
public class ak10_resulting_datatype_after_arithmatic_opretion {
    public static void main(String[] args) {
//1) R=byte+short;
// byte and short ko add karane pe integer value  hi milega ;
     byte a=2;
     short b=2;
     int r=a+b;
        System.out.println(r);

//2) R=short+int;
// short+int datatype  ko add karane pe result  int datatype hi milega;
    short c=100;
    int   d=425;
    int e=c+d;
        System.out.println(e);

//3) R=long+float;
//long and float datatype value ko add karane pe result float hi milega;
  long l=123654;
  float f=2.5f;
  float res=l+f;
        System.out.println(res);

//4) R=int+float;
// int and float datatype value ko add karane pe resute float hi milega;
   int num1=5;
   float num2=5.5f;
   float res1=num1+num2;
        System.out.println(res1);

//5) char+int;
// char and int datatype value  ko add karane pe result int hi milega;
   char ch='a';
   int  num4=5;
   int res3=ch+num4;
        System.out.println(res3);

//6) R=char+short;
//char and short datatype value ko add karane pe result int hi milega;
    char ch1='h';
   short sh=120;
   int res4=ch1+sh;
        System.out.println(res4);

//7) R=long+double;
// long and double datatype value  ko add karane par result  double hi milega;
   long lg=123654;
   double dbl=12365.23;
   double res5=lg+dbl;
        System.out.println(res5);

//8) r=float+double;
// float and double datatype value  ko add karane par result double hi milega;
   float flt=5.5f;
   double dbl1=1256369.256;
   double res6=flt+dbl1;
        System.out.println(res6);

    }
}
