package com.mycompany.juegocuantoshay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import modelo.Animal;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ArrayList<Animal> animales;

    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }

    public static void main(String[] args) {
        launch();
        
            
        
    }

    
    
    
}