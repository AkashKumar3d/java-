/*
create a java program to add two matrices of size 2*3;
 */

public class ch6_04_practice_que4 {
    public static void main(String[] args) {
        int [][] m1={{2,3,6},{4,5,6}};//first matrices
        int [][] m2={{9,8,7},{4,5,6}};// second matrices
        int [][] result={{0,0,0},{0,0,0}};// sum of two matrices

// display the first matrices
        System.out.println("matrices m1: ");
        for (int i=0;i<m1.length;i++){
            for (int j = 0; j <m1[i].length ; j++) {
                System.out.print(m1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

 //display the second matrices
        System.out.println("matrices m2:");
        for (int i=0;i<m2.length;i++){
            for (int j = 0; j <m2[i].length ; j++) {
                System.out.print(m2[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

// create logic matriecs display index m1
        System.out.println("element index m1: ");
        for (int i = 0; i <m1.length ; i++) {// row number of time
            for (int j = 0; j <m1[i].length ; j++) {// column number of times
                System.out.printf("i=%d and j=%d\n",i,j);
            }
        }

// create logic matriecs display index m2(ye optional hai);
        System.out.println("element index of m2: ");
        for (int i = 0; i <m2.length ; i++) {// row number of time
            for (int j = 0; j <m2[i].length ; j++) {// column number of times
                System.out.printf("i=%d and j=%d\n",i,j);
            }
        }

 // addition of two matrics
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j <m1[i].length ; j++) {
                result[i][j]=m1[i][j]+m2[i][j];
                System.out.print( result[i][j] +" ");

            }
            System.out.printf("\n");
        }
    }
}
