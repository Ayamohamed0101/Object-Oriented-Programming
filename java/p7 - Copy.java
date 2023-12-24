
package sheetArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p7 {
         public static void main(String[] args) {
        
       System.out.println("Enter size of integer array : ");
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int length=1,maxLength=length;
        int start=0,end=0;
        int maxStart=0,maxend=0;
        
         for (int i = 1; i < n; i++) {
             if(arr[i]==arr[i-1]+1 ){
                 length++;
                 end++;
             }
             else{
                if(length>maxLength){
                    maxLength=length;
                    maxStart=start;maxend=i;
                }
                length=1;
                start=i;
             }
             
         }
         if(length>maxLength){maxLength=length;
         maxStart=start;maxend=n;}
        
        System.out.println("The length of longest consecutive elements sequence : "+maxLength); 
             for (int i = maxStart; i < maxend; i++) {
                 System.out.print(arr[i]+" ");
             }
     } //[49, 1, 3, 200, 2, 4, 70, 5]
}
