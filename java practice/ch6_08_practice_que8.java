/*
write a java program to find whether an array
is sorted or not;
 */

public class ch6_08_practice_que8 {
    public static void main(String[] args) {
        int [] num={1,25,31,35,45,65};
        boolean sorted=true;

        for (int i = 0; i <num.length-1 ; i++) {
            if (num[i]>num[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("the array is shorted: ");
        }else{
            System.out.println("the array is not shorted: ");
        }
    }
}
