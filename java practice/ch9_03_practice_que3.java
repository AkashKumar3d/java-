/*
create a class cylinder and use getter and setter to set its radius and hight
use to constructor and repeat que 1;
 */
class cylinder_using_constructor{
    private float r,h;
    // setter for radius
    public void setR(float r) {
        this.r = r;
    }

    // getter for radius
    public float getR() {
        return r;
    }

    // setter for height
     public void seth(float h) {
        this.h = h;
    }

    // getter for height
    public float geth() {
        return h;
    }

    // default constructor
    public cylinder_using_constructor() {
        r=4.0f;
        h=5.2f;
    }

}
public class ch9_03_practice_que3 {
    public static void main(String[] args) {

        cylinder_using_constructor c=new cylinder_using_constructor() ;
//       c.setR(4.5f);
//       c.seth(15.2f);
        System.out.println("the radius of the cylinder is : "+c.getR()+" mtr");
        System.out.println("the height of the cylinder is: "+c.geth()+" mtr");
    }
}
