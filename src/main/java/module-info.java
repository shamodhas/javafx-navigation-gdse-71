module lk.ijse.gdse.navigations {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.gdse.navigations.controller to javafx.fxml;
    exports lk.ijse.gdse.navigations;
}