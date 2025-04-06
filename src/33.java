import com.github.javafxml.FXML;
import javafx.application.Application;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        FXML.main(this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
