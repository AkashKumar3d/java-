/*
polymorphism in interface :-
implementing an interface force method implementation;

1) polymorphism interface ka matlab ye hai ki ham ek interface ka reference leke
ek new object bana ke kewal usi interface ke method ko access kar sakte hai;

2)  matlab ek interface ka  reference bana ke  bhi access  kar sakte hai esi ko
   polymorphism in interface kahate hai;
   polymorphism means:- (ek name anek kaam);

 */
// interface camera
interface camera1{
    void snap_pic();
    void video_record();

    default void cameraon1(){
        System.out.println("automatic your camera onn: ");
    }
}


// interface wi-fi
interface  wifi1{
    String [] connect();
}


// interface media_player
interface media_player1{
    void mp3_music_play();
    void video_play_music();
}

// base class
class my_cell_phone1{
    long number= 8318393949L;
    void calling(){
        System.out.println("calling... "+number);
    }

    void pic_call(){
        System.out.println("connecting... ");
    }

}
// derived class
class my_smart_phone1 extends my_cell_phone1 implements camera1,wifi1,media_player1{
    public  void snap_pic(){
        System.out.println(" camera onn please click the pic..");
    }


    public   void video_record(){
        System.out.println("video recording on..");
    }

    public  String[] connect(){
        System.out.println("available network list: ");
        String [] namelist={"akash123","arohi1254","hackishes"};
        return namelist;
    }

    public  void mp3_music_play(){
        System.out.println("music is playing...");
    }

    public  void video_play_music(){
        System.out.println("video is playing...");
    }

}

public class ak11_polymorphism_using_interface {
    public static void main(String[] args) {

    /* polymorphism using inheritance:-


     */
     // kewal camera1 ke methods ko execute karega
    camera1 c=new my_smart_phone1();
    c.snap_pic();
    c.video_record();
//    c.video_play_music();// throw error becouse it is not camera1 interface method . you can only use the camera1 method

    /*
     my_smart_phone1 sm=new my_smart_phone1();// its use all interfernce method
     sm.connect();
     sm.calling();
     sm.snap_pic();
     sm.video_record();
     sm.mp3_music_play();
     sm.video_play_music();

     */

    }
}
