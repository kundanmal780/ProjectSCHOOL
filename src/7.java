public class SchoolProject {
  public static void main(String[] args) {
    // Create a new student object with name "John Doe" and grade level 10
    Student johnDoe = new Student("John Doe", 10);
    
    // Print the student's name and grade level
    System.out.println(johnDoe.getName() + " is in grade " + johnDoe.getGradeLevel());
    
    // Create a new teacher object with name "Mrs. Smith" and subject "Math"
    Teacher mrsSmith = new Teacher("Mrs. Smith", "Math");
    
    // Print the teacher's name and subject
    System.out.println(mrsSmith.getName() + " teaches " + mrsSmith.getSubject());
  }
}

class Student {
  private String name;
  private int gradeLevel;
  
  public Student(String name, int gradeLevel) {
    this.name = name;
    this.gradeLevel = gradeLevel;
  }
  
  public String getName() {
    return name;
  }
  
  public int getGradeLevel() {
    return gradeLevel;
  }
}

class Teacher {
  private String name;
  private String subject;
  
  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }
  
  public String getName() {
    return name;
  }
  
  public String getSubject() {
    return subject;
  }
}
