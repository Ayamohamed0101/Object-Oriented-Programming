
package oopsheet;

import java.util.Scanner;


public class GeometryMain {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n;
   do{
            System.out.print("____Geometry Calculator____\n"
                    + "1. Calculate the Area of a Circle \n"
                    + "2. Calculate the Area of a Rectangle \n"
                    + "3. Calculate the Area of a Triangle \n"
                    + "4. Quit \n"
                    + "Enter your choice (1-4): ");
            n=in.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter  radius :");
                    double r=in.nextInt();
                    double area=Geometry.circleArea(r);
                    if(area>0)System.out.println("Area of a Circle :"
                    +area);
                      break;
                case 2:
                    System.out.println("Enter  length :");
                    double l=in.nextInt();
                    System.out.println("Enter  width :");
                    double w=in.nextInt();
                    area=Geometry.rectangleArea(l, w);
                    if(area>0)System.out.println("Area of a Rectangle :"
                    +area);
                    break;
              case 3:
                    System.out.println("Enter  base :");
                    double b=in.nextInt();
                    System.out.println("Enter  height :");
                    double h=in.nextInt();
                    area=Geometry.triangleArea(b, h);
                    if(area>0)System.out.println("Area of a Triangle :"
                    +area);
                     break;
              case 4:
                  System.out.println("Thanks!");
                   break;
              default:
                  System.err.println("Your choice (1-4) only");
            }
}while(n != 4); 
}
}
