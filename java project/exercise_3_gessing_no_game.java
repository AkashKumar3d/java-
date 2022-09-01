import java.util.Scanner;
import java.util.Random;
/*
create a class game which allow  a user to play "gusses the number"
game once. game should be the following method .
1)constructor to genarate the number random number;
2) takeuserinput() to take a user input of number;
3) iscorrectnumber() to detect whether enter by the user is true.
4) getter and setter for no of gusses.
 use proprety such the no of gusses(int).etc to get this task done.

 */
class game{
    Scanner sc=new Scanner(System.in);
    int player;
    int computer;
    int gess=0;

// setter
    public void set_gess(int gess) {
        gess = gess;
    }

//getter
public int get_gess() {
        return gess;
    }


// constructor
 game(){
    Random ran=new Random();
    computer= ran.nextInt(100);
}

// method userinput
public void take_user_input(){
        System.out.println("please guss the number 0 to 100: ");
        player = sc.nextInt();
}

// method iscorrect detect
// hame ese boolean esliye banana pada kyuki hame bina boolean banaye main saare
// method and contructor ko main function ke andar loop ai nahi dall sakte loop mai nahi dall skate
public boolean is_correct(){
        gess++;
        if (player < computer) {
            System.out.println("you gess the large number: "+player);
            return false;
        } else if (player > computer) {
            System.out.println("please enter the small number: "+player);
            return false;
        } else {
            System.out.printf(" you are win \n you have guss the number %d\n you gess in %d times: ",player,gess);
            System.out.println("your gusses no is correct "+player);
            System.out.println(computer);
            return true;
        }

}



}
public class exercise_3_gessing_no_game {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b) {
            g.take_user_input();
          b= g.is_correct();
        }
    }
}
