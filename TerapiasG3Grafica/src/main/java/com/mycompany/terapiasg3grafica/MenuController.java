/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javafx.stage.Stage;

            

/**
 * FXML Controller class
 *
 * @author dell
 */
public class MenuController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btServicios;
    @FXML
    private Button btClientes;
    @FXML
    private Button btAtenciones;
    @FXML
    private Button btCitas;
    @FXML
    private Button btEmpleados;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Botones habilitados
        /*
        btServicios.setDisable(false);
        btClientes.setDisable(false);
        btAtenciones.setDisable(false);
        btCitas.setDisable(false);
        btEmpleados.setDisable(false);*/
        
        
        
    }    
    
    
    @FXML
    private void abrirServicios(ActionEvent event) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("Servicios.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            App.start = System.currentTimeMillis();        
    }
      
    @FXML
    private void abrirClientes(ActionEvent event) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("Clientes.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            App.start = System.currentTimeMillis();
    }
    
    @FXML
    private void abrirEmpleados(ActionEvent event) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("Empleados.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            App.start = System.currentTimeMillis();
    }
    
}
