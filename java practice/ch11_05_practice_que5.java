/*
demonstrate polymorphism using class from que3;

create a class monkey with jump() and bite() method. create a class
human which inherit this monkey class and implements basic animal
interference with eat() and sleep() method ;
 */

// create animal interfaces
interface animal2{
    void eat();
    void sleep();
}
// create class monkey
class monkey1{
    void jump(){
        System.out.println("monkey jump very long distance! ");
    }
    void bites(){
        System.out.println("monkey bites of humans! ");
    }
}
// create class humans
class human1 extends monkey1 implements animal2{
    public  void eat(){
        System.out.println("monkey eats like a human! ");
    }
    public void sleep(){
        System.out.println("monkey sleep like a human in night! ");
    }
}
public class ch11_05_practice_que5 {
    public static void main(String[] args) {
    monkey1 m=new human1();// dynamically dispatched
    m.jump();
    m.bites();
//    m.eat();// throw error not a  part of monkey class method
    }
}
