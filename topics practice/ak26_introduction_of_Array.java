/*
----------------------------->Array(NOTES)<---------------------------------
array: array is the collection of similar types of data;

  there are three way to create the array;

  1) array declaration and memory allocation:
    syntax:- int [] marks=new int[5];
    marks[0]=12;
    marks[1]=13;
    marks[2]=14;
    marks[3]=15;
    marks[4]=16;

    2) array declaration and then memory allocation;
    syntax:-
    int [] marks;
    marks=new int[5];
    marks[0]=12;
    marks[1]=13;
    marks[2]=14;
    marks[3]=15;
    marks[4]=16;

    3) array declaration and memory initialization;
    syntax:-
    int [] marks= {100,200,300,400};


-------------->array length ,for loop and for each loop<--------------
 array length: Array have a length property which give the length of
 array.

 syntax:-
 array.length()
 System.out.println(array.length(name));


// for loop in array:
for loop:-an array can be displaying using a for loop;

syntax:-
for(int i=0;i<array.length;i++){
System.out.println(array.length(i));
}


// for each loop:(new version for loop);
new way to displaying an array.

syntax:-
for(int element: array){
System.out.println(element);
}
 */

public class ak26_introduction_of_Array {
    public static void main(String[] args) {

//1) -------->array declaration and memory allocation:<---------
int  []marks=new int [6];
   marks[0]=10;
   marks[1]=20;
   marks[2]=30;
   marks[3]=40;
   marks[4]=50;
   marks[5]=60;

        System.out.println("array declaration and memory allocation:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

//2) ---------->array declaration and then memory allocation<----------
      int []age;
      age=new int[5];
      age[0]=11;
      age[1]=12;
      age[2]=13;
      age[3]=14;
      age[4]=15;
        System.out.println("array declaration and then memory allocation");
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);

//3) ---------->array declaration and memory initialization;<----------
   String []str={"akash","ankit","anish","avinash","mahek"};

// find array length
        System.out.println("the length of the array is: "+str.length);

        System.out.println("array declaration and memory initialization;");
// simply way to displaying array;
        System.out.println("simply way to displaying array;");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        System.out.println(str[4]);

// using foreach loop to display array;
        System.out.println("using foreach loop to display array;");
        for (int i =0 ; i <=str.length ; i++) {
            System.out.println(str[i]);
        }

// using for each loop to display array;
        System.out.println("using for each loop to display array;");
        for(String element:str){
            System.out.println(element);
        }
    }
}
