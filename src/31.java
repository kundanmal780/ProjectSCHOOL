import java.util.Scanner;

public class ProjectSCHOOL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ProjectSCHOOL!");
        
        int choice;
        do {
            System.out.println("\n1. Create a project");
            System.out.println("2. Add files and folders");
            System.out.println("3. Remove projects");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createProject(scanner);
                    break;
                case 2:
                    addFilesAndFolders(scanner);
                    break;
                case 3:
                    removeProjects(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void createProject(Scanner scanner) {
        // Implement project creation logic here
        System.out.println("Creating a new project...");
    }

    private static void addFilesAndFolders(Scanner scanner) {
        // Implement file and folder addition logic here
        System.out.println("Adding files and folders to the project...");
    }

    private static void removeProjects(Scanner scanner) {
        // Implement project removal logic here
        System.out.println("Removing projects from the list...");
    }
}
