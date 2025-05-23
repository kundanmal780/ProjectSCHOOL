import java.util.*;

public class ProjectSCHOOL {
    public static void main(String[] args) {
        // Example of adding multiple students in a list with their respective information
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", "李四", 18, "男"));
        students.add(new Student("王五", "赵六", 19, "女"));
        
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static class Student {
        private String name;
        private String address;
        private int age;
        private String gender;

        public Student(String name, String address, int age, String gender) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.gender = gender;
        }

        // Example method to add a student
        public void addStudent() {
            System.out.println("Adding student: " + this);
        }
    }
}
