Implement the StudentGroup class with a constructor that takes an integer parameter representing the group number.
Provide a method to insert a entities.Student object into the group.
Provide a method to remove a student from the group.
Implement methods to sort the students in the group by last name, first name, and faculty number (FN).

Implement the entities.Student class that extends the entities.Person class.
The entities.Student class should have a constructor that takes the faculty number (FN), first name, last name, and age as parameters.
Implement the Comparable interface to define a natural ordering based on the faculty number (FN).

Implement the entities.Person class with the necessary fields and methods.
The entities.Person class should have a constructor that takes the first name, last name, and age as parameters.
Implement the Comparable interface to define a natural ordering based on age.
Override the toString() method to provide a string representation of the person.

In the main method, create a StudentGroup object with a group number of your choice.
Insert multiple entities.Student objects into the group using the insert() method.
Print the group using the toString() method.
Sort the group by last name, first name, and faculty number using the respective sorting methods.
Print the sorted group after each sorting operation.