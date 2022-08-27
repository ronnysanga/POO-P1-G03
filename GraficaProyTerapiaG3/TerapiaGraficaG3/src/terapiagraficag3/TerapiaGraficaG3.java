/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terapiagraficag3;

//import java.io.IOException;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author dell
 */
public class TerapiaGraficaG3 extends Application{

    private static Scene scene;
    static long start;
    static long finish;

    /*public static void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root = FXMLLoader.load(this.getClass().getResource("Menu.fxml"));
            scene = new Scene(root);

            stage.setTitle("JavaFX 2 menu");

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

    /*
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Bienvenidos a Terapias MEDICAL");
        stage.setScene(scene);
        stage.show();        
        
    }*/
        
        

    
