/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.juegocuantoshay;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import modelo.Animal;

/**
 * FXML Controller class
 *
 * @author sixbo
 */
public class Juego1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txtNumIngresado;
    @FXML
    private Button btSiguiente;
    @FXML
    private Button btAnterior;
    @FXML
    private ImageView imgAnimal;
    @FXML
    private FlowPane flowPane;
    @FXML
    private ImageView imgAcierto;
    int cantidad = 4;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generarAnimales();
        ganarPerder();
        
    }    
    
    public void generarAnimales(){
        
        for(int i=0;i<cantidad;i++){
            Image image = new Image("files/pig.png",true);
            ImageView imgAnimal = new ImageView(image);
            imgAnimal.setFitHeight(100);
            imgAnimal.setFitWidth(100);
            flowPane.getChildren().addAll(imgAnimal);
        }
        
    }
    
    public void pasarSiguienteReto(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("juego2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void pasarRetoAnterior(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //TERMINAR ESTO
    public void ganarPerder(){
        
        
        
        
//        if(txtNumIngresado != null){
//            if(Integer.valueOf(txtNumIngresado.getText()) == cantidad){
//                    //si acierta
//                    Image image = new Image("files/happy-face.png",true);
//                    imgAcierto = new ImageView(image);
//                    imgAcierto.setFitHeight(100);
//                    imgAcierto.setFitWidth(100);
//
//                }else{
//                    //si no acierta
//                    
//                }
//        
//        }
    }
    
    
    
    
    public void contarRetos(){
        
    }

}
