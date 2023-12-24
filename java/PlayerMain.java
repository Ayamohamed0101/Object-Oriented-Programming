
package oopsheet;

import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Player []arr=new Player[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=new Player(in.nextInt());
        }
        System.out.println(Player.getNo_of_winners());
    }
 
}
