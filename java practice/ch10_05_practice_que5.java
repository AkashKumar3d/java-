/*
what is the order of constructor execution for the following inheritance hierarchy;
base-->derived1-->derived2
derived2 obj= new derived2();
 */
// base class
class base2{
    int a=5;
    // base class constructor
    base2(int a){
        this.a=a;
        System.out.println("the value of a is : "+a);
    }
}
//derived first class
class derived3 extends base2{
    int b=7;
    derived3(int a,int b){
        super(a);
        this.b=b;
        System.out.println("the value of b is : "+b);
    }
}
//derived third class
class derived4 extends derived3{
    int c;
     derived4(int a,int b){
        super(a,b);
        c=a+b;
         System.out.println("the sum of two number is : "+c);
    }
}
public class ch10_05_practice_que5 {
    public static void main(String[] args) {
    derived4 D=new derived4(4,6);

    }
}
