
package recursive;
import java.util.Scanner;
public class Recursive {
       public static int numberOfOccurance(String s1, String s2){
           if(s2.length()>=s1.length()|| s1.length()==0)
               return 0;
          if(s1.substring(0,s2.length()).equals(s2))
              return numberOfOccurance(s1.substring(1),s2)+1;
       return numberOfOccurance(s1.substring(1),s2);
       }
    public static void main(String[] args) {
       String s1="lolooooooo";
       String s2="oo";
        System.out.println(numberOfOccurance(s1,s2));
    }
    
}
