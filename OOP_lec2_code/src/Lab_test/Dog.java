/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_test;

public class Dog {

    public static void main(String[] args) {
        Dogclass dog1 = new Dogclass("Buddy", "Golden reritve");
        Dogclass dog2 = new Dogclass("charlie", "bulldog");

        System.out.println(dog1.getname() + "  is a " + dog1.getbreed());
        System.out.println(dog2.getname() + "  is a " + dog2.getbreed());
        System.out.println(" Set the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("labrador");
        dog2.setname("Daisy");

        System.out.println(dog1.getname() + "is a " + dog1.getbreed());
        System.out.println(dog2.getname() + "is a " + dog2.getbreed());

        ////////
        Shape shape = new Shape();

        // assign subclass reference to subclass variable
        Rectangle rect = new Rectangle();

        // shape points to the object rect.
        shape = rect;

        // Set data in Rectangle's object 
        shape.setValues(78, 5);

        //Display the area of rectangle
        System.out.println("Area of rectangle : " + rect.getArea());

        // assign subclass reference to subclass variable
        Triangle tri = new Triangle();

        // shape points to the object rect.        
        shape = tri;

        // Set data in Triangle's object         
        shape.setValues(34, 3);

        //Display the area of triangle        
        System.out.println("Area of triangle : " + tri.getArea());

        System.out.println("========////////==========");

        Complexx c1 = new Complexx(1, 2);
        Complexx c2 = new Complexx();
        Complexx c3 = new Complexx(c1);
        Complexx c4 = new Complexx(3, 4);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        c2.add(c1);
        Complexx c5 = c1;
        c1.sub(c4);
        System.out.println(c3.getreal()+" "+c3.getim());
        System.out.println(c5.getreal()+" "+c5.getim());
        Complexx c6 = Complexx.add(c3, c4);
        System.out.println(c6.getreal()+ " "+c6.getim());
        System.out.println("NO of created= " + Complexx.getNo());
    }
}
