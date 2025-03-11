public class SchoolProject {
    public static void main(String[] args) {
        System.out.println("Welcome to ProjectSCHOOL!");

        // Create a new student object
        Student s = new Student("John Doe", "john.doe@example.com");

        // Add the student to the database
        Database db = new Database();
        db.addStudent(s);

        // Print the student's information
        System.out.println("Student: " + s.getName() + ", " + s.getEmail());
    }
}

class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Database {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }
}
