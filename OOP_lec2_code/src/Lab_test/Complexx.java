/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_test;


public class Complexx {
    private float re;
    private float im;
    private static int no=0;
    public  Complexx()
    {
        this (0,0);
    }
    public Complexx(float r,float i){
        re=r;
        im=i;
        no++;
    }
    public Complexx(Complexx c)
    {this (c.re,c.im);}
   public float getreal()
   {
       return re;
   }
   public float getim()
   {
       return im;
   }
   public void setreal(float r){
       re=r;
   } 
     public void setim(float i){
im=i;   } 
   
     
     
     public Complexx add(Complexx c)
     {
         re+=c.re;
         im+=c.im;
        
         return this;
         
     }
     public Complexx sub(Complexx c)
     {re-=c.re;
     im-=c.im;
     return this;
     }
     public static int getNo()
     {return no;}
     
     public String  tostring()
     {
         return "real=+" +re + "imaginary+"+im;
     }
     public static Complexx add(Complexx c1,Complexx c2)
     {
     Complexx c3=new Complexx(c1.re-c2.re, c1.im-c2.im);
     return c3;
     }
}
