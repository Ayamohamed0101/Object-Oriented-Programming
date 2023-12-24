package methodSheet;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = input.nextInt();
        System.out.println("Input the second number: ");
        int y = input.nextInt();
        System.out.println("Input the third number: ");
        int z = input.nextInt();
        System.out.println("Check whether the three said numbers are consecutive or not!\n"
                + cons(x, y, z));

    }

    public static boolean cons(int a, int b, int c) {
        int maxNum = Math.max(a, Math.max(b, c));
        int minNum = Math.min(a, Math.min(b, c));
        int midNum = a + b + c - (maxNum + minNum);

        return (maxNum == midNum + 1 && midNum == minNum + 1);

    }
}
