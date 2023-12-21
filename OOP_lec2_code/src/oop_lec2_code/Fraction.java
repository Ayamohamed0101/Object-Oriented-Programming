
package oop_lec2_code;
public class Fraction 
{
 private int num;
 private int den;
public Fraction()
{
    num=0;
    den=1; //any number except zero because it's a fraction
}
public Fraction(int x,int y)
{
    num=x;
    if (y!=0) { den=y;}  
    else {den=1;}   //any number except zero because it's a fraction
}
// 2 setter and getter
public void setnum(int a)
{
    num=a;
}
public void setden(int b)
{
    den=b;
}
public int getnum()
{
    return num;
}
public int getden()
{
    return den;
}

public float FractionValue()
{
    return (float) (( num )*(1.0) /den) ;
}
// Operation on Fraction(sum,divide,multiply,simplification...)
//1- Addition
//- using set and get
public Fraction AddFractionUsingSetandGet (Fraction t) // return object from type fraction
{ // class result= new Consturctor();
    Fraction result= new Fraction();
    result.setnum(num * t.getden() +t.getnum() *den );
    result.setden(den * t.getden());
    return result;
}
//- without usig set and get
 public Fraction AddFractionUsingDotDirect (Fraction t) // return object from type fraction
{ // class result= new Consturctor();
    Fraction result= new Fraction();
    result.setnum( num * t.den + t.num*den );
    result.setden( den * t.den );
    return result;
}   
//2- function to multiply 2 fractions
 public Fraction Multiply2Fraction(Fraction t)
 {
  Fraction result= new Fraction()  ;
  result.setnum(num*t.getnum()  );
  result.setden(den *t.getden());
    return result;
}
//3- function to divide 2 fractions
 public Fraction Divide2Fraction(Fraction t)
 {
 Fraction result= new Fraction()  ;
      result.setnum(num* t.getden());
       result.setden(den*t.getnum());
return result;
 }
 //4- simplify fraction ==> get the greatest common devidor 
 //-  using abs
 public void simplifyFraction()
 { 
     int s;
 if(Math.abs(num)<Math.abs(den))
 {
     s=Math.abs(num) ;
 }
 else
 {     
     s=Math.abs(den) ;      
 }
 if(num%s==0 && den%s==0 )
 { num=num/s;
   den=den/s; 
 }
 else
    {
 int i ;
 for(i=s/2;i>1;i--)
       {
        if( num%i==0 && den%i==0 )
         break;
 
       } 
  num=num/i;
  den=den/i; 
 
      }
 
 }
 
 
 
 }
 
 
 
 
 
 


