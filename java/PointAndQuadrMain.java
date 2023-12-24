
package oopsheet;


public class PointAndQuadrMain {
    public static void main(String[] args) {
        
    
   // A(−3, 1), B(−1, 4), C(3, 2), D(1, −2)  //19
    Point p1=new Point();
    Point p2=new Point();
    Point p3=new Point();
    Point p4=new Point();
   p1.setPoint(-3, 1);
   p2.setPoint(-1, 4);
   p3.setPoint(3, 2);
   p4.setPoint(1, -2);
     Quadr q=new Quadr(p1,p2,p3,p4);
        System.out.println(q.area());
    q.setData(-4, -2, 2, 3, 3, -2, -3, -5); //28
        System.out.println(q.area());
       
        
        
}
}