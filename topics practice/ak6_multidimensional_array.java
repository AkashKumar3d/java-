/*
-------------->multidimensional array<--------------

multidimensional array of array each element of a
m-d array itself marks in the previous example;
 */

public class ak6_multidimensional_array {
    public static void main(String[] args) {
        int [][]num=new int[2][3];
        num[0][0]=10;
        num[0][1]=20;
        num[0][2]=30;
        num[1][0]=40;
        num[1][1]=50;
        num[1][2]=60;
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                System.out.print(num[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }


    }
}
