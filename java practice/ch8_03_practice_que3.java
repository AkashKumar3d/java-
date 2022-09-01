/*
create a class method with a method to initialize its side calculating area and parameter
 */
import java.util.Scanner;
class square{
    float a;
    float parameter;
    public  float calc_area(){
        float area=(a*a);
        return area;
    }
    public float calc_parameter(){
        float perimeter=4*a;
        return perimeter;
    }
    public void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of square: ");
        a= sc.nextFloat();
    }

}
public class ch8_03_practice_que3 {
    public static void main(String[] args) {
   square s=new square();
        s.setDetails();
        System.out.println("the area of square is " +s.calc_area()+ " m/sqr");
        System.out.println("the perimeter of square is"+s.calc_parameter()+" units");
    }
}
