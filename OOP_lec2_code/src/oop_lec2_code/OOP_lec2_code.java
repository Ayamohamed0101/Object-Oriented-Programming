package oop_lec2_code;
import java.util.Scanner;

public class OOP_lec2_code 
  {
 public static void main(String[] args)

 { // ================  First Main  of Rectangle =================
        Rectangle R =new Rectangle();  
      
       System.out.println(  R.Getlength() );   // 0.0
       
        R.setlength(66);
      System.out.println(R.Getlength());//66
      System.out.println(R.GetWidth());//from Empty constructor ==>5
      System.out.println(R.area());// 66*5=330
      
       Rectangle p=new Rectangle(3,4);
       System.out.println( p.area());   // 12.0
  
// Build an Array of rectangle;
// create 4 rectangles
Rectangle[] Array_Rect =new Rectangle[4]; 
// we must intilize size of array .
//and 10 addresses located at memory has an hexadecimal values
for (int i = 0; i < 4; i++) 
{
        Array_Rect [i]  = new Rectangle(); // ==> Array ==>  Store in Index  --> address of object not Value 
        
}
//  for (int i = 0; i < 10; i++) 
//{
//     System.out.println(Array_Rect[i]);   // if we run this loop will print refreces of 10 objects in array 
//        
//}
//           
   

Scanner  S= new Scanner(System.in); // DON't forget import  library
  for (int i = 0; i < 4; i++) 
{
     float x ,y;// value from User
    x= S.nextFloat();
    y= S.nextFloat();
    Array_Rect [i]=new Rectangle(x,y) ;

}   
   for (int i = 0; i < 4; i++) 
{
     System.out.println( Array_Rect [i].area());
// the input will be ::
//1   // this a length of first rectangle
//2   // this a wigth  of first rectangle
//3
//4
//5
//6
//7
//8
// the output will be ::
//2.0   // this is the area of first rectangle
//12.0  // this is the area of second rectangle
//30.0 // this is the area of third rectangle
//56.0 // this is the area of  forth rectangle
}   
  
  // calculate sum of array of all rectangle
      float sum = 0;
     for (int i = 0; i < 4; i++) 
     {
         sum += Array_Rect[i].area();
     }
     System.out.println(sum );
//
// 2.0
//12.0
//30.0
//56.0
//100.0   the sum of 4  rectangles area
     
 // find largest area and it's index
 int index=0;
 float Large_area = Array_Rect[0].area(); // default guess  use as decleration of large index
     for (int i = 0; i < 4; i++) 
     {
         if(Array_Rect[i].area()>Large_area )
         {
             index=i;
             Large_area=Array_Rect[i].area();
         }
     }
      System.out.println( "the large area is ");
      System.out.println(Large_area);
      System.out.println("the large idex is ");
      System.out.println(index);
// the output
// the large area is 
// 56.0
// the large idex is 
// 3
// ================  second :: Main  of Fraction  =================   
// make 2 fractions and apply operation on them :
     Fraction f1 =new Fraction(); //   f1=3/5
     f1.setnum(3);
     f1.setden(5);
      Fraction f2 =new Fraction(); //   f2=6/9
     f2.setnum(6);
     f2.setden(9);
     // 1- fraction value
     System.out.println("Fraction value of f1 = " + f1.FractionValue() ); // 0.6
     System.out.println("Fraction value of f2 = " + f2.FractionValue() );// 0.6666667
    // 2-  Add 2 fraction and store result into new object
      Fraction f_result =new Fraction(); 
    f_result=f1.AddFractionUsingSetandGet(f2) ;
    System.out.println("Fraction addtion  = " +  f_result.FractionValue() );  // (3/5)+(6/9)= 19/15 =1,267
 
    f_result=f1.AddFractionUsingDotDirect(f2) ;
    System.out.println("Fraction addtion  = " +  f_result.FractionValue() );  // 19/15 =1,267
    
//3- Mutiply 2 fraction and store result into new object
     f_result=f1.Multiply2Fraction(f2) ;
    System.out.println("Fraction addtion  = " +  f_result.FractionValue() );  //   (3/5)*(6/9)=(18/45)=0.4
    
 //4- divide 2 fraction and store result into new object
     f_result=f1.Divide2Fraction(f2) ;
    System.out.println("Fraction addtion  = " +  f_result.FractionValue() );  //   (3/5) / (6/9)=(27/30)=0.9
    
 // 5- simplify fraction 
    f1.simplifyFraction();
     System.out.println(f1.FractionValue());
   f2.simplifyFraction();
     System.out.println(  " 6/9  ==> " +f2.FractionValue());
 // alhamdo __ Ly __ ALLAH .....^^
 

 
 
 }
    
}
