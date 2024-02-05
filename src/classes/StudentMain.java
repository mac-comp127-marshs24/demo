package classes;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Student abby = new Student("Abigail Marsh");

        System.out.println(abby);

        abby.setMajor("Computer Science");
        System.out.println(abby);

        abby.setName("Abby Marsh");
        System.out.println("Student's name is: " + abby.getName());

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(abby);
        studentList.add(new Student("Linda Lor"));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    
}
