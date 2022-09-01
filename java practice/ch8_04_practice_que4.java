import java.util.Scanner;

/*
create a class perimeter of rectangle and area ;
 */
class rectangle{
    int l,b,p,a;
    public void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        l= sc.nextInt();
        System.out.println("Enter the breath of the rectangle:  ");
        b= sc.nextInt();
    }
    public int clc_area_of_rectangle(){
        a=l*b;
        return a;
    }
    public int clc_perimeter_of_rectangle(){
        p=2*(l+b);
        return p;
    }
    public void display(){

        System.out.println("area of the rectangle is: "+clc_area_of_rectangle());
        System.out.println("perimeter of the rectangle is: "+clc_perimeter_of_rectangle()+" units");
    }
}
public class ch8_04_practice_que4 {
    public static void main(String[] args) {
      rectangle r=new rectangle();// intialiing the object
      rectangle r1=new rectangle();// intialiing the object
        r.setDetails();
        r.display();

        r1.setDetails();
        r1.display();
    }
}
