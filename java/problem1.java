
package sheetArrays;

import java.util.Scanner;


public class problem1 {
    public static void main(String[] args) {
       
         System.out.println("Enter size of integer array : ");
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter value : ");
        arr[0] = in.nextInt();
        int smallest = arr[0], largest = arr[0],sum=arr[0];
        
        for (int i = 1; i < n; i++) {
            System.out.println("Enter value : ");
            arr[i] = in.nextInt();
            sum+=arr[i];
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        double average=(sum-smallest-largest)/(n-2.0);
        System.out.println("Average of an array of integers except thelargest and smallest values  : "+average);

    } 
}
