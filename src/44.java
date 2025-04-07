import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the project name:");
        String projectName = scanner.nextLine();
        System.out.println("Enter the project description:");
        String projectDescription = scanner.nextLine();
        
        if (projectName.equals("NewProject1") && projectDescription.contains("important")) {
            System.out.println("The project is added successfully!");
        } else {
            System.out.println("An error occurred while adding the project.");
        }
    }
}
