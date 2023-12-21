package oop_lec4;

public class OOP_lec4 {

    public static void main(String[] args) {
///==================== First Main of  class point ==================
        Point p1 = new Point(3, 4);// fquad =1;
        Point p2 = new Point(6, 4);// fquad=2;
        Point p3 = new Point(5, 7);// 3
        Point p4 = new Point(7, 1);//4
        Point p5 = new Point(3, -1);//4
        p5.setx(10);//4
        p5.sety(4);//5
        System.out.println("the number of point is = " + Point.getfquad());// call  static fun using class
        System.out.println("the number of point is = " + p5.getfquad());// call  static fun using object
        System.out.println(Point.getpowfquad(2));// 25

// the output will be ::
//the number of point is = 5
//the number of point is = 5
        Point result = p5.addpoint(p4);// (10,4)+(7,1)
        System.out.println("the result of addition is ==> " + result.getx() + "," + result.gety());
//the result of addition is ==> 17.0,5.0
        float distance = p5.Distance(p4);
        System.out.println("the result of distance is ==> " + distance);//4,24
        ///==================== second Main of  class Instructor & Course ==================
        Instructor i = new Instructor("Khaled", "Dr", "123");// name,position ,id
        Course math = new Course("Math3", i);// this  take 2 parameter ==> string and instructor
        System.out.println("the Instructor name  ==> " + math.getid().getName());
        System.out.println("the Instructor position ==> " + math.getid().getPosition());
        System.out.println("the Instructor id  ==> " + math.getid().getId());
        ///==================== third Main of  class Circle & Cylindrical ==================
        Cylindrical c1 = new Cylindrical(2, 6);// first constructot take 2 float num

        Cylindrical c2 = new Cylindrical(2, new Circle(4));// second constructot take float and class
        System.out.println("the area of circle is = " + c2.getbase().area());
        Circle c = new Circle(4);
        System.out.println("the area = " + c.area());
//  تم بحمد الله

//هم عبادك الضفعاء
//أنت الله القويُّ العزيز.♥♥"
//_غزة
    }
}
