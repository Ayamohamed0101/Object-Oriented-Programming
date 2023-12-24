
package methodSheet;

import java.util.Arrays;
import java.util.Scanner;


public class p8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int []arr={1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr)+" the reverse of the array is the same as the original array : "+isReverse(arr));
    }
public static boolean isReverse(int []a){
    int n=a.length;
    for (int i = 0,j=n-1; i <n/2 && j>n/2 ; i++,j--) {
        if(a[i]!=a[j])
        return false;
        }
   
return true;}
        
        }
