import java.util.Scanner;
/*
quick.quiz:-Create a class animal and derived dog from it;
 */

// base  class
class animal{
 public  String name;
 Scanner sc=new Scanner(System.in);
 public  void set_Name(){
     System.out.println("Enter the animal name! ");
     name= sc.nextLine();
 }
 public void display(){
     System.out.println("animal name is : "+name);
 }
}

// derived class
class dog extends animal{
public String bark,colour,run ;

    public String getRun() {
        System.out.println(name+" run! ");
        return run;
    }

    public String getBark() {
        System.out.println(name+" voice!");
        return bark;
    }

    public String getColour() {
        System.out.println(name+" colour");
        return colour;
    }


 //default  constructor
    dog(){
     bark="bho bho....";
     colour="black";
     run="very fast";
    }


}
public class quick_quize_in_inheritance {
    public static void main(String[] args) {
        dog D=new dog();
        D.set_Name();
        D.display();
        System.out.println(D.getBark());
        System.out.println(D.getColour());
        System.out.println(D.getRun());
    }
}
