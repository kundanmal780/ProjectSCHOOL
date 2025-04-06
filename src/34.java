public class MyProject {
    private String name;
    private int grade;

    public MyProject(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addTask(Task task) {
        System.out.println("Adding task to " + name);
        // Add code for adding the task
    }

    public String getDescription() {
        return "My project: " + name + " (Grade: " + grade + ")";
    }
}
