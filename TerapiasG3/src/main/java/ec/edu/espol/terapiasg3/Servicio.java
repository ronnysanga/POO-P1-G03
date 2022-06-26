/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.terapiasg3;

/**
 *
 * @author Michelle
 */
public class Servicio {
    //atributos
    private String nombreServ ;
    private int duracionAtencion;
    private double precio;
    private boolean estado;
    
    //constructores
    public Servicio(String nombreServ,int duracionAtencion,double precio,boolean estado){
        this.nombreServ = nombreServ;
        this.duracionAtencion = duracionAtencion;
        this.precio = precio;
        this.estado = estado;
    }

    Servicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
