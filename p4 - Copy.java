
package sheetArrays;

import java.util.Arrays;

public class p4 {
       public static void main(String[] args) {
   
       
        int[] arr ={2,5,4,3,6};
        int n =arr.length;        
       int fristElement=arr[0];//2
  
        for (int i =1; i<n; i++) {//5 5 4 3 6
                                  //5 4 4 3 6
                                  // 5 4 3 3 6
                                  //5 4 3 6 6 
           
            arr[i-1] =arr[i] ;
        
    }
       arr[n-1]= fristElement;// 5 4 3 6 2
        System.out.println(Arrays.toString(arr)); 
        
     }
      
}
