/*
--------------------->Methods<----------------------
methods:
sometimes our programs grow method in size and we want to
separate the logic of a main method of the other method;

note:
method function ki tarah hi hota hai difference bas etana hota
hai method ko ham kewal class ke andar hi likh skate hai;aur
class ko main object ke andar bhi likh skate hai;aur jarurat
padane par main object ke  liye method ko baar excute kar sakate
hai;


type of calling the method;

1)bina object banaye method ko call kar sakate hai aur ye
har obj ke liye call hoga;
------------syntax:---------------
static datatype name(){
   //method body code
   }

2)second method tabhi call hoga jab har obj ke liye new object banega;
like this:-(syntax: for creating the new object)

     ak7_calling_a_method obj=new ak7_calling_a_method();
        z=obj.num(x,y);


 */

public class ak7_introduction_of_method {
//------------>methods in java<----------------
// create the method using the (1 method)
    static int num(int x,int y){
        int z;
        if (x<y) {
            z=x+y;
        }else {
            z=(x+y)*5;
        }
        return z;
    };
    public static void main(String[] args) {
// using method first time;
        int a=2;
        int b=5;
        int c;
        c=num(a,b);
        System.out.println(c);

// using method second time;
    int a1=5;
    int b1=2;
    int c1=num(a1,b1);
        System.out.println(c1);
    }
}
