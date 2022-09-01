/*
create a array of five float and calculate their sum;
 */

public class ch6_01_practice_que1 {
    public static void main(String[] args) {
        float []arr={12.0f,14.0f,15.3f,15.6f,18.9f};
         float sum=0;
         for(float element:arr){
         sum=sum+element;
         }
        System.out.println(sum);
    }
}
