
package person;

public class Main {

    public static void main(String[] args) {
       Student s=new Student("Youssef Eslam ","Mansoura", "Embeded concept ICs",2024,5000);
        System.out.println(s.toString());
        Staff f=new Staff("Aliaa Eslam", "Mansoura","Faculty of Engineering", 200000);
        System.out.println(f.toString());
    }
    
}
