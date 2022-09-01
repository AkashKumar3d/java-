/*
create a class sphere and use getter and setter to set its radius
and height
 */
class sphere{
    private float r;
// setter for radius
    public void setR(float r) {
        this.r = r;
    }

// getter for radius
    public float getR() {
        return r;
    }


}
public class ch9_practice_que5 {
    public static void main(String[] args) {
        sphere  c=new sphere();

        c.setR(4.5f);
        System.out.println("the radius of  sphere is : "+c.getR()+" mtr");

    }
}
