/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.terapiasg3grafica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TableView<Servicios> tvServicios;
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
    @FXML
    private Button btAgregarServicio;
    @FXML
    private Button btEditarServicio;
    @FXML
    private Button btEliminarServicio;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clNombre.setCellValueFactory(new PropertyValueFactory<Servicios,String>("nombreServ"));
        clDuracion.setCellValueFactory(new PropertyValueFactory<Servicios,String>("duracionAtencion"));
        clPrecio.setCellValueFactory(new PropertyValueFactory<Servicios,String>("precio"));
        
        clEstado.setCellValueFactory(new PropertyValueFactory<Servicios,String>("estado"));
        tvServicios.setItems(getServicios());
        
        
    }    
    
    public static ArrayList<Servicios> obtenerServicios(String ruta){
        ArrayList<Servicios> servicios = new ArrayList<>();
        //completar para leer el archivo y llenar la lista
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] datos = sCurrentLine.split(",");
//                NombreServicio,Duracion,Precio,Estado
                String nombreServicio = datos[0];
                int duracion = Integer.valueOf(datos[1]);
                double precio = Double.valueOf(datos[2]);
                boolean estado = Boolean.valueOf(datos[3]);
                Servicios s1 = new Servicios(nombreServicio,duracion,precio,estado);
                servicios.add(s1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return servicios;
}
    
    
    public ObservableList<Servicios> getServicios(){
        ObservableList<Servicios> servicios = FXCollections.observableArrayList();
        
        ArrayList<Servicios> lista_serv = obtenerServicios("serviciosv1.txt");
        for(Servicios s: lista_serv){
//            Servicios s1 = s;   
//            servicios.add(new Servicios("Terapia de lenguaje",120,20.00,true));
            servicios.add(new Servicios(s.getNombreServ(),s.getDuracionAtencion(),s.getPrecio(),s.isEstado()));
        }
        
        return servicios;
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
    

    


