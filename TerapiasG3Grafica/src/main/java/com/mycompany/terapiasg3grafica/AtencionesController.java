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
<<<<<<< HEAD
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

=======
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import modelo.Atencion;

>>>>>>> 9db6be68a3cb90ec1930509a7edbb3a373009272
/**
 * FXML Controller class
 *
 * @author sixbo
 */
<<<<<<< HEAD
public class AtencionesController implements Initializable {

    private Stage stage;
    private Scene scene;
    @FXML
    private Button btConsultar;
    @FXML
    private TextField txtBuscarCliente;
    @FXML
    private TableView tvAtenciones;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
=======
public class AtencionesController implements Initializable{
    
    private Stage stage;
    private Scene scene;
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView tvAtenciones;
    @FXML
    private TableColumn<Atencion,String> clDuracion;
    @FXML
    private TableColumn<Atencion,String> clTerapista;
    @FXML
    private TableColumn<Atencion,String> clCliente;
    
    
    @FXML
    private Label lbAtenciones;
    
    @FXML
    private Button btAtras;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cargarDatos();
    }
    
    public void cargarDatos(){
        lbAtenciones = new Label();
        lbAtenciones.setText("Atenciones");
        anchorPane = new AnchorPane();
        tvAtenciones = new TableView();
        
        
        clDuracion = new TableColumn<>("Servicio");
        clDuracion.setCellValueFactory(new PropertyValueFactory<>("Duracion"));
        clTerapista = new TableColumn<>("Terapista");
        clTerapista.setCellValueFactory(new PropertyValueFactory<>("Empleado"));
        clCliente = new TableColumn<>("Cliente");
        clCliente.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
       
        tvAtenciones.getColumns().add(clDuracion);        
        tvAtenciones.getColumns().add(clCliente);
        tvAtenciones.getColumns().add(clTerapista);

        
    }
    
    @FXML
    private void volverMenu(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        
    }
>>>>>>> 9db6be68a3cb90ec1930509a7edbb3a373009272
    
    @FXML
    private void volverMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }
}
