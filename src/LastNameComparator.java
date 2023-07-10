import entities.Student;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        String lastName1 = student1.getLastName().toUpperCase();
        String firstName1 = student1.getFirstName().toUpperCase();

        String lastName2 = student2.getLastName().toUpperCase();
        String firstName2 = student2.getFirstName().toUpperCase();

        if (lastName1.equals(lastName2)) {
            return firstName1.compareTo(firstName2);
        } else {
            return lastName1.compareTo(lastName2);
        }
    }
}
