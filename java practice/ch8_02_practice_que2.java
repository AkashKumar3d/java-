/*
create a class for cellphone for vibrating and ringing method ;

 */
// create the custom class
class cellphone{
    String name;
    int model;
    public void getDetails(){
        System.out.println("cellphone name is: "+name);
        System.out.println("cellphone model is: "+model);
    }
    public void ringing(){
        System.out.println(name+" cellphone ringing volue is show nice!");
    }
    public void vibrating(){
        System.out.println(name+" in vibrating system is Inbuild!");
    }
}
public class ch8_02_practice_que2 {
    public static void main(String[] args) {
        cellphone phone=new cellphone();// initializing the object 1
        cellphone phone1=new cellphone();// initializing the object 1

// setting the attribute for object 1
        phone.name="lava";
        phone.model=2020;
// method call for object 1
phone.getDetails();
phone.ringing();
phone.vibrating();

// setting attribute for object 2
        phone1.name="MI";
        phone1.model=2021;
// method call for object 2
phone1.getDetails();
phone1.ringing();
phone1.vibrating();


    }
}
