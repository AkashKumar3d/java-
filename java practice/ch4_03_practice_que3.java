/*
calculate income tax paid by an employee to the government
as per the slabs mentions belows;
income slab            tax
2.5l-5.0l              5%
5.0l-10.0l             20%
above 10.0l            30%

note: that there is no tax below 2.5l take input amount
as an input from the user.
 */

import java.util.Scanner;
public class ch4_03_practice_que3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your income per year: ");
            long income= sc.nextLong() ;
            System.out.println("your per year income is:"+income+"Rs-/");


            if(income<=250000) {
                System.out.println("you are no paid income tax charge of goverment becouse your per year income below 2.5l:");
            }else if (income > 250000 && income<=500000) {
                 long    tax=income*5/100;
                System.out.println("your income is above the 2.5l you are paid tax 5% per year tax is :"+tax+"Rs-/");
            }else if (income>500000 && income<=1000000){
                long tax=income*20/100;
                System.out.println("your income is above the 5.0l you are paid tax 20% per year tax is :"+tax+"Rs-/");
            }else if (income>100000 ) {
                 long tax=income*30/100;
                System.out.println("your per year income is above the 10.0l. you are paid tax 30% per year and tax is :"+tax+"Rs-/");
            }else {
                 System.out.println("wrong option");
             }
        }

    }
}
