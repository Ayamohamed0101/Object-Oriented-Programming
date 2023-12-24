
package oop1;
public class FloatNumber {
   private int  val;  
      private int  ndp;
public FloatNumber(){
    val=0;
    ndp=0;
}
    public FloatNumber(int val, int ndp) {
        this.val = val;
        this.ndp = ndp;
    }
       public FloatNumber(float n) {
         String s=String.valueOf(n);
    val=Integer.parseInt(s.substring(0,s.indexOf('.'))+ s.substring(s.indexOf('.')+1, s.length()));
    ndp=(s.substring(s.indexOf('.')+1, s.length()).length());
    }

   @Override
      public String toString(){
           String s=String.valueOf(val);
           return s.substring(0,s.length()-ndp)+"."+s.substring(s.length()-ndp, s.length());
       }
       public float show(){
          return Float.parseFloat(this.toString());
       }
     public FloatNumber toFloatNumber(float n) {
             FloatNumber f1= new FloatNumber();    
         String s=String.valueOf(n);
         f1.val=Integer.parseInt(s.substring(0,s.indexOf('.'))+ s.substring(s.indexOf('.')+1, s.length()));
    f1.ndp=(s.substring(s.indexOf('.')+1, s.length()).length());
         return f1;
    }
       
       public FloatNumber add(FloatNumber f2){
           return  toFloatNumber( this.show()+f2.show());
       }
       
        public FloatNumber mul(FloatNumber f2){
           return  toFloatNumber( this.show()*f2.show());
       }
         public FloatNumber mulInteger(int n){
           return  toFloatNumber( this.show()*n);
       }
           public FloatNumber addInteger(int n){
           return  toFloatNumber( this.show()+n);
       }
              public int round(){
           return Math.round(this.show());
       }
    

    public boolean equals( FloatNumber f) {
       
        if (this.val != f.val) {
            return false;
        }
        return this.ndp == f.ndp;
    }
       public FloatNumber copy(){
           FloatNumber f=new FloatNumber(val,ndp);
           return f;
       }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getNdp() {
        return ndp;
    }

    public void setNdp(int ndp) {
        this.ndp = ndp;
    }
}

