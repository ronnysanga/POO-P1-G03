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
import modelo.Servicios;

/**
 *
 * @author dell
 */
public class ServiciosController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView tvServicios;
    @FXML
    private TableColumn<Servicios,String> clNombre;
    @FXML
    private TableColumn<Servicios,String> clDuracion;
    @FXML
    private TableColumn<Servicios,String> clPrecio;
    @FXML
    private TableColumn<Servicios,String> clEstado;
    
    @FXML
    private Label lbServicios;
    
    @FXML
    private Button btAtras;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        cargarDatos();
    }
    
    public void cargarDatos(){
        lbServicios = new Label();
        lbServicios.setText("Servicios");
        anchorPane = new AnchorPane();
        tvServicios = new TableView();
        clNombre = new TableColumn<>("Nombre");
        clNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        clDuracion = new TableColumn<>("Duracion");
        clDuracion.setCellValueFactory(new PropertyValueFactory<>("Duracion"));
        clPrecio = new TableColumn<>("Precio");
        clPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio"));
        clEstado = new TableColumn<>("Estado");
        clEstado.setCellValueFactory(new PropertyValueFactory<>("Estado"));
        
        tvServicios.getColumns().add(clNombre);
        tvServicios.getColumns().add(clDuracion);
        tvServicios.getColumns().add(clPrecio);
        tvServicios.getColumns().add(clEstado);
        
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
