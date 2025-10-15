class Person {
void introduce() {
System.out.println("I am a person.");
}
}
class Student extends Person {
void study() {
System.out.println("I am studying.");
}
}
public class SingleInheritancePerson {
public static void main(String[] args) {
Student s = new Student();
s.introduce(); // inherited from Person
s.study(); // own method
}
}