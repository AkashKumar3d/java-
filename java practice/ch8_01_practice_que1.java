/*
create a class employee to method with following property and method ;
sallary (property) int
getsallary (method returning int)
name (property) string
getname (method returning string)
setname method changing name
 */
class employee{
    String name;
    int sallary;
    public int getSallary(){
        return sallary;
    }
    public String setName(String n){
        name=n;
        return name;
    }
    public String getName(){
        return name;
    }

}
public class ch8_01_practice_que1 {
    public static void main(String[] args) {
   employee emp1=new employee();

        emp1.setName("abhay");
        System.out.println(emp1.getName());
        emp1.sallary=254;
        System.out.println(emp1.getSallary());

    }
}
