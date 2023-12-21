/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_test;


public class Shape {
  private double height;  // To hold height.
   private double width;  //To hold width or base
public Shape()
{height=1;
width=1;}
   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   }    
}   

