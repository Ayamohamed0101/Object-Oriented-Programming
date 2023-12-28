
package methodSheet;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Input the String: ");
        String str = input.nextLine();
        System.out.println("Number of all words in string : "+numOfWords(str));
    }
    public static int numOfWord(String s) {
        int c=0;
        for (int i = 1; i < s.length()-1; i++) {
           if(s.charAt(i)==' ')c++;
        }
        return c+1;
    }
    //another method
     public static int numOfWords(String s) {
        String [] arrWord=s.split("\\s+");//split multi space and tab
        return arrWord.length;
    }
}
