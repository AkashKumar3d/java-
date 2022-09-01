/*
Interface in java:-
in java interface is a group of related method with
empty body;
syntax:-
interface bicycle{
void  apply_break(int decrement);
void speedup(int increment);
}

class avoncycle implement bicycle{
int speed=7;
public void applybrake (int decrement ){
speed=speed-decrement;
}
public speedup(int increment){
speed=speed+increment;
}

difference between abstract class and interface:-
1)ham multiple abstract class nahi bana sakte hai ;
2) ham abstract class mai method ko define kar sakte hai;
3) ham interface ke andar method ko define nahi kar sakte
hai;
4) lekin ham interface ke ander multiple interface
bana sakte hai;
5) interface ke ander ke method ko jab bhi ham define
karenge derived class mai tab use hame public banana  padega ;
6) jab ham abstract ke andar property ek bar set  kar
dete hai tab use ham change nahi kar sakate hai;
7) jab bhi hame interface ka derived class banana hoga
tab ham use implement keyword ka use karenge ;
 */
// first interface
interface bicycle{
    int a=12;
    void apply_break(int decrement);
    void speed_up(int increment);
}
// second interfaces
interface below_horn{
   void horn();
}

class avon_cycle implements bicycle,below_horn{
    // at time define the method of interface to use public access modifies
  public   void apply_break(int decrement){
      System.out.println("you are applying break");
  }
  public  void speed_up(int increment){
      System.out.println("you are increase the speed");
  }
  public void horn(){
      System.out.println("horn voice is pee pee peep......");

  }
}
public class ak11_interfaces {
    public static void main(String[] args) {
        avon_cycle c=new avon_cycle();
        c.apply_break(0);
        c.speed_up(1);
        c.horn();

        // ham interface ke variable  ki value main object ka ander assign
//        nahi kar sakte
//        c.a=25;
        System.out.println(c.a);
    }
}
