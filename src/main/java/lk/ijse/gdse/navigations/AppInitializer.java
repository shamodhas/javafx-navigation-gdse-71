package lk.ijse.gdse.navigations;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 2:15 PM
 * Project: navigations
 * --------------------------------------------
 **/

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("Navigations");
        stage.show();
    }
}
