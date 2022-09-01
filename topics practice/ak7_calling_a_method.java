/*
----------->calling a method<--------
there two type of call the method:
1)bina object banaye method ko call kar sakate hai aur ye
har obj ke liye call hoga ye ham (introduction of method mai dekha hai);
------------syntax:---------------
static datatype name(){
   //method body code
   }

2)second:- ye method tabhi call hoga jab har obj ke liye new object banega;
like this:-(syntax: for creating the new object)
------------syntax:---------------
 datatype name(){
   //method body code
   }
     ak7_calling_a_method obj=new ak7_calling_a_method();
        z=obj.num(x,y);
 */
public class ak7_calling_a_method {
/* ----------->second calling method<---------
creating the obj for using(1 method);
 */
    int num(int a, int b){
        int c;
        if (a <b ) {
            c=a+b;
        }else {
               c=(a+b)*4;
        }
        return c;
    };
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int z;
        // note: jitani baar ham method ko use karange utani baar hame new object banana padega;

        ak7_calling_a_method obj=new ak7_calling_a_method();//for  use method first time create new object
        z=obj.num(x,y);
        System.out.println(z);


/*
second time use  method :- dubara mathod ko use karane ke liye
hame dubara object banana padega;
like this:- ak7_calling_a_method obj1=new ak7_calling_a_method();
 */
        int m=6;
        int n=5;
        int o;
        ak7_calling_a_method obj1=new ak7_calling_a_method();//for  use method second time create new object
        o=obj.num(m,n);
        System.out.println(o);
    }
}
