/*
use the pen class from que1 to create a concrete class fountain
with additional method change_nib();
 */
// abstract class
abstract class pen1{
    abstract void write();
    abstract void refil();
}
// derived from abstract class
class foundation1 extends pen1{
    public  void write(){
        System.out.println(" I am write from foundation pen! ");
    }
    public void refil(){
        System.out.println("gel type refil in foundation pen! ");
    }
    void change_nib(){
        System.out.println("changing the nib!");
    }
}
public class ch11_02_practice_que2 {
    public static void main(String[] args) {
        foundation1 f=new foundation1();
        f.write();
        f.write();
        f.change_nib();
    }
}
