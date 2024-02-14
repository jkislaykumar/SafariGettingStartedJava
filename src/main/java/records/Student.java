package records;

// constructor, toString, equals(and hashCode) are automatic...
// fields are private but readable
// records are intended to be immutable
public record Student(String name, double percentGrade) {
}

class UseStudent {
  public static void main(String[] args) {
    Student s1 = new Student("Fred", 76);
    Student s2 = new Student("Fred", 76);

    System.out.println(s1);
    System.out.println(s1.equals(s2));
    System.out.println("name is " + s1.name());
  }
}