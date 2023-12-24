
package problem4;

public class Person {
  protected String name;
  protected int id;
public Person(){
    
}
 public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
  
    public void displayPerson() {
        System.out.println( "name : " + name + ", id : " + id );
    }
   }
