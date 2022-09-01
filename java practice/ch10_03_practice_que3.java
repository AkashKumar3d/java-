/*
create method for area and volume in que one ;

 */
class circle2{
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
    public float area() {
        return pie*r*r;
    }
}
// derived class
class cylinder4 extends circle2{
    float h;
// getter
    public float getH() {
        return h;
    }
//  setter
    public void setH(float h) {
        this.h = h;
    }
    // method
    public float calculate(){
        return (pie*r*r*h);
    }
}
public class ch10_03_practice_que3 {
    public static void main(String[] args) {
        cylinder4 c=new cylinder4();
        c.setH(5);
        c.setR(4);

        System.out.println("height "+c.getH());
        System.out.println("radius "+c.getR());
        System.out.println("the area of circle is "+c.calculate());
        System.out.println("the area of circle is "+c.area());
    }
}