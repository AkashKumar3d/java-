/*
create a class tv which implement tv_remote interface from que6.
create an interface tv_remote and use it to inherit another interference
smart_tv remote.
 */
// create interference
interface tv_remote1{
    void on_button();
    void change_channel();
    void increase_volume();
    void decrease_volume();

}
//inherit from tv-remote
interface smart_tv_remote1 extends tv_remote1{
    void on_hotspot();
    void off_hotspot();
    void open_youtube();
}
// creating the class for define the interface
class tv1 implements tv_remote1,smart_tv_remote1{

    public void on_button() {
        System.out.println("please on the tv...");
    }

    public     void change_channel(){
        System.out.println("channel change....");
    }
    public     void increase_volume(){
        System.out.println("increase volume....");
    }
    public   void decrease_volume(){
        System.out.println("decrease volume.... ");
    }
    public void on_hotspot(){
        System.out.println("on hotspot....");
    }
    public   void off_hotspot(){
        System.out.println("off hotspot....");
    }
    public  void open_youtube(){
        System.out.println("open youtube....");
    }

}
public class ch11_07_practice_que7 {
    public static void main(String[] args) {
        tv_remote1 tv=new tv1();// dynamic dispatched method
        tv.on_button();
        tv.change_channel();
        tv.decrease_volume();
        tv.increase_volume();
//    tv.on_hotsport();// error throw not a tv_remote method ;

    }
}
