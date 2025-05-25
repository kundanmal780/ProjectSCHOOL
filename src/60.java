import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input question
        System.out.println("What is your favorite color?");
        String favoriteColor = scanner.nextLine();

        // User input name and age
        System.out.println("Hello, how old are you? ");
        int age = scanner.nextInt();
        System.out.println("And what is your favorite number?");
        double favoriteNumber = scanner.nextDouble();

        // User input project idea
        System.out.println("What do you want to learn about today? Please provide a reason for why this topic interests you.");
        String projectReason = scanner.nextLine();
        
        // Display the results
        System.out.println("\n\nYour favorite color is " + favoriteColor + ".");
        System.out.println("You are " + age + " years old and your favorite number is " + favoriteNumber + ".");
        System.out.println(projectReason);

        scanner.close();  // Close the scanner to free up system resources.
    }
}
