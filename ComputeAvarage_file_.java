
package computeavarage_file_;
import java.io.*;
import java.util.Scanner;
public class ComputeAvarage_file_ {
   public static void main(String[] args) throws IOException{
        File f= new File("Data.txt");
   
        if(!f.exists()){
            System.out.println("The file not exist");
            System.exit(0);
        }     Scanner in=new Scanner(f);
        double sum=0,num=0;
        int count=0;
        while(in.hasNextInt()){
            num=in.nextInt();
            sum+=num;
            count++;
        }
        System.out.println("The average number = "+(sum/count));
    }
    
}
