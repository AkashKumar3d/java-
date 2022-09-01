/*
write a java program to reverse an array;
 */
public class ch6_05_practice_que5 {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50, 25 };
        int divide = Math.floorDiv(num.length, 2);/*
                                                   * pure array ko two parts
                                                   * mai divide kar dega
                                                   */
        int temp;

        // logic for reverse the array element
        for (int i = 0; i < divide; i++) {
            // swapping technic use for reverse
            temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }
        // for each loop use for the travrsing for the print
        for (int element : num) {
            System.out.println(element);
        }
    }
}
