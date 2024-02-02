package classes;

public class Student {

    private String major;
    private String name;

    public Student(String name) {
        this.name = name;
        this.major = "Undeclared";
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "The student named " + this.name + " has a major of " + this.major;
    }
    
}
