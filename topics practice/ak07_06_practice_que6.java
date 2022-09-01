/*
write a function to find avreage of a given set of numbers passed as argument .
 */
public class ak07_06_practice_que6 {
    static  float total(float [] marks ){
       float sum=0;
        for (int i = 0; i < marks.length ; i++) {
             sum +=marks[i];
        }
        float avrage =sum/ marks.length;
        return avrage;
    }
    public static void main(String[] args) {
        float [] marks={36.0f,35.0f,45.0f,65.0f};
        System.out.println((total(marks)));

    }
}
