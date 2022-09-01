/*
create an abstract class pen with method write() and refil() as abstract
method ;
 */
// abstract class
abstract class pen{
   abstract void write();
   abstract void refil();
}
// derived from abstract class
class foundation extends pen{
  public  void write(){
      System.out.println(" I am write from foundation pen! ");
    }
    public void refil(){
        System.out.println("gel type refil in foundation pen! ");
    }
}
public class ch11_01_practice_que1 {
    public static void main(String[] args) {
       foundation f=new foundation();
       f.write();
       f.write();
    }
}
