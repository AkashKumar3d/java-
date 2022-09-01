/*
abstract method :-
abstract method that used to derived without any implementation;

abstract class :-
abstract class include the abstract method , then the class itself must be declared abstract
as in
syntax:-
public abstract class phone_model{
     abstract void switch_of(){
         // more code
}
 */

// abstract class
abstract  class number2{
    int a,b;
    // abstract method
    abstract int sum();
    abstract void getnum(int a,int b);
}

// concrete derived class
class sum extends number2{

    int a,b;
     void getnum(int a,int b){
        this.a=a;
        this.b=b;
         System.out.println("the value of a is: "+a);
         System.out.println("the value of b is : "+b);

    }
    @Override
  int sum( ) {
        System.out.printf("the sum of a  and b is :",a,b);
       return a+b;
    }
}
public class ak11_abstract_class_and_abstract_method {
    public static void main(String[] args) {
    sum add=new sum();
     sum s= new sum();
     s.getnum(5,6);
        System.out.println(s.sum());
    }
}
