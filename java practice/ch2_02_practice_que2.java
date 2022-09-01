/*
que2:
write a java program to encrept a grade by adding 8 to it . decrept to show the
the correct grade;
 */

public class ch2_02_practice_que2 {
    public static void main(String[] args) {
        char grade='C';
// incrpting the grade
        grade=(char)(grade + 8);
        System.out.print("Increpting the grade: ");
        System.out.println(grade);

// Dcrepting the grade:
        grade=(char)(grade-8);
        System.out.print("Decrepting  the grade: ");
        System.out.println(grade);
    }
}
