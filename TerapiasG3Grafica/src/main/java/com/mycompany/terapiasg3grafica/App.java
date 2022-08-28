
package com.mycompany.terapiasg3grafica;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    private static Scene scene;
    static long start;
    static long finish;

    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root = FXMLLoader.load(this.getClass().getResource("Menu.fxml"));
            scene = new Scene(root);
            stage.setTitle("EMPRESA DE SERVICIOS DE TERAPIAS");                    
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