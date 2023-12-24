
package methodSheet;

import java.util.Scanner;

public class p7 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = input.nextInt();
        System.out.println("Input the second number: ");
        int y = input.nextInt();
        System.out.println("Input the third number: ");
        int z = input.nextInt();
        System.out.println("Check whether the three said numbers has a midpoint!\n"
                + middPoint(x, y, z));

    }

    public static boolean midPoint(int a, int b, int c) {
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b, c));
        int midNum = a + b + c - (maxNum + minNum);

        return (midNum==(maxNum+minNum)/2.0);

    }
    //another method
     public static boolean middPoint(int a, int b, int c) {
       double mid=(a+b+c)/3.0;

        return (a==mid || b==mid || c==mid );

    }
}
