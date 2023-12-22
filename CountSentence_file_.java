
package countsentence_file_;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountSentence_file_ {

   public static void main(String[] args) throws IOException{
        File f= new File("Data.txt");
       
        if(!f.exists()){
            System.out.println("The file not exist");
            System.exit(0);
        } Scanner in=new Scanner(f);
        char c='.';
        int count=0;
        while(in.hasNext()){
            String s=in.nextLine();
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)==c)
                    count++;
            }
        }
        System.out.println("The number of sentences = "+count);
    }
    
    
}
