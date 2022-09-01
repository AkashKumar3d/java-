/*
methods of string :
string method operate of java string . they can be used to find
length of the string.cnvert to lower case string;

 */



public class ak13_1_String_method_in {
    public static void main(String[] args) {

         String name="akash";
        System.out.println(name);

//1) name.length();

       int value1=name.length();
       System.out.println(value1);

//2) name.toLowercase();
     String res=name.toLowerCase();
        System.out.println(res);

//3) name.toUppercase();

     String res1=name.toUpperCase();
        System.out.println(res1);

/*
4) name.trim();// trim() ka kaam base etana hai ki wo white
space ko ignore karta hai ;

 */

        String name1="  akash  ";
        System.out.println(name1);// name1 space ke sath p print hoga

     String res3=name1.trim();
        System.out.println(res3);// space ko ignore kar dega;

//5) name.substring(int start);// jo index denge waha se leke end tak print hoga;

       String res4=name.substring(2,4) ;
        System.out.println(res4);

/*6) name.substring(int start, int end);//jo hamane start and
 end mai index value diya hai usase ek pahale tak ka string
 print hoga;
 */

//        String res5=name.substring(2,4);

        String res5=name.substring(2,5);
        System.out.println(res5);

//7) name.replace('oldchar', 'newchar');// purane char ke word ko new char se replace kar dega

        String res6=name.replace('k','a');
       //System.out.println(res6);



//8) name.startsWith("ak");//
        System.out.println(name.startsWith("ak"));

//9) name.endWith('sh');
      System.out.println(name.endsWith("sh"));

//10) name.charAt(2);
        System.out.println(name.charAt(2));

//11) name.indexOf(s);
        System.out.println(name.indexOf("h"));

//12) name.indexOf("k",4);
        System.out.println(name.indexOf("k",1));

//13) name.LastIndexOf("s");
        System.out.println(name.lastIndexOf("s"));

//14) name.lastIndexOf("s",2);
        System.out.println(name.lastIndexOf("s",2));

//15) name.equal("akash");
        System.out.println(name.equals("akash"));

//16) name.name.equalsIgnoreCase("akash");
        System.out.println(name.equalsIgnoreCase("AKASH"));
    }
}
