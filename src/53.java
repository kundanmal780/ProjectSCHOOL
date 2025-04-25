import java.util.Scanner;

public class SchoolProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter project name:");
        String projectName = scanner.nextLine();

        System.out.println("Enter project description:");
        String projectDescription = scanner.nextLine();

        System.out.println("Enter project deadline (in days):");
        int projectDeadline = scanner.nextInt();

        System.out.println("Enter project team members:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Team member " + (i + 1) + ": ");
            String teamMemberName = scanner.nextLine();
        }

        System.out.println("Project details:\nProject Name: " + projectName);
        System.out.println("Project Description: " + projectDescription);
        System.out.println("Deadline: " + projectDeadline + " days from now.");
    }
}
