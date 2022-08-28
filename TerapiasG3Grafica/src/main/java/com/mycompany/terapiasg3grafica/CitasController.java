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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import modelo.Cita;
/**
 *
 * @author dell
 */
public class CitasController implements Initializable{
    
    private Stage stage;
    private Scene scene;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView tvCitas;
    @FXML
    private TableColumn<Cita,String> clCliente;
    @FXML
    private TableColumn<Cita,String> clTerapista;
    @FXML
    private TableColumn<Cita,String> clServicio;
    @FXML
    private TableColumn<Cita,String> clFecha;
    @FXML
    private TableColumn<Cita,String> clHora;
    
    @FXML
    private Label lbCitas;
    
    @FXML
    private Button btAtras;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cargarDatos();
    }
    
    
    public void cargarDatos(){
        lbCitas = new Label();
        lbCitas.setText("Citas");
        anchorPane = new AnchorPane();
        tvCitas = new TableView();
        
        clCliente = new TableColumn<>("Cliente");
        clCliente.setCellValueFactory(new PropertyValueFactory<>("Cliente"));
        clTerapista = new TableColumn<>("Terapista");
        clTerapista.setCellValueFactory(new PropertyValueFactory<>("Empleado"));
        clServicio = new TableColumn<>("Servicio");
        clServicio.setCellValueFactory(new PropertyValueFactory<>("Servicio"));
        clFecha = new TableColumn<>("Fecha");
        clFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));
        clHora = new TableColumn<>("Hora");
        clHora.setCellValueFactory(new PropertyValueFactory<>("Hora"));
        
        tvCitas.getColumns().add(clCliente);
        tvCitas.getColumns().add(clTerapista);
        tvCitas.getColumns().add(clServicio);
        tvCitas.getColumns().add(clFecha);
        tvCitas.getColumns().add(clHora);
        
    }
    
    
    
    
    @FXML
    private void volverMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }


    
}
