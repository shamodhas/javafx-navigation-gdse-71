package lk.ijse.gdse.navigations.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 2:16 PM
 * Project: navigations
 * --------------------------------------------
 **/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PageOneController {

    @FXML
    private AnchorPane ancPageOne;

    @FXML
    void goNextOnAction(ActionEvent event) throws IOException {
        ancPageOne.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/PageTwo.fxml"));
        ancPageOne.getChildren().add(load);
    }

}
