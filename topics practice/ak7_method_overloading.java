/*
method overloading:-
two or more methods can same as a different parameters . such methods
are called method overloading;
 */

public class ak7_method_overloading {
    static int num(int x){
        return x;
    }
    static int num(int x, int y){
        return x+y;
    }
    static int num(int x, int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int  e=6;
        int c;
        c=num(a);
        System.out.println("the first method :"+c);

        int d=num(a,b);
        System.out.println("the second method :"+d);

        int m=num(a,b,e);
        System.out.println("the third method :"+m);

        /*
        note:
        method overloading cannot be perform by changing the return
        type of method;
         */
    }
}
