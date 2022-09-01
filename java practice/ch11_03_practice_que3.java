/*
create a class monkey with jump() and bite() method. create a class
human which inherit this monkey class and implements basic animal
interference with eat() and sleep() method ;
 */
// create animal interfaces
interface animal1{
    void eat();
    void sleep();
}
// create class monkey
class monkey{
    void jump(){
        System.out.println("monkey jump very long distance! ");
    }
    void bites(){
        System.out.println("monkey bites of humans! ");
    }
}
// create class humans
class human extends monkey implements animal1{
    public  void eat(){
        System.out.println("monkey eats like a human! ");
    }
    public void sleep(){
        System.out.println("monkey sleep like a human in night! ");
    }
}
public class ch11_03_practice_que3 {
    public static void main(String[] args) {
    human h=new human();
    h.jump();
    h.bites();
    h.eat();
    h.sleep();
    }
}
