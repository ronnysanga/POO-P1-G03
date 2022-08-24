
package com.mycompany.juegocuantoshay;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import modelo.Animal;


public class Juego2Controller implements Initializable {

    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txtCantidad;
    @FXML
    private Button btSiguiente;
    @FXML
    private Button btAnterior;
    @FXML
    private ImageView imgAnimal;
    @FXML
    private FlowPane flowPane;
    @FXML
    private ImageView imgAcierto;
    @FXML
    private Button btAceptar;
    @FXML
    private VBox vbox;
    int cantidad = 9;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generarAnimales();
        btAceptar.setDisable(true);
    }    
    
    
    public void generarAnimales(){
        
        for(int i=0;i<cantidad;i++){
            Image image = new Image("files/duck.png",true);
            ImageView imgAnimal = new ImageView(image);
            imgAnimal.setFitHeight(100);
            imgAnimal.setFitWidth(100);
            flowPane.getChildren().addAll(imgAnimal);
        }
        
    }
    
    public void pasarSiguienteReto(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("juego3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void pasarRetoAnterior(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("juego1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //TERMINAR ESTO
    public void ganarPerder(ActionEvent event) throws IOException {
        String numIngresado = txtCantidad.getText();
        if(Integer.valueOf(numIngresado) == cantidad){
            //si acierta
//            App.mostrarAlerta(Alert.AlertType.CONFIRMATION, "Acertado");
            Image image = new Image("files/happy-face.png",true);
            imgAcierto = new ImageView(image);
            imgAcierto.setFitHeight(100);
            imgAcierto.setFitWidth(100);
            vbox.getChildren().add(imgAcierto);
            
            
            
        }else{
            // no acierta
            Image image = new Image("files/sad-face.png",true);
            imgAcierto = new ImageView(image);
            imgAcierto.setFitHeight(100);
            imgAcierto.setFitWidth(100);
            vbox.getChildren().add(imgAcierto);
        }
        
   
    }
    
    
    
    
    
    @FXML
    public void handleKeyReleased() {
        String texto = txtCantidad.getText();
        boolean deshabilitar = texto.isEmpty() || texto.trim().isEmpty();
        btAceptar.setDisable(deshabilitar);
        
    }
    
    
}
