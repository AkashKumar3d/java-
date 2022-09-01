class  a{
    int n;
    public int num(int m){
        return m;
    }
 public void method(){
        System.out.println("this is the base class method a: ");
    }
}
class b extends a{
    int k;
    @Override
   public void method(){
        System.out.println("this is the derived class  method b: ");
    }
}
public class ak10_method_overriding {
    public static void main(String[] args) {

        a m=new a();
        m.method();

        b n=new b();
        n.method();

    }
}
