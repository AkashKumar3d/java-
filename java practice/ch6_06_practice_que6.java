/*
write a program to find the maximum element in the array;
 */

public class ch6_06_practice_que6 {
    public static void main(String[] args) {
        int []num={10,25,36,100,50};
        int max=Integer.MIN_VALUE;
        for (int element:num) {
              if (element>max){
              max=element;
              }
        }
        System.out.println("the maximum value of an array :"+max);
    }
}
