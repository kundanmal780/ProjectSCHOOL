public class Main {
    public static void main(String[] args) {
        // Example of student's name
        String studentName = "张三";
        // Example of teacher's name
        String teacherName = "李四";
        // Example of project title
        String projectTitle = "学校建设项目";
        // Example of teacher email address
        String teacherEmail = "teacher@example.com";

        // Print some messages to the console
        System.out.println("Hello, " + studentName);
        System.out.println("The school project title is: " + projectTitle);

        // Send an email to the teacher
        sendEmail(teacherEmail, "张三's school project report", teacherName);

        // Optionally, you can log or display the teacher's name here as well
        System.out.println("Teacher's name: " + teacherName);
    }

    private static void sendEmail(String receiver, String subject, String name) {
        // This is a placeholder for actual email sending logic.
        // You may need to use an SMTP server like Gmail or OpenSMTP.
        try {
            javaMailSender.send(new MimeMessage());
        } catch (MessagingException | TransportException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
