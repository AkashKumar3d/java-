import java.util.Scanner;

public class ch7_08_practice_que8 {
    static void star_pattern(int star){
        if (star >0) {
            star_pattern(star-1);
            for (int i = 0; i <star ; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the any number for print the star pattern :");
            int pattern= sc.nextInt();
            star_pattern(pattern);
        }
    }
}
