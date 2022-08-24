module com.mycompany.juegocuantoshay {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
   
    opens com.mycompany.juegocuantoshay to javafx.fxml;
    exports com.mycompany.juegocuantoshay;
}