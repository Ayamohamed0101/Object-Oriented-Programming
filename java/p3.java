
package methodSheet;

import java.util.Scanner;


public class p3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int x = input.nextInt();

        System.out.println("the sum of the digits is : "
                + sumOfDigit(x));

    }

    public static int sumOfDigit(int n) {
        int sum=0;
    while(n!=0){
        sum+=n%10;
        n/=10;
    }

        return sum;

    }

}
