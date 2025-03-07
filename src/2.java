// Java program to illustrate the use of a HashMap in a simple game
import java.util.*;

public class Game {
    public static void main(String[] args) {
        // Create a new HashMap object
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements to the map
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");

        // Print the contents of the map
        System.out.println(map);
    }
}
