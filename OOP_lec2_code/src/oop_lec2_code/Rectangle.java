
package oop_lec2_code;

import java.util.Scanner;


     public class Rectangle
  { 

    // 1- private can't be used out side own class
      private float length;
      private float width;
    // 2- Constructor has two type
    // - parametrized consturctor
    // - Empty constructor
      public Rectangle(float x,float y)
      { length=x;
        width=y;     
      }
      public Rectangle()
      { length=0;
        width=5;     
      }
      public void setlength( float len)
      {
          length=len;
      }
     public float Getlength( )
      {
         return length;
      }
     public float GetWidth( )
      {
         return width;
      }
      public float area()
      {
          return length*width;
      }
       
     
     
   }  

