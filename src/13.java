public class ProjectSCHOOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ". Welcome to ProjectSCHOOL.");
        int grade = sc.nextInt();
        double gpa = sc.nextDouble();
        boolean isStudent = (grade > 0);
        String message;
        if (isStudent) {
            message = "Congratulations, you are a student! Your GPA is: " + gpa;
        } else {
            message = "Sorry, you are not a student.";
        }
        System.out.println(message);
    }
}
