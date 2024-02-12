package encapsulation;

public class CourseMain {

    public static void main(String[] args) {
        // Create a new course and enroll some students
        Course oop = new Course("OOP", 4);

        System.out.println(oop);

        oop.register("Ruta");
        oop.register("Kaloyan");
        oop.register("Marvin");
        oop.register("Evelyn");
        oop.register("Yeshe");
        
        // System.out.println(oop);

        oop.students.add("Yeshe");
        System.out.println(oop);


    }
    
}
