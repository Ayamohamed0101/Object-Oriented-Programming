
package methodSheet;

import java.util.Arrays;


public class JavaApplication2 {

 
    public static void main(String[] args) {
        int[]arr={4, 3, 7, 8, 6, 2, 1};
        arr=zigzag(arr);
        System.out.println(Arrays.toString(arr));

    }
    
       public static int[] zigzag(int [] a) {
       int n=a.length;
        int[]b=new int[n];
        Arrays.sort(a);
           for (int i = 0, j=0, k=n-1 ; i<n && j<n/2 && k>n/2 ;i+=2) {
               b[i]=a[j++];
               b[i+1]=a[k--];
               }
             b[n-1]=a[n/2];
          
        return b;
        
    }
}
