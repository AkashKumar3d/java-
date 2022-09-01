
// --------------------------<getter and setter access modifiers<-----------
class my_employee{
    private String name;
    private int id;
// setter
   public void set_name(String n){
       name=n;
   }
// getter
    public String get_Name(){
        System.out.println("employee name is : "+name);
        return name;
    }
//setter
    public void set_Id(int i){
       id=i;

    }
//getter
    public  int get_Id(){
        System.out.println("employee id is: "+id);
        return id;
    }
}
public class ak9_access_modifiers_and_getter_and_setter {
    public static void main(String[] args) {
        my_employee e1=new my_employee();
        e1.set_name("akash");
        e1.get_Name();
        e1.set_Id(404);
       e1.get_Id();
    }
}


