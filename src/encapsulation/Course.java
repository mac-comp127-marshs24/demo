package encapsulation;

import java.util.*;

public class Course {

    // Class variables: title, enrollment limit, current enrollment, student list
    public String title;
    public int limit;
    public int currentEnrollment;
    public List<String> students;

    // Constructor method to make empty course
    public Course(String title, int limit) {
        this.title = title;
        this.limit = limit;
        this.currentEnrollment = 0;
        this.students = new ArrayList<String>();
    }

    // Enroll students method
    public boolean register(String name) {
        if((currentEnrollment + 1) > limit) {
            return false;
        } else {
            currentEnrollment++;
            students.add(name);
            return true;
        }
    }

    // toString method
    public String toString() {
        return title + "(" + currentEnrollment + "): " + students.toString();
    }
    
}
