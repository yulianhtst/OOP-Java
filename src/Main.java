import entities.Student;

public class Main {
    public static void main(String[] args) {
            StudentGroup group3 = new StudentGroup(3);
            group3.insert(new Student("19620001", "Ivan", "Ivanov", 21));
            group3.insert(new Student("19620002", "Stefan", "Dimitrov", 25));
            group3.insert(new Student("19620003", "Petko", "Ivanov", 24));
            group3.insert(new Student("19620004", "Jeko", "Manolov", 34));
            group3.insert(new Student("19620004", "Azar", "Azarov", 33));



            System.out.println(group3);

            group3.sortByLastName();
            System.out.println("Sorted by Last Name:");
            System.out.println(group3);

            group3.sortByFirstName();
            System.out.println("Sorted by First Name:");
            System.out.println(group3);

            group3.sortByFN();
            System.out.println("Sorted by Faculty Number:");
            System.out.println(group3);

            group3.sortedByNameByAgeByFn();
            System.out.println("Sorted by all available criteria");
            System.out.println(group3);
    }
}