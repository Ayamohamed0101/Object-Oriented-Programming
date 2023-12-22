
package date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Date t=new Date(31,12,2000);
        System.out.println(t.getDay());
        t.addDay();
        System.out.println(t.getDay());
        System.out.println(t.toString());
        t.subDay();
        System.out.println(t.toString());
        System.out.println(t.isMagic());
          Date t2=new Date(22,2,2222);
          System.out.println(t2.isMagic());
    }
    
}
