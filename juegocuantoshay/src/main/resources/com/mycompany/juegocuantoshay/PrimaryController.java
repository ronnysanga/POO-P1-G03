/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.juegocuantoshay;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author sixbo
 */
public class PrimaryController implements Initializable {


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
    private void onButtonClicked(ActionEvent event) {
        System.out.println("Hola, " + txtEjercicios.getText());
        
    }
    
    @FXML
    public void handleKeyReleased() {
        String texto = txtEjercicios.getText();
        boolean deshabilitar = texto.isEmpty() || texto.trim().isEmpty();
        btContinuar.setDisable(deshabilitar);
        
    }
}
