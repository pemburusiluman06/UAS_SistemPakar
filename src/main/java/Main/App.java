package Main;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;


public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var parent = FXMLLoader.load(getClass().getResource("/UI/Home.fxml"));
        Scene scene;
        scene = new Scene((Parent) parent);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}