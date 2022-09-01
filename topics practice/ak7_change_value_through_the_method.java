public class ak7_change_value_through_the_method {
    static void num(int a){
       a=25;
    };
    static void num1(int [] arr){
      arr[0]=13;
    };

    public static void main(String[] args) {
//es case mai value  ki copy jayegi esliye value change nahi hogi;
        int x=15;
       num(x);
        System.out.println("the value after the chang: "+x);

// array ke case mai variable ka reference jayega esliye value esilye
//        change ho jayegi;
        int [] sub={2,3,4,5,6};
        num1(sub);
        System.out.println("the array value after change is: "+sub[0]);

    }
}
