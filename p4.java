
package methodSheet;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int x = input.nextInt();

        System.out.println("the first digit from a positive or negative integer "
                + firstDigit(x));

    }

    public static int firstDigit(int n) {
        n=Math.abs(n);
    while(n>=10){
          n/=10;
      }

        return n;

    }
}
