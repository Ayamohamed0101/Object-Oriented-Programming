package oop_lec4;

public class Instructor {

    private String id;
    private String position;
    private String name;
// Constructor

    public  Instructor(String n, String p, String i) {
        id = i;
        position = p;
        name = n;
    }

    public void setId(String i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPosition(String p) {
        position = p;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}
