package chatbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/chatbox/mainScreen.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Chatbox");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}