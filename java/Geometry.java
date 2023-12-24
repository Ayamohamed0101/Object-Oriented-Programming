
package oopsheet;


public class Geometry {
    public static double circleArea(double  radius ) {
      if( radius <0){
          System.err.println("Error,only enter positive values");
          return -1;
      }
         return Math.PI* radius* radius;
    }
     public static double  rectangleArea(double length,double width) {
      if(length<0 || width<0 ){
          System.err.println("Error,only enter positive values");
          return -1;
      }
      return length*width;
    } 
     public static double triangleArea(double base,double height) {
      if(base<0 || height<0){
          System.err.println("Error,only enter positive values");
          return -1;
      }
      return 0.5*height*base;
    }
}
