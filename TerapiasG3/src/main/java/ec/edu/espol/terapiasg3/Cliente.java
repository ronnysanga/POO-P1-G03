/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.terapiasg3;

/**
 *
 * @author dell
 */
public class Cliente extends Persona{
    private String datoRepres;

    public Cliente(String datoRepres, String cedula, String nombre, String telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.datoRepres = datoRepres;
    }
    

    

    public String getDatoRepres() {
        return datoRepres;
    }

    public void setDatoRepres(String datoRepres) {
        this.datoRepres = datoRepres;
    }
    
    //nextcliente
}
