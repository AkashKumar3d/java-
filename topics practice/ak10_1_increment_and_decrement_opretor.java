/*

increment and decrement opretor;

increment opretor:
a++= pahale value print hogi phir increment hoga;
++a= pahale value increment hoga phir print hoga;

decrement opretor:
a--=pahale value print hoga phir decrement hoga;
--a= pahle value decrement hoga tab print hoga;

 */

public class ak10_1_increment_and_decrement_opretor {
    public static void main(String[] args) {
// increment opretor;
        int i=10;
// first assign and then increment;
        System.out.println(i++);
        System.out.println(i);
// first increment and then assign;
        System.out.println(++i);
        System.out.println(i);

// decrement opretor;
 int j=12;

// first assign and then decrement;
        System.out.println(j++);
        System.out.println(j);
// first decrement and then assign;
        System.out.println(--j);
        System.out.println(j);
// ---------------------------------------------------------------------

/*
Quick quize: what will be the value of following expression;
int y=7;
int x= ++y*8;
value of x?

b) char a='b';
a++;

 */
// solution:
int y=7;
int x=++y*8;
        System.out.println(x);

//b)
        char a='B';
        System.out.println(a++);
        System.out.println(a);

    }
}
