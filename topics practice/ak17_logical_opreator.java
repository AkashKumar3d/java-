/*
---------------------->logical optetor<------------------------
 */

public class ak17_logical_opreator {
    public static void main(String[] args) {
      boolean a=true;
      boolean b=true;
      boolean c=true;
// ------------->AND Operator<------------
/* AND operator mai sare condition  condition true hone chahiye agar ek
 bhi ek bhi condition false hua to else excute ho jayega
 */
        if (a && b && c) {
            System.out.println(" yes ");
        }else {
            System.out.println("no");
        }

/*
        ------------------->OR Operator<----------------------
OR operator mai koe ek bhi condition true ho gya to if condition execute
ho jayega;
 */
        boolean a1=false;
        boolean b1=true;
        boolean c1=false;
        if (a || b || c) {
            System.out.println(" yes ");
        }else {
            System.out.println("no");
        }

/*
  ------------------->NOT Operator<-----------------
  OR operator such condition ko jhuth aur jhuth condition mai convert
  kar deta hai;
 */
        boolean a2=true;
        if (!a2) {
            System.out.println(" true ");
        }else {
            System.out.println("false");
        }

    }
}
