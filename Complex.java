
package oop1;

public class Complex {
   private float real;
      private float im; 

         public Complex() {
             real=0;
             im=0;
         }
         
    public Complex(float re, float m) {
        real = re;
        im = m;
    }
      public Complex addComplex(Complex c2){
            Complex c3=new Complex();
          c3.im=im+c2.im;
          c3.real=real+c2.real;
          return c3;}
      
       public Complex multiplycomplex(Complex c2){
            Complex c3=new Complex();
          c3.im=real*c2.im+c2.real*im;
          c3.real=real*c2.real-c2.im*im;
          return c3;}

       public Complex conjugate(){
            Complex c3=new Complex(real,-im);
            return c3;}
       
         public Complex  dividcomplex(Complex c2){
            Complex c3=new Complex();
           Complex c4=this.multiplycomplex(c2.conjugate());
           Complex c5=c2.multiplycomplex(c2.conjugate());
           c3.im=c4.im/c5.real;
           c3.real=c4.real/c5.real;
            return c3;}
         
         
          public float absolute(){
              return Math.abs(real*real+im*im);
          }
           public  double args(){
                return Math.toDegrees( Math.atan(im/real));
          }

   
    public String toString() {
        return real+" + "+ im+" i";
    }

   

    public boolean equals(Complex c) {
       
        if (this.real != c.real) {
            return false;
        }
        return this.im == c.im;
    }
       public Complex copy(){
           Complex c=new Complex(real,im);
           return c;
       }
         }
