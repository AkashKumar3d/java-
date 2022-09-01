/*
create a class rectangle and use to inheritance to create another class
cuboid . try to keep it as close to real world sceinario as possible
 */
class rectangle1{
    float length,breath;
    // parameterized constructor
    rectangle1(float l, float b){
        length=l;
        breath=b;
        System.out.println("the length of rectangle :"+length);
        System.out.println("the breath of rectangle :"+breath);
    }
    // method
    public float clc_area(){
         return length*breath;
    }
}
class cuboid extends rectangle1{
    float height;
    //parameterized constructor
    cuboid(float l,float b,float h){
        super(l,b);
        height=h;
        System.out.println("the length of cuboid :"+length);
        System.out.println("the breath of cuboid :"+breath);
        System.out.println("the height of cuboid :"+height);
    }
    // method
    public float clc_volume(){
        return length*breath*height;
    }
}
public class ch10_02_practice_que2 {
    public static void main(String[] args) {
   cuboid c=new cuboid(2.0f,2.6f,8.5f);
   System.out.println("the area of rectangle "+c.clc_area());
   System.out.println( "the volume of cuboid "+c.clc_volume());

    }
}
