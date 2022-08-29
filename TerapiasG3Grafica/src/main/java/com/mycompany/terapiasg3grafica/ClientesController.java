
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
import modelo.Persona;





public class ClientesController implements Initializable {
    
    private Stage stage;
    private Scene scene;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView<Cliente> tvClientes;
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
    
    @FXML
    private Button btAtras;
    @FXML
    private Button btAgregarCliente;
    @FXML
    private Button btEditarCliente;
   
   
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clDatoRepres.setCellValueFactory(new PropertyValueFactory<Cliente,String>("datoRepres"));
        clCedula.setCellValueFactory(new PropertyValueFactory<Cliente,String>("cedula"));
        clNombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("nombre"));
        clTelefono.setCellValueFactory(new PropertyValueFactory<Cliente,String>("telefono"));
        clEmail.setCellValueFactory(new PropertyValueFactory<Cliente,String>("email"));
        
        tvClientes.setItems(getClientes());
        
        
    }    
    
    
    public ObservableList<Cliente> getClientes(){
        ObservableList<Cliente> clientes = FXCollections.observableArrayList();
        clientes.add(new Cliente("Dato Representante 1", "099999999", "Daniela", "0988888888", "daniela@correo.com"));
        return clientes;
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
