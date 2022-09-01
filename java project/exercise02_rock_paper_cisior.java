/*
write a program for rock scissor and paper game ;
 */
import java.util.Scanner;
import  java.util.Random;
public class exercise02_rock_paper_cisior {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Press:\n 1 for rock,\n 2 for scissor,\n 3 for paper");
            System.out.println("Enter your choice");
          int player= sc.nextInt();

          Random ran=new Random();
          int computer= ran.nextInt(3);


            if (player == computer) {
                System.out.println(" game draw!");
            }else if (player==1 && computer==2 || player==2 && computer==3 || player==3 && computer==1) {
                System.out.println("user win!");
            }else{
                System.out.println("computer win! ");
            }

            System.out.println("computer choice is: "+computer);
    }


    }
}
