package modelo;

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
    
}
