/*
create a class circle use  to inheritance to create another class cylinder another from it ;

 */
// base class
class circle1{
     float r;
     float pie=3.14f;
// getter for circle  radius
    public float getR() {
        return r;
    }
// setter for circle radius
    public void setR(float r) {
        this.r = r;
    }

// getter  for  pie
    public float getPie() {
        return pie;
    }
}
// derived class
class cylinder1 extends circle1{
    float h;

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
public class ch10_01_practice_que1 {
    public static void main(String[] args) {
  cylinder1 c=new cylinder1();
    c.setH(5);
    c.setR(4);

     System.out.println("height "+c.getH());
        System.out.println("radius "+c.getR());

    }
}
