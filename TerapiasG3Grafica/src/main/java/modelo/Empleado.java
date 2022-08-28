/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dell
 */
public class Empleado extends Persona{
    private boolean estado;

    public Empleado(boolean estado, String cedula, String nombre, String telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
    }
    //COMPROBAR EL GETTER DE UN BOOLEANO
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
