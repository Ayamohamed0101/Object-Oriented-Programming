
package oop_lec4;


public class Cylindrical {
    private float height;
    private Circle base;
    
    // constructor
    public Cylindrical(float h,float r)
    {
    height=h;
    base=new Circle (r);
    
    }
        // constructor

     public Cylindrical(float h,Circle r)
    {
    height=h;
    base=r;
    
    }
     public Circle getbase()
     {
     return base;
     }
}
