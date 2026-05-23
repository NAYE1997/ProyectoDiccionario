package ec.edu.espoch.diccionarios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            App.class.getResource("/ec/edu/espoch/diccionario/GestorDiccionario.fxml")
        );
        Parent root = loader.load();
        stage.setTitle("Diccionario Inglés-Español - ESPOCH");
        stage.setScene(new Scene(root, 499, 548));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}