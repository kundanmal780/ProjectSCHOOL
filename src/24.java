import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name + "!");
        System.out.println("Do you want to continue?");
        boolean keepGoing = true;
        
        while (keepGoing) {
            if (name.equals("Teacher")) {
                System.out.println("Welcome, Teacher!");
                keepGoing = false; // Stop prompting the user
            } else {
                System.out.println("Hello, " + name + ", what can I help you with?");
                String userInput = scanner.nextLine();
                if ("exit".equalsIgnoreCase(userInput)) {
                    keepGoing = false;
                }
            }
        }

        scanner.close();
    }
}
