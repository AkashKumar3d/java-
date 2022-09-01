import static java.lang.System.*;

/*

 */
// interface camera
interface camera{
 void snap_pic();
 void video_record();
   /* ham interface ke ander se private  method ko direct access nahi
   kar sakte hai .lekin use default method ki help se access kar sakte
   hai
    */
   private void editing(){
       out.println("edit your video..");
   }
 default void cameraon(){
       editing();// private method access with the help of camera on
     out.println("automatic your camera onn: ");
 }
}


// interface wi-fi
interface  wifi{
   String [] connect();
}


// interface media_player
interface media_player{
    void mp3_music_play();
  void video_play_music();
}

// base class
class my_cell_phone{
    long number= 8318393949L;
 void calling(){
     out.println("calling... "+number);
 }

 void pic_call(){
     out.println("connecting... ");
 }

}
// derived class
class my_smart_phone extends my_cell_phone implements camera,wifi,media_player{
 public  void snap_pic(){
     out.println(" camera onn please click the pic..");
 }

 /* ham interface ke ander ke default method ko override karke derived
 class ke ander change kar sakte hai;
 like this: cammeraon method
  */
//   public  void cameraon(){
//        System.out.println("camera is not default on ");
//    }

  public   void video_record(){
      out.println("video recording on..");
  }

  public  String[] connect(){
      out.println("available network list: ");
      String [] namelist={"akash123","arohi1254","hackishes"};
      return namelist;
  }

  public  void mp3_music_play(){
      out.println("music is playing...");
  }

  public  void video_play_music(){
      out.println("video is playing...");
  }

}

public class ak11_interfaces_and_default_method {
    public static void main(String[] args) {
        my_smart_phone sc=new my_smart_phone();
        sc.calling();
        sc.pic_call();
        sc.snap_pic();
        sc.cameraon();
//        sc.editing();// throw as error
        sc.video_record();
        sc.mp3_music_play();
        sc.video_play_music();
        String [] ar= sc.connect();
// foreach loop se hamara saara array ka eliment print ho jayega;
        for (String item:ar) {
            out.println(item);
        }

    }
}
