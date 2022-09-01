class calculate{
 private   float a,r;
  private  float pie=3.14f;
  // setter
    public float calc(float f){
      this.r=f;
        return r;
    }
  // getter
    public void get_item(){
        System.out.println("the area of circle is "+pie*r*r);
    }
}

public class quick_quiz_getter_setter {
    public static void main(String[] args) {
        calculate c=new calculate();
        c.calc(5);
        c.get_item();
    }
}
