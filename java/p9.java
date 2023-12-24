
package methodSheet;
import java.util.Arrays;

public class p9 {
    public static void main(String[] args) {
        int []arr={10,15,16};
        int[]b=fac(arr);
        System.out.println(Arrays.toString(b));
    }
 public static int[] fac(int []a){
     int[]b=new int[sumOfElement(a)];
     int n=0;
     for (int i = 0; i < a.length; i++) {
         for (int j = 1; j <= a[i]; j++) {
             if(a[i]%j==0){
                 b[n]=j;
                 n++;
             }
         }
         
     }
             return Arrays.copyOfRange(b,0,n);
 }
 
  public static int sumOfElement(int []a){
      int sum=a[0];
      for (int i = 1; i < a.length; i++) {
          sum+=a[i];
      }
 return sum; }
}
