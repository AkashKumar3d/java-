/*
write a program to find out the type of website from the url;
.com->commercial website
.org->organization website
.in->indian website
 */

import java.util.Scanner;
public class ch4_06_practice_que6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your website: ");
            String url= sc.next();

            if (url.endsWith(".com")) {
                System.out.println("this is commercial website!");
            }else if (url.endsWith(".org")) {
                System.out.println("this is organization website!");
            }else if (url.endsWith(".in")) {
                System.out.println("this is Indian website!");
            }
        }
    }
}
