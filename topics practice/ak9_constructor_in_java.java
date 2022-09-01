class student1{
    private String name;
    private int roll;

//default  constructor
    public student1(){
        name="mahesh";
        roll=404;
    }
// parameterised constructor
   public student1(String n, int r){
        name=n;
        roll=r;
   }

// setter
//   public void set_name(String n){
//        name=n;
//   }


   // setter
//    public void set_roll(int r){
//        roll=r;
//    }

// getter
    public String get_name(){
        return name;
    }
// getter
   public int get_roll(){
return roll;
   }

}
public class ak9_constructor_in_java {
    public static void main(String[] args) {
    student1 s1=new student1();// value set for default constructor;
    //student1 s1=new student1("amit",404);// value set for parameterised constructor;
//   s1.set_name("akash ");
//   s1.set_roll(404);
        System.out.println(s1.get_name());

        System.out.println(s1.get_roll());

    }
}
