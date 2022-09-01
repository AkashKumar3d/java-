/*
------------------>Inheritance<----------------
 1) base class ko ham easily derived class ki help se inherit kar skate hai;
 2) base class ke kuch hi variable ko access kar skate hai derived class ke through;
 3)base class ki help se kabhi bhi ham derived class ke member function ko
  access nahi kar skate hai;
 */

// Base class (parent class) in case of inheritance
class base{
    public int a;

//getter
    public int getA() {
        return a;
    }

// setter
    public void setA(int a) {
        this.a = a;
    }
}

// derived class (child class )
class derived extends base{
    int b;
    // getter
    public int getB() {
        return b;
    }
    // setter
    public void setB(int b) {
        this.b = b;
    }
}
public class ak10_Inheritance_in_java {
    public static void main(String[] args) {

// inherit through the base class
        base b=new base();
        b.setA(4);
        System.out.println("the value of base class "+b.getA());
/* show error becouse we can not access the member fuction
with the help of base class
 */
     /*   b.setB(4);
        System.out.println("the value of base class "+b.getB());
      */

// inherit through the derived class
        derived d=new derived();
        // member function of base class inherit to the member function of derived class
        d.setA(5);
        System.out.println("using the derived class for inherite the base class: "+d.getA());

        // member function of derived class
        d.setB(25);
        System.out.println("member function of derived class : "+d.getB());

    }
}
