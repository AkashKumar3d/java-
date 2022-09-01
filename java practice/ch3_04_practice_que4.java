/*
que:
write a java program to detact double and triple space in
a string;
 */

public class ch3_04_practice_que4 {
    public static void main(String[] args) {
        String name="hello mr akash how are  you";
        System.out.println(name.indexOf("  "));// double space
        System.out.println(name.indexOf("   "));// triple space
    }
}
