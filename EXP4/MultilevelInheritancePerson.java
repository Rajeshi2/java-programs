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
class CollegeStudent extends Student {
void attendLecture() {
System.out.println("I am attending a college lectures. in SRGEC");
}
}
public class MultilevelInheritancePerson {
public static void main(String[] args) {
CollegeStudent cs = new CollegeStudent();
cs.introduce(); // from Person
cs.study(); // from Student
cs.attendLecture(); // from CollegeStudent
}
}