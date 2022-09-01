
/*
use to calculate surface area and volume of the cylinder
surface area=(2*pie*r*h)+(2*pie*r*r);
volume of the cylinder=pie*r*r*h;
 */
class cal_cylinder{
  float r,h;
  float pie=3.14f;
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

//method for  (surface area of the cylinder);
   public float surface_area(){
        return (2*pie*r*h)+(2*pie*r*r);
   }

//method for  (surface area of the cylinder);
    public float volume(){
        return pie*r*r*h;
    }
}
public class ch9_02_practice_que2 {
    public static void main(String[] args) {
   cal_cylinder c1=new cal_cylinder();

   c1.setR(4.0f);
   c1.seth(12.0f);
   System.out.println("the radius of the cylinder is: "+c1.getR());
   System.out.println("the height  of the cylinder is: "+c1.geth());
   System.out.println("the surface area of the cylinder is "+c1.surface_area());
   System.out.println("the volume of the cylinder is "+c1.volume());
    }
}
