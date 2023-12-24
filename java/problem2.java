
package sheetArrays;

import java.util.Scanner;


public class problem2 {
    public static void main(String[] args) {
            
         System.out.println("Enter size of integer array : ");
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int[] arr = new int[n];
        
        boolean without_0_1=true;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            arr[i] = in.nextInt();
          
            if (arr[i] == 0 || arr[i]==1) {
               without_0_1=false;
            }          
    }
        if(without_0_1)
            System.out.println("Array of integers is without 0 and 1");
        else
            System.out.println(" array of integers contain 0 or 1");
        }
}
