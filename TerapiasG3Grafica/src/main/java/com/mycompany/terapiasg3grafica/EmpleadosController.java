/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.terapiasg3grafica;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import modelo.Cliente;
import modelo.Empleado;
import modelo.Servicios;

/**
 *
 * @author dell
 */
public class EmpleadosController implements Initializable{
    private Stage stage;
    private Scene scene;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView<Empleado> tvEmpleados;
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
    @FXML
    private Button btAgregarEmpleado;
    @FXML
    private Button btEditarEmpleado;
    @FXML
    private Button btEliminarEmpleado;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clEstado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("estado"));
        clCedula.setCellValueFactory(new PropertyValueFactory<Empleado,String>("cedula"));
        clNombre.setCellValueFactory(new PropertyValueFactory<Empleado,String>("nombre"));
        clTelefono.setCellValueFactory(new PropertyValueFactory<Empleado,String>("telefono"));
        clEmail.setCellValueFactory(new PropertyValueFactory<Empleado,String>("email"));
        tvEmpleados.setItems(getEmpleados());
    }    
    
    public ObservableList<Empleado> getEmpleados(){
        ObservableList<Empleado> empleados = FXCollections.observableArrayList();
        empleados.add(new Empleado(true,"0911111111","Jorge","09222222222","jorge@correo.com"));
        return empleados;
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
