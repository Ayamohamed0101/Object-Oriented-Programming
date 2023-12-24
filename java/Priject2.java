/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priject2;

/**
 *
 * @author h
 */
public class Priject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex c1=new Complex(3,-3);
            Complex c2=new Complex(4,5);
            Complex c3=c1.Divid(c2);
            System.out.println(c3.getreal()+" "+c3.getim()+"i");
        System.out.println(c1.Arg()*180/Math.PI);
        
        // TODO code application logic here
    }
}
