import com.google.common.io.Resources;
import org.javacore.javacore.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Load the configuration file
        Config config = new Config(new InputStreamReader(Resources.getResource("config.txt"), "UTF-8"));
        
        // Perform some operations with the configuration data
        
        // Example: Print out the current date and time in ISO format
        System.out.println(config.getDateTimeFormat().format(new Date()));
    }
}
