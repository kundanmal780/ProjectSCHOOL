import java.util.Scanner;

public class ProjectSCHOOL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, world!");
        
        // Ask user for input and perform necessary actions
        String input;
        do {
            System.out.print("\nPlease enter your name: ");
            input = scanner.nextLine();
            
            if (input.isEmpty()) {
                System.out.println("\nInvalid input. Please enter a non-empty string.");
            } else {
                System.out.println("Hello, " + input);
            }
        } while (!input.isEmpty());
    }
}
