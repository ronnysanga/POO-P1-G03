/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.terapiasg3grafica;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author sixbo
 */
public class PrimaryController implements Initializable {

    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txtEjercicios;
    @FXML
    private Button btContinuar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btContinuar.setDisable(true);
    }    
    
    
    @FXML
    private void abrirJuego(ActionEvent event) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("juego1.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            App.start = System.currentTimeMillis();
            
            
        
    }
        
    //valida que el usuario no pued avanzar sin ingresar un numero
    @FXML
    public void handleKeyReleased() {
        String texto = txtEjercicios.getText();
        boolean deshabilitar = texto.isEmpty() || texto.trim().isEmpty();
        btContinuar.setDisable(deshabilitar);
        
    }
}
