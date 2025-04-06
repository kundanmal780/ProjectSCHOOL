import java.util.Scanner;

public class SchoolProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input number of projects
        System.out.print("Enter the number of projects: ");
        int numProjects = scanner.nextInt();
        
        // Prompt user to enter project descriptions
        for (int i = 0; i < numProjects; i++) {
            System.out.println("Project " + (i + 1) + ":");
            System.out.print("Description: ");
            String description = scanner.nextLine();
            
            if (description.isEmpty()) {
                System.out.println("Empty description. Project not added.");
                continue;
            }
            
            System.out.println("Completed!");
        }
    }
}
