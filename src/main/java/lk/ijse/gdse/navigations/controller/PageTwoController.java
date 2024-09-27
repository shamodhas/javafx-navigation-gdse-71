package lk.ijse.gdse.navigations.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 2:20 PM
 * Project: navigations
 * --------------------------------------------
 **/


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PageTwoController {

    @FXML
    private AnchorPane ancPageTwo;

    @FXML
    void goPrevPageOnAction(ActionEvent event) throws IOException {
        ancPageTwo.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
        ancPageTwo.getChildren().add(load);
    }
}
