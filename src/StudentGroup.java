import entities.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentGroup {
    private final int group;
    private final List<Student> students;

    public StudentGroup(int group) {
        this.group = group;
        this.students = new ArrayList<>();
    }

    public void insert(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        students.add(student);
    }

    public boolean remove(Student student) {
        return students.remove(student);
    }

    public void sortByLastName() {
        students.sort(new LastNameComparator());
    }

    public void sortByFirstName() {
        students.sort(new FirstNameComparator());
    }

    public void sortByFN() {
        students.sort(Comparator.comparing(Student::getFN));
    }

    public void sortedByNameByAgeByFn() {
        students.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName).thenComparing(Student::getAge)
                .thenComparing(Student::getFN));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Group %d ", group)).append(System.lineSeparator());
        for (Student student : students) {
            sb.append(student);
        }

        return sb.toString();
    }

}
