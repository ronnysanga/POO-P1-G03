module com.mycompany.terapiasg3grafica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.terapiasg3grafica to javafx.fxml;
    opens modelo to javafx.base;
    exports com.mycompany.terapiasg3grafica;
}