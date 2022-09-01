/*
calculate the average marks of an array containing marks of
all student is physics using for each loops
 */
public class ch6_03_practice_que3 {
    public static void main(String[] args) {
        float []marks={36.0f,25.6f,90.6f,95.6f};
        float sum=0;

        for (float element:marks) {
            sum=sum+element;
        }
        float avg=sum/ marks.length;
        System.out.println("the average of physics marks is "+avg);
    }
}
