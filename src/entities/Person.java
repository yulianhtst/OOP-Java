package entities;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.getAge());
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s ", firstName, lastName) + String.format("Age: %d", age) + System.lineSeparator();
    }
}