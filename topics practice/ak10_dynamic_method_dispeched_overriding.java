/*
---------------------------> dynamic method dispatched <------------------------
dynamic method dispatched :-
base class se reference leke jab derived class ka new object banate hai. tab kewal
base class ke overriding  method chod ke and derived class ka overriding method leke
method execute hote hai ;
1)base class:-
only execute the without overriding method;
2)derived class:-
only execute the overriding method;
 */

// base class
class phone{
    public void call(){
        System.out.println("phone is ringing: ");
    }
    public void greet(){// execute nhi hoga dispatched wale mai
        System.out.println("hello sir  good morning.... ");
    }
}

// derived class
class  smartphone extends phone{
    @Override
    public void greet(){// es method ko override kiya hai
        System.out.println("good night.... ");
    }
    public void camera(){// execute nhi hoga dispatched wale mai
        System.out.println("please on the camera... ");
    }
}
public class ak10_dynamic_method_dispeched_overriding {
    public static void main(String[] args) {
      /*
        phone obj=new phone();
        obj.call();
        obj.greet();
        smartphone obj1=new smartphone();
        obj1.greet();
        obj1.camera();
        */

// dynamic method dispatched
      phone obj3=new smartphone();// dynamic method dispached
        obj3.call();
        obj3.greet();
        //obj3.camera();//not allowed
    }
}
