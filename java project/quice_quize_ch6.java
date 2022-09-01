/*
quice-quize:
write a java program to print the elements of this array in reverse
order;
 */

public class quice_quize_ch6 {
    public static void main(String[] args) {
        float [] num={10.1f,11.1f,12.2f};
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }
    }
}
