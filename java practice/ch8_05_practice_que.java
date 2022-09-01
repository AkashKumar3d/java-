/*
calculate the class for rockstar game capable of
hitting,running, firing;
 */
class tommy{
    public void hit(){
        System.out.println("hitting the enemy: ");
    }
    public void run(){
        System.out.println("running  from the enemy: ");
    }
    public void fir(){
        System.out.println("firing on the enemy: ");
    }

}
public class ch8_05_practice_que {
    public static void main(String[] args) {
  tommy t1=new tommy();
  t1.hit();
  t1.run();
  t1.fir();
    }
}
