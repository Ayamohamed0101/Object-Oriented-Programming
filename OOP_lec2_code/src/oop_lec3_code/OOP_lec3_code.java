
package oop_lec3_code;

import java.util.Scanner;

public class OOP_lec3_code {
    public static void main(String[] args)
     {
     ////////// first main of class   Complex ===================
     Complex c1  = new Complex() ;
     c1.setimag(4);
     c1.setreal(5);// 5+4i
     Complex c2 = new Complex() ;
     c2.setreal(8);
     c2.setimag(6);// 8+6i

     Complex res = new Complex() ;
// adding 2 complex num
      res=c1.Adding2complex_num (c2) ;
     System.out.println("adding " + "c1"+ " + " +"c2" +" ==> "+ res.getreal() +"+"+ res.getimag() +  "i");
// multiply 2 complex num   
     res=c1.Multiply_2complexnum(c2) ;
     System.out.println("multiply " + "c1"+ " *" +"c2" +" ==> "+ res.getreal() +"+"+
             res.getimag() +  "i");
//  dividing  ==> c1/c2  ==> 
         System.out.println("result of dividing c1/c2 ==>" +Complex.divide2complexnum(c1,c2).getreal() 
                 + ""+ Complex.divide2complexnum(c1,c2).getimag() +"i" );
   
// output :: 
//adding c1 + c2 ==> 13.0+10.0i
//multiply c1 *c2 ==> 16.0+62.0i
//result of dividing c1/c2 ==>1.5609756-0.048780486i

     float length=c1.Lengtn_complex_num() ;
         System.out.println(length );
         
        //////// creating array of 4 complex numbers of 
Scanner s=new Scanner(System.in) ;

Complex array_complex [] = new Complex[4] ;// create area with 4 objects from type "complex"
// take complex numbers from user 
for(int i =0;i <4 ;i++  )
{
    array_complex[i]=new Complex(s.nextFloat(),s.nextFloat()) ;
}

//////////// finding object with the largest length 
int index=0;
float largest = array_complex[0].Lengtn_complex_num();// default for largest declartion

for(int i =0;i <4 ;i++  )
{

if(array_complex[i].Lengtn_complex_num() > largest )
   
    {    largest=array_complex[i].Lengtn_complex_num() ;
          index=i;
    }
}         
         System.out.println( "the largest length of 4 objects is ==> "+array_complex[index].getreal() +" + " + 
                 array_complex[index].getimag() +"i");    
//    // the output
//1
//2
//3
//4
//5
//6
//7        ==> this is  the real part
//8        ==> this is  the image part    ===> length is largest here
//the largest length of 4 objects is ==> 7.0 + 8.0i
         

// equals ==> it's build in function 
//return true only if 2 objects have the same address except 
//string return ture when value is equal ,
// for object complex::
Complex c=new Complex(2,4) ;
Complex b =new Complex(2,4) ;
// before writing equals in class complex
 System.out.println( c.equals (b));// false
  // for object string ::
  String s1="none";
  String s2="none";
 System.out.println( s1.equals (s2));// true
         
 ////////////// Inheritance ::  function ==> equals( object) 
// After writing equals in class complex == make overriding
        
 System.out.println( c.equals (b));// true
 
 
 //////  2 objects with same refrences
 Complex object_with_2_refrence=new Complex(35,4);
 Complex object_refer_to_previous_object =object_with_2_refrence;
 
    System.out.println("the  refrence for  object_with_2_refrence" +object_with_2_refrence);//Complex@28d93b30
    System.out.println("the  refrence for  object_refer_to_previous_object" + object_refer_to_previous_object);//Complex@28d93b30
  ////// 2objects with  same value and diffrent refrences
 Complex x =new Complex(9,2);
 Complex y=new Complex(x.getreal() , x.getimag());

  ////// make 2 object refer to same refrence and same value and neglect  value of second object
 Complex x1=new Complex(9,2);
 Complex x2 =new Complex(96,92);
  x2=x1;
    System.out.println("the  refrence for  x1" +x1);//.Complex@1b6d3586
    System.out.println("the  refrence for  x1" +x2);//Complex@1b6d3586
    // when print the value of second object
    System.out.println("the value of x2  ==> "  +x2.getreal() + "  and image "+ x2.getimag());
     // the value of x2  ==> 9.0  and image 2.0
    
  ////////// second main of  class  clock
 Clock cc1 = new Clock() ;
 cc1.sethours(3);
 cc1.setmin(23);
 cc1.setsec(6); // 3:23:6
 Clock cc2 = new Clock(2,20,8) ;// parametrized constructor
 
 Clock cc3 = new Clock() ;
  cc3=cc2.addClock(cc1) ;
         System.out.println("add hour  "   +cc3.gethours() + " : " 
       +cc3.getmin() + " : "+ cc3.getsec());//add  hours  5 : 23 : 6
         
 cc3.addMinute() ;
           System.out.println("add second "   +cc3.gethours() + " : " 
       +cc3.getmin() + " : "+ cc3.getsec());//add  hours  5 : 24 : 6
 
           
 cc3.addTick();
           System.out.println("add minute "   +cc3.gethours() + " : " 
       +cc3.getmin() + " : "+ cc3.getsec());//add  hours  5 : 24 : 7
          
         


     }
}
