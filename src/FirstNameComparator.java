import entities.Student;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        String lastName1 = student1.getLastName().toUpperCase();
        String firstName1 = student1.getFirstName().toUpperCase();

        String lastName2 = student2.getLastName().toUpperCase();
        String firstName2 = student2.getFirstName().toUpperCase();

        if (firstName1.equals(firstName2)) {
            return lastName1.compareTo(lastName2);
        } else {
            return firstName1.compareTo(firstName2);
        }
    }
}
