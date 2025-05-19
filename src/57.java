import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        
        System.out.println("Hello, " + studentName + "!");
        
        System.out.print("Enter the topic you are working on: ");
        String topic = scanner.nextLine();
        
        if (topic.equalsIgnoreCase("Maths")) {
            System.out.println("You chose to work on Maths.");
            int difficultyLevel = 5;
            while (difficultyLevel > 0) {
                System.out.println("Difficulty level for Maths: " + difficultyLevel);
                System.out.print("Enter your score:");
                double score = scanner.nextDouble();
                
                if (score >= 100) {
                    System.out.println("Congratulations, you have passed the test!");
                } else {
                    System.out.println("You did not pass the test.");
                    difficultyLevel--;
                }
            }
        } else {
            System.out.println("Good job! I understand you are working on a different subject.");
        }

        scanner.close();
    }
}
