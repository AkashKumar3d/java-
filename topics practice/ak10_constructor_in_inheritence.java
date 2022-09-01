/*

important point:-
 1) base class ke default  constructor ko derived class ke constructor help se access kar skate hai;
 2) base class ke parameterised constructor ko access karna hai to hame derived class ke constructor ke andar
 super keyword ka use  karna padga

 */
// base class
class base1{
// default constructor
    base1(){
        System.out.println("I am a base class  default constructor! :");
    }
// parameterized constructor
    base1(int a){
        System.out.println("I am a parameterised constructor and value of a is : "+a);
    }
}

// derived class first
   class derived1 extends base1{
     // default constructor
    derived1(){
       // super(0);// super se base class ka parameterised constructor execute hoga
        System.out.println("I am a derived1 class default constructor! :");
    }

    //parameterized constructor
    derived1(int a ,int b){
        super(a);// derived1 class mai super keyword se base class ka parameterised constructor pahale execute karega;
        System.out.println("I am a derived1 class parameterised constructor and value of b is: "+b);
    }
}

// derived class second
   class derived2 extends derived1{
    // default constructor
    derived2(){
       // super(0,3);// super se derived1 class and base class  ka parameterised constructor execute hoga
        System.out.println("I am a default derived2 class  constructor: ");
    }

    // parameterised constructor
    derived2(int a,int b ,int c){
      super (a,b);// derived2 class mai super keyword se derived one class and base class ka parameterised constructor pahale execute karega;
        System.out.println("I am parameterised derived2 class constructor and the value of c is : "+c);
    }
}
public class ak10_constructor_in_inheritence {
    public static void main(String[] args) {
          // create base one class object
        base1 b=new base1();//only  base class default constructor execute
       // base1 b=new base1(4);// only base class parameterised constructor execute


           //create derived one class object
//         derived1 d=new derived1();// only execute default constructor base1  and  derived1 class without super keyword
//        derived1 d=new derived1(4,8);// only execute parameterised constructor base1 and derived1 class

          // create derived2 class object
//          derived2 d=new derived2();// only execute default constructor base1  and  derived1 class without super keyword without super keyword
//        derived2 d=new derived2(4,8,12);// only execute parameterised constructor of derived2 class and derived one class and base class;


    }
}
