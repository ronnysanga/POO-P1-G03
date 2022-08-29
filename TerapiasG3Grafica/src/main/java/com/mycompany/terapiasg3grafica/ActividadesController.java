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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Cita;

/**
 * FXML Controller class
 *
 * @author sixbo
 */
public class ActividadesController implements Initializable {

    private Stage stage;
    private Scene scene;
    @FXML
    private Button btAtras;
    @FXML
    private Label lbNombreCliente;
    @FXML
    private TableView tvActividades;
    @FXML
    private TableColumn<Cita,String> clCliente;
    @FXML
    private TableColumn<Cita,String> clTerapista;
    @FXML
    private TableColumn<Cita,String> clDuracion;
    @FXML
    private TableColumn<Cita,String> clFecha;
    @FXML
    private TableColumn<Cita,String> clHora;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void volverCitas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Citas.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }
}
