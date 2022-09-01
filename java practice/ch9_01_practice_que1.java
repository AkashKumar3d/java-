/*
create a class cylinder and use getter and setter to set its radius and hight
 */
// custom class
class cylinder{
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


}
public class ch9_01_practice_que1 {
    public static void main(String[] args) {
    cylinder c=new cylinder();

    c.setR(4.5f);
    c.seth(15.2f);
        System.out.println("the radius of the cylinder is : "+c.getR()+" mtr");
        System.out.println("the height of the cylinder is: "+c.geth()+" mtr");
    }
}
