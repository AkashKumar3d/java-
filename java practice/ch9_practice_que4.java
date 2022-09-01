/*
overload a constructor used to initialize a rectangle of length
4 and breath 5 for using custom parameter ;
 */
class rect {
    private float length,breath ;

    // getter for length
    public float get_length() {
        return length;
    }

    // getter for breath
    public float get_breath() {
        return breath;
    }
// ---------->overloaded constructor
    // default constructor
    public rect() {
        length=4.0f;
        breath=5.2f;
    }
// parameterised costructor
   public rect(float l,float b){
        length=l;
        breath=b;
   }
}
public class ch9_practice_que4 {
    public static void main(String[] args) {
        float l,b;
// constructor overloading
      rect r=new rect();// object for fist constructor
      rect r1=new rect(4.2f,10.0f);// object for default constructor

// first default constructor constructor;
        System.out.println("length of the rect: "+r.get_length());
        System.out.println("breath of the rect: "+r.get_breath());

// second parameterised constructor
        System.out.println("length of the rect: "+r1.get_length());
        System.out.println("breath of the rect: "+r1.get_breath());
    }
}
