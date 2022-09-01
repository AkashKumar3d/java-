/*
write a java program to find the leap year whether your enter
by the user is leap year or not;
 */
import java.util.Scanner;
public class ch4_05_practice_que5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the year for check: ");
            int year= sc.nextInt();

            if (year %400==0) {
                System.out.println("leap year :"+year);
            }else if (year % 100  ==0 ) {
                System.out.println("leap year :"+year);
            }else if (year % 4 == 0) {
                System.out.println("leap year :"+year);
            }else{
                System.out.println("not leap year ");
            }
        }
    }
}
