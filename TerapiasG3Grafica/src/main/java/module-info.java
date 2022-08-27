module com.mycompany.terapiasg3grafica {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.terapiasg3grafica to javafx.fxml;
    exports com.mycompany.terapiasg3grafica;
}
