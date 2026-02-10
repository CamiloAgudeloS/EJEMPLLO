module com.example.ejempllo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.ejempllo to javafx.fxml;
    exports com.example.ejempllo;
}