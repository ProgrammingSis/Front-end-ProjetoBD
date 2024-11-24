package example.demo1;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        ScreenManager screenManager = new ScreenManager(stage);
        screenManager.switchScreen("/example/demo1/telaInicio.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }
}