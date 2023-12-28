
package methodSheet;

import java.util.Scanner;


public class p5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("Input the frist number: ");
        char fristChar = input.next().charAt(0);
           System.out.println("Input the second number: ");
        char secondChar = input.next().charAt(0);
        System.out.println(" characters between two characters "+fristChar+ " to "+secondChar);
        
        printChar(fristChar, secondChar);

    }
   public static void printChar(char c1,char c2) {

        for (int i = c1+1; i < c2; i++) {
            System.out.print((char)i+ " ");
        }
       System.out.println("");
    }
}
