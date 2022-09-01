/*
create a class telephone with ring() ,lift()  and
disconnect() methods as abstract methods.create another
class smart telephone and demonstrate polymorphism;
 */
 abstract class telephone{
     abstract void ring();
     abstract void lift();
     abstract  void disconnect();
}
class smart_telephone extends telephone{
    public void ring(){
        System.out.println("your phone is ring! ");
    }
    public void lift(){
        System.out.println("please lift my phone this is my important call! ");

    }
    public   void disconnect(){
        System.out.println("please disconnect the call! ");
    }
    void music(){
        System.out.println("please play the  song!  ");
    }
    void  camera(){
        System.out.println("click the pic camera is on! ");
    }
}
public class ch11_04_practice_que4 {
    public static void main(String[] args) {
    telephone t=new smart_telephone();//dynamic dispatch method
    t.ring();
    t.lift();
    t.disconnect();
    //t.music();// throw error becouse it is not a part of abstract class
    }
}
