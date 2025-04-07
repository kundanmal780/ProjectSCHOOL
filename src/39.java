import java.util.Scanner;

public class StudentProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter project name:");
        String projectName = scanner.nextLine();
        
        System.out.println("Enter project description:");
        String projectDescription = scanner.nextLine();
        
        System.out.println("Enter project due date (format: yyyy-MM-dd):");
        Date dueDate = scanner.nextDate();
        
        System.out.println("Enter project start date (format: yyyy-MM-dd):");
        Date startDate = scanner.nextDate();
        
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        
        System.out.println("Enter teacher name:");
        String teacherName = scanner.nextLine();
    }
}
