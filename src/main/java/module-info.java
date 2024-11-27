module com.example.pencilshapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pencilshapes to javafx.fxml;
    exports com.example.pencilshapes;
}