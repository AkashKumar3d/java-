/*
remember can not implement another interface ,only class can do that;
 */
// first interface
interface first{
    String name="Akash kumar";
    int age=20;
    void name();
    void age();
}
// second interfaces inherit first  inherit
interface second extends first{
    String address="Deoria up";
    String branch="information tecnology";
    void Address();
    void Branch();
}
// create class
class details implements first,second{
    public    void name(){
        System.out.println("my name is:  "+name);
    }
    public  void age(){
        System.out.println("my age is: "+age+" years old");
    }
    public  void Address(){
        System.out.println("my address is: "+address);
    }
    public  void Branch(){
        System.out.println("my branch is: "+branch);
    }
}
public class ak11_inheritance_in_interfaces {
    public static void main(String[] args) {
     details d=new details();
     d.name();
     d.age();
     d.Address();
     d.Branch();
    }
}
