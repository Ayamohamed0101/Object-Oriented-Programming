
package oop_lec3_code;

import java.util.Scanner;

public class Complex 
{
private float real;
private float imag;
public Complex()
{
    real=(float) 0.0; 
    imag=(float) 0.0;
}

public Complex(float x,float y)
{
    real=x; 
    imag=y;
}
public void setreal(float a)
{
    real=a;
}
public void setimag(float b)
{
    imag=b;
}
public float getreal()
{
    return real;
}
public float getimag()
{
    return imag;
}
// operation on complex num
//1- adding
public Complex Adding2complex_num (Complex t)
{
Complex result = new  Complex() ;
result.real=real+t.real;
result.imag=imag+t.imag;
return result;
}
// 2- multiply
public Complex Multiply_2complexnum (Complex t)
{
Complex result = new  Complex() ;
result.real=real*t.real - imag*t.imag;
result.imag=imag*t.real +real*t.imag;
return result;
}
 
// 3- dividing 2 complex 
// using (( static )) to call function in main without using object
 
public static Complex divide2complexnum (Complex c2, Complex c1) 
 {
    return new Complex (
      (c1.real*c2.real+c1.imag*c2.imag)/(c2.real*c2.real+c2.imag*c2.imag),
      (c1.imag*c2.real-c1.real*c2.imag)/(c2.real*c2.real+c2.imag*c2.imag)   );
  }
//4- length of complex  num

public float Lengtn_complex_num ()
{
Complex result = new  Complex() ;
return (float) (Math.sqrt(real*real+ imag*imag) ) ;
}




//6- overriding :: will make new fuction depending on inheritance
//equals==> return if 2 objects is same at value or not
public boolean equals(Complex t)
{
    return(real==t.real && imag==t.imag );
}



}
