package entities;


import java.util.Comparator;

public class Student extends Person implements Comparator<Student> {
    private final String fn;

    public Student(String fn, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.fn = fn;
    }

    public String getFN() {
        return fn;
    }



    @Override
    public String toString() {
        return String.format("Student FacultyNumber: %s ",fn) + super.toString();
    }

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFN().compareTo(secondStudent.fn);
    }
}
