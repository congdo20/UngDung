module com.example.pushtotalkapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pushtotalkapp to javafx.fxml;
    exports com.example.pushtotalkapp;
}