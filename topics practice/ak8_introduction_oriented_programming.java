// create the custom class
class student{
    String name;
    int age;
// create the method
    public void getDetails(){
        System.out.println("Student name is: "+name);
        System.out.println("student age is: "+age);
    }
}
public class ak8_introduction_oriented_programming {
    public static void main(String[] args) {
   student st1=new student();// initializing the new employee object
   student st2=new student();// initializing the new employee object

    // setting the attribute of  first object
        st1.name="akash kumar singh";
        st1.age=20;
        st1.getDetails();

   // setting the attribute of second object
        st2.name="ROHAN";
        st2.age=25;
        st2.getDetails();

    }
}
