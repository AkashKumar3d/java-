/*
write a program to find out whether a given integer is
present in an array or not;
 */

public class ch6_02_practice_que2 {
    public static void main(String[] args) {
        int []num={10,12,25,26,36};
        int a=10;
        boolean present=false;
        for (int element:num) {
            if (a==element){
                break;
            }
        }
        if (present == true) {
            System.out.println("integer is present in array");
        }else{
            System.out.println("integer is not present in array");
        }

    }
}
