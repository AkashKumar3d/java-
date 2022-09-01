/*
que:
write a java program to find out the day of the weak given the number;[
1 for monday 2 for tuesday ... and so on]
 */

import  java.util.Scanner;
public class ch4_04_practice_que4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("press 1 for Monday:");
            System.out.println("press 2 for Tuesday:");
            System.out.println("press 3 for Wednesday:");
            System.out.println("press 4 for Thursday:");
            System.out.println("press 5 for Friday:");
            System.out.println("press 6 for Saturday:");
            System.out.println("press 7 for Sunday:");
            System.out.println("Enter the your choice:");
            int num= sc.nextInt();

            switch(num){
                case 1:
                    System.out.println("today is monday:");
                    break;
                case 2:
                    System.out.println("today is Tuesday:");
                    break;
                case 3:
                    System.out.println("today is Wednesday:");
                    break;
                case 4:
                    System.out.println("today is Thursday:");
                    break;
                case 5:
                    System.out.println("today is Friday:");
                    break;
                case 6:
                    System.out.println("today is Saturday:");
                    break;
                case 7:
                    System.out.println("today is Sunday:");
                    break;
                default:
                    System.out.println("wrong option ");
            }
        }
    }
}
