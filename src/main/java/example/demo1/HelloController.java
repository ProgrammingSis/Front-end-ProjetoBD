package example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloController {
    @FXML
    private Button iniciarSessaoButton;

    public void initialize() {
        iniciarSessaoButton.setOnAction(event -> switchToAnotherScene());
    }

    //Switches the scene as soon as the button "Iniciar Sessão" is clicked
    @FXML
    public void switchToAnotherScene(){
        ScreenManager screenManager = new ScreenManager(new Stage());
        screenManager.switchScreen("/example/demo1/TelaInicio.fxml");
    }
}