package ec.edu.espol.terapiasg3.Personas;

import java.util.Scanner;

public class Empleado extends Persona{
    private boolean estado;

    //Contructor
    public Empleado(boolean estado, String cedula, String nombre, String telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
    }
    //getters y setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //nextEmpleado llamando al metodo estatico de padre 
    public static Empleado nextEmpleado(Scanner sc){ 
        Persona newP = Persona.nextPersona(sc);               
        Empleado nuevoEmp = new Empleado(true, newP.getCedula(), newP.getNombre(), newP.getTelefono(), newP.getEmail());
        return nuevoEmp; 
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + '}';
    }
    
    //Para retornar el estado como un String
    public static String verEstadoEmpleado(boolean estado){
        String estadoactual = "";
        if(estado){
            estadoactual = "Activo";
        }else{
            estadoactual = "Inactivo";
        }
        return estadoactual;
    }
    
    
}