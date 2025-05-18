import java.util.*;

public class Collaboration {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("StudentA");
        students.add("StudentB");

        Map<String, Integer> projectScores = new HashMap<>();

        projectScores.put("Project1", 90);
        projectScores.put("Project2", 85);

        Collections.sort(students); // Sort students by their names

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student: " + students.get(i) + ", Score: " + projectScores.getOrDefault(students.get(i), 0));
        }
    }
}
