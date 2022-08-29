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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import modelo.Cita;
import modelo.Cliente;
import modelo.Empleado;
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
    private TableView<Cita> tvCitas;
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
    
    @FXML
    private Button btRegistrarAtencion;
    @FXML
    private Button btCrearCita;
    @FXML
    private Button btConsultarActividades;
    @FXML
    private TextField txtBuscar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clCliente.setCellValueFactory(new PropertyValueFactory<Cita,String>("cliente"));
        clTerapista.setCellValueFactory(new PropertyValueFactory<Cita,String>("empleadoC"));
        clFecha.setCellValueFactory(new PropertyValueFactory<Cita,String>("fechaC"));
        clHora.setCellValueFactory(new PropertyValueFactory<Cita,String>("hora"));
        
        
        tvCitas.setItems(getCitas());
        
        
    }    
    
    
    public ObservableList<Cita> getCitas(){
        ObservableList<Cita> citas = FXCollections.observableArrayList();
        Cliente cl1 = new Cliente("datos de representante cl1","09333333333","Daniela","0944444444","daniela@correo.com");
        Empleado emp1 = new Empleado(true,"0911111111","Jorge","09222222222","jorge@correo.com");
        citas.add(new Cita("26/06/2022","16:00",cl1,emp1));
        return citas;
    }
    
    
    
    
    @FXML
    private void volverMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }
    
    @FXML
    private void IrARegistrarAtencion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atencion.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }
    
    @FXML
    private void verActividades(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Actividades.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }


    
}
