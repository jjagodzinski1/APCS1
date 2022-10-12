package RandomStudents;

import java.util.*;
public class Course {
    ArrayList<String> students;

    /**
     * 
     * @param students a list of students that represent a classes roster
     * 
     * 
     * 
     */
    public Course(ArrayList<String> students){
        this.students = students;

    }

    /**
     * 
     * @return the roster of students inside a course.
     */
    public ArrayList<String> getStudents(){
        return this.students;

    }
    
}