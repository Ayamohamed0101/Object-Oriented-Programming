package methodSheet;

import java.util.Arrays;

public class p10 {

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1 };//2 3 4 6 7 8
        arr = zigzag(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] zigzag(int[] a) {
        int n = a.length;
        Arrays.sort(a);//1 2 3 4 5 6 7 // 2 1 4 3 6 5 7 //1 2 3 4 5 6 //2 1 4 3 6 
        for (int i = 0; i < n -1 ;i+=2    ){
            int temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            
        }   
                
        return a;

    }
}
