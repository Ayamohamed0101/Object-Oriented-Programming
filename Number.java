
package number;

public class Number {
    private int num;
    static int evenCount=0;

    public Number(int num) {
        this.num = num;
        if(num%2==0||num==0)
            evenCount++;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if(num%2==0 && this.num%2!=0){
          evenCount++;
        }
        if(num%2!=0 && this.num%2==0)
            evenCount--;
        this.num=num;
    }
    @Override
    public String toString(){
        return "Number= "+num+" and the number of even= "+evenCount;
    }
    public boolean isEqual(Number n){
        String t1=toString();
        String t2=n.toString();
        if(t1.equals(t2))
            return true;
        return false;
    }

   
    
    
}
