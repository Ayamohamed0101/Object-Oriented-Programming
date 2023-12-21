package oop_lec4;

public class Course {

    private String CourseName;
    private Instructor CourseID;// object refer to object of type Instructor still refer only not inilize yet
// first constructor

    public Course(String cname, String IDn, String IDp, String IDid) {
        CourseID = new Instructor(IDn, IDp, IDid);// intilize of object which refer to Instructor
        CourseName = cname;

    }
// second Constructor

    public Course(String cname, Instructor CID) {
        CourseID = CID; // object must be created in MAIN

        CourseName = cname;

    }

    public Instructor getid() {
        return CourseID;
    }

    public String getname() {
        return CourseName;
    }

}
