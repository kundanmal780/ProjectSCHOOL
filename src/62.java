import java.util.*;

public class ProjectSCHOOL {

    public static void main(String[] args) {
        // Student list
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Student ID 1"));
        students.add(new Student("Bob", "Student ID 2"));
        students.add(new Student("Charlie", "Student ID 3"));

        // Teacher list
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("John", "Teacher ID 1"));
        teachers.add(new Teacher("Mary", "Teacher ID 2"));

        // Project list
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Project A", students, teachers));
        projects.add(new Project("Project B", students, teachers));
        projects.add(new Project("Project C", students, teachers));

        System.out.println("Student list:");
        for (Student s : students) {
            System.out.println(s.getName() + " - Student ID: " + s.getStudentID());
        }

        System.out.println("\nTeacher list:");
        for (Teacher t : teachers) {
            System.out.println(t.getName() + " - Teacher ID: " + t.getTeacherID());
        }

        System.out.println("\nProjects:");
        for (Project p : projects) {
            System.out.println(p.getTitle() + ":");
            for (Student s : p.getStudents()) {
                System.out.print(s.getName() + " - Student ID: " + s.getStudentID() + "\n");
            }
            System.out.println("Teacher: " + p.getTeachers()[0].getName());
        }
    }

    static class Teacher {
        private String name;
        private int teacherId;

        public Teacher(String name, int teacherId) {
            this.name = name;
            this.teacherId = teacherId;
        }

        @Override
        public String toString() {
            return "Teacher [name=" + name + ", teacherId=" + teacherId + "]";
        }
    }

    static class Student {
        private String name;
        private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", studentID=" + studentID + "]";
        }
    }

    static class Project {
        private String title;
        private List<Student> students;
        private List<Teacher> teachers;

        public Project(String title, List<Student> students, List<Teacher> teachers) {
            this.title = title;
            this.students = students;
            this.teachers = teachers;
        }

        @Override
        public String toString() {
            return "Project [title=" + title + ", students=" + students.toString() + ", teachers=" + teachers.toString() + "]";
        }
    }
}
