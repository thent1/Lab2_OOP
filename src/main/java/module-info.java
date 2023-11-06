module com.example.lab2_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2_oop to javafx.fxml;
    exports com.example.lab2_oop;
}