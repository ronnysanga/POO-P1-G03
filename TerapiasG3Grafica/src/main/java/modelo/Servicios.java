package modelo;

import com.mycompany.terapiasg3grafica.App;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios{
     //atributos
    private String nombreServ ;
    private int duracionAtencion;
    private double precio;
    private boolean estado;

    
    //constructores
    public Servicios(String nombreServ,int duracionAtencion,double precio,boolean estado){
        this.nombreServ = nombreServ;
        this.duracionAtencion = duracionAtencion;
        this.precio = precio;
        this.estado = estado;
 
    }


    // getters & setters
    public String getNombreServ() {
        return nombreServ;
    }

    public void setNombreServ(String nombreServ) {
        this.nombreServ = nombreServ;
    }

    public int getDuracionAtencion() {
        return duracionAtencion;
    }

    public void setDuracionAtencion(int duracionAtencion) {
        this.duracionAtencion = duracionAtencion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        
    }

    public static String verEstadoEmpleado(boolean estado){
        String estadoactual = "";
        if(estado){
            estadoactual = "Activo";
        }else{
            estadoactual = "Inactivo";
        }
        return estadoactual;
    }
    
    public static ArrayList<Servicios> obtenerServicios(String ruta){
        ArrayList<Servicios> serviciosp = new ArrayList<>();
        //completar para leer el archivo y llenar la lista
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
           String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
//                NombreServicio,Duracion,Precio,Estado
                String nombreServicio = datos[0];
                int duracion = Integer.valueOf(datos[1]);
                double precio = Double.valueOf(datos[2]);
                boolean estado = Boolean.valueOf(datos[3]);
                Servicios s1 = new Servicios(nombreServicio,duracion,precio,estado);
                serviciosp.add(s1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return serviciosp;
}
    
    @Override
    public String toString() {
        return "Servicios{" + "nombreServ=" + nombreServ + ", duracionAtencion=" + String.valueOf(duracionAtencion) + ", precio=" + String.valueOf(precio) + ", estado=" + verEstadoEmpleado(estado) + '}';
    }
    
    
    
    
}
