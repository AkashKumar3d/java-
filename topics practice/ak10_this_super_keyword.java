
class number{
    int a;

// getter
    public int getA(int a) {
        return a;
    }
// constructor
   number(int a){
     this.a=a;
       System.out.println("i am a base class constructor "+a);
    }
}
class number1 extends number{
    int b;
    number1(int a,int b){
        super(a);
        System.out.println("i am a derived class constructor and value of a and b is  "+a+" and "+b);
    }
}
public class ak10_this_super_keyword {
    public static void main(String[] args) {
        number1 num=new number1(2,4);

    }
}
