
package com.mycompany.terapiasg3grafica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import modelo.Cliente;
import modelo.Persona;





public class ClientesController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView tvClientes;
    @FXML
    private TableColumn<Cliente,String> clNombre;
    @FXML
    private TableColumn<Cliente,String> clCedula;
    @FXML
    private TableColumn<Cliente,String> clDatoRepres;
    @FXML
    private TableColumn<Cliente,String> clTelefono;
     @FXML
    private TableColumn<Cliente,String> clEmail;
    @FXML
    private Label lbClientes;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarDatos();
    }    
    
    public void cargarDatos(){
        lbClientes = new Label();
        lbClientes.setText("Clientes");
        anchorPane = new AnchorPane();
        tvClientes = new TableView();
        clDatoRepres = new TableColumn<>("Datos de Representante");
        clDatoRepres.setCellValueFactory(new PropertyValueFactory<>("DatoRepres"));
        clCedula = new TableColumn<>("Cedula");
        clCedula.setCellValueFactory(new PropertyValueFactory<>("Cedula"));
        clNombre = new TableColumn<>("Nombre");
        clNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        clTelefono = new TableColumn<>("Telefono");
        clTelefono.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
        clEmail = new TableColumn<>("Email");
        clEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        
        tvClientes.getColumns().add(clDatoRepres);
        tvClientes.getColumns().add(clCedula);
        tvClientes.getColumns().add(clNombre);
        tvClientes.getColumns().add(clTelefono);
        tvClientes.getColumns().add(clEmail);
        
        tvClientes.getItems().add(new Cliente("Dato Representante 1", "099999999", "Daniela", "0988888888", "daniela@correo.com"));
        anchorPane.getChildren().add(lbClientes);
        anchorPane.getChildren().add(tvClientes);
        
    }
    
}
