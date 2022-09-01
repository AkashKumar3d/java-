import java.util.Scanner;

/*
create a class circle and calculate the area of the circle and perimeter
 */
// create a custom class
class circle{
    float r,p;
     float pie=3.14f;
     public void  setDetails(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the radius of the circle: ");
         r=sc.nextFloat();
     }
     public float area(){
         float a=pie*r*r;
         return a;
     }
     public float perimeter(){
         p=2*pie*r*r;
         return p;
     }
}
public class ch8_05_practice_que5 {
    public static void main(String[] args) {
        circle c1=new circle();// intialising the object
        c1.setDetails();
        System.out.println("the area of the circle is: "+c1.area());
        System.out.println("the area of the perimeter is: "+c1.perimeter());
    }
}
