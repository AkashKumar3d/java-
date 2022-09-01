import java.util.Scanner;

public class ch7_09_practice_que9 {
    static float convert(float celsius){
        float fahrenheit =(celsius*9)/5+32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the celsius temp value : ");
            float celsius= sc.nextFloat();
            System.out.println("after convert value of celsius to fahrenheit: "+convert(celsius)+" f");
        }
    }
}
