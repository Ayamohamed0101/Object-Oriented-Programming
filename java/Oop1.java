
package oop1;

public class Oop1 {

  
    public static void main(String[] args) {
      FloatNumber f1=new FloatNumber(125,2);
         System.out.println(f1.toString());
        FloatNumber f2=new FloatNumber(23.56f);
          FloatNumber f3=new FloatNumber();
          f3.setVal(536);
          f3.setNdp(2);
          System.out.println(f1.toString());
          System.out.println(f2.toString());
          System.out.println(f1.add(f2));
          System.out.println(f1.addInteger(5));
          System.out.println(f1.mul(f2));
          System.out.println(f1.mulInteger(2));
          System.out.println(f3.toFloatNumber(123.24f));
          System.out.println(f3.toString());
          System.out.println(f3.round());
    }
    
}
