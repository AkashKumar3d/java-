/*
que:
write a java program to fill in a latter tamplate which
looks like below;
latter="dear <|name|> ,trans a loat";
replace <name>with a string (some name);
 */

public class ch3_03_practice_que3 {
    public static void main(String[] args) {
        String latter="Dear <|name|> , thanks a lots";
        latter=latter.replace("<|name|>","Akash");
        System.out.println(latter);
    }
}
