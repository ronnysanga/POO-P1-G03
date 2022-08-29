/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
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

import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import modelo.Atencion;
import modelo.Cita;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Servicios;


/**
 * FXML Controller class
 *
 * @author sixbo
 */

public class AtencionesController implements Initializable {

    private Stage stage;
    private Scene scene;
    @FXML
    private Button btConsultar;
    @FXML
    private TextField txtBuscarCliente;
    @FXML
    private TableView<Atencion> tvAtenciones;
    @FXML
    private TableColumn<Atencion,String> clCita;
    @FXML
    private TableColumn<Atencion,String> clDuracion;
    @FXML
    private TableColumn<Atencion,String> clTerapista;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        clDuracion.setCellValueFactory(new PropertyValueFactory<Atencion,String>("duracion"));
        clTerapista.setCellValueFactory(new PropertyValueFactory<Atencion,String>("empleadoA"));
        clCita.setCellValueFactory(new PropertyValueFactory<Atencion,String>("cita"));
        
        tvAtenciones.setItems(getAtenciones());
        
        
    }    
    
    
    public ObservableList<Atencion> getAtenciones(){
        ObservableList<Atencion> atenciones = FXCollections.observableArrayList();
        
        Empleado emp1 = new Empleado(true,"0911111111","Jorge","09222222222","jorge@correo.com");
        Cliente cl2 = new Cliente("datos de representante cl2","09555555555","Karina","0966666666","karina@correo.com");
        Cita cit3 = new Cita("24/06/2022","13:00",cl2,emp1);
        atenciones.add(new Atencion(120,emp1,cit3));
        return atenciones;
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
