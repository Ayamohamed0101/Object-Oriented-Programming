
package oop1;


public class main {
    public static void main(String[] args) {
       
    Complex a = new Complex(3, 0);
    Complex b = new Complex(1, 1);
    System.out.println(a.absolute());
    System.out.println(b.args());
    System.out.println(a.multiplycomplex(b));
    System.out.println(a.dividcomplex(b));
    System.out.println(a.addComplex(b));
  
    }
}
