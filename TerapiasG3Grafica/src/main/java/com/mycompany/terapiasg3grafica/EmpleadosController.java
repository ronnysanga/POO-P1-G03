/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.terapiasg3grafica;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

import modelo.Empleado;

/**
 *
 * @author dell
 */
public class EmpleadosController {
    private Stage stage;
    private Scene scene;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView tvEmpleados;
    @FXML
    private TableColumn<Empleado,String> clEstado;
    @FXML
    private TableColumn<Empleado,String> clNombre;
    @FXML
    private TableColumn<Empleado,String> clCedula;
    @FXML
    private TableColumn<Empleado,String> clDatoRepres;
    @FXML
    private TableColumn<Empleado,String> clTelefono;
     @FXML
    private TableColumn<Empleado,String> clEmail;
    @FXML
    private Label lbEmpleados;
    
    @FXML
    private Button btAtras;
    
    
    public void cargarDatos(){
        lbEmpleados = new Label();
        lbEmpleados.setText("Empleados");
        anchorPane = new AnchorPane();
        tvEmpleados = new TableView();
        clEstado = new TableColumn<>("Estado");
        clEstado.setCellValueFactory(new PropertyValueFactory<>("Estado"));
        clCedula = new TableColumn<>("Cedula");
        clCedula.setCellValueFactory(new PropertyValueFactory<>("Cedula"));
        clNombre = new TableColumn<>("Nombre");
        clNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        clTelefono = new TableColumn<>("Telefono");
        clTelefono.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
        clEmail = new TableColumn<>("Email");
        clEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        
        tvEmpleados.getColumns().add(clEstado);
        tvEmpleados.getColumns().add(clCedula);
        tvEmpleados.getColumns().add(clNombre);
        tvEmpleados.getColumns().add(clTelefono);
        tvEmpleados.getColumns().add(clEmail);
        
        tvEmpleados.getItems().add(new Empleado(true, "099999999", "Daniela", "0988888888", "daniela@correo.com"));
        anchorPane.getChildren().add(lbEmpleados);
        anchorPane.getChildren().add(tvEmpleados);
        
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
