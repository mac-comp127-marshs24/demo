package classes;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        Student abby = new Student("Abigail Marsh");

        System.out.println(abby);

        abby.setMajor("Computer Science");
        System.out.println(abby);

        abby.setName("Abby Marsh");
        System.out.println("The student's name is: " + abby.getName());


        List<Student> classList = new ArrayList<Student>();

        classList.add(abby);
        classList.add(new Student("Sarah Thomson"));

        for (Student student : classList) {
            System.out.println(student);
        }

    }
    
}
