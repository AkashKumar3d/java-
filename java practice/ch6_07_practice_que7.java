/*
write a program to find the minimum element in the array;
 */
public class ch6_07_practice_que7 {
    public static void main(String[] args) {
        int [] num={25,45,15,12,21};
        int min=Integer.MAX_VALUE;
        for ( int element:num) {
            if (element<min){
                min=element;
            }
        }
        System.out.println("the minmum element in this array is: "+min);
    }
}
