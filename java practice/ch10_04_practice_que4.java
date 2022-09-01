/*
create method for area and volume in 2 also create getter and setters
 */
class rect1 {
    float length, breath;

    // parameterized constructor
    rect1(float l, float b) {
        length = l;
        breath = b;
        System.out.println("the length of rectangle :" + length);
        System.out.println("the breath of rectangle :" + breath);
    }

    // method
    public float clc_area() {
        return length * breath;
    }
}

class cuboid1 extends rect1{
    float height;
    //parameterized constructor
    cuboid1(float l,float b,float h){
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
public class ch10_04_practice_que4 {
    public static void main(String[] args) {
        cuboid1 c=new cuboid1(5.0f,8.6f,8.5f);
        System.out.println("the area of rectangle "+c.clc_area());
        System.out.println( "the volume of cuboid "+c.clc_volume());
    }
}
