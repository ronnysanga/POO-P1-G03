
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
        clNombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("nombre"));
        
        
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
    
    
    @FXML
    private void volverMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();     
    }
}
