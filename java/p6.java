
package methodSheet;

import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the password : ");
        String pass = input.next();

        System.out.println(pass + " is " + isValid(pass));

    }

    public static boolean isValid(String p) {
        int digitcount = 0;

        if (p.length() >= 10) {
             for (int i = 0; i < 10; i++) {
                if (p.charAt(i) >= '0' && p.charAt(i) <= '9') {
                    digitcount++;
                }else if (p.charAt(i)<'a' || p.charAt(i)>'z' && (p.charAt(i) < 'A' || p.charAt(i) > 'Z')){
                    return false;
                }
        } 
        }else {
           return false;
        }
    return digitcount>=2;}
}