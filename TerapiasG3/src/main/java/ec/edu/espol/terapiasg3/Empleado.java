/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.terapiasg3;

import java.util.Scanner;

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
    //COMPROBAR EL GETTER DE UN BOOLEANO coment
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    //public Empleado(boolean estado, String cedula, String nombre, String telefono, String email)
    /*
    public static Empleado nextEmpleado(Scanner sc){ 
        
    }*/
    
    public static Empleado nextEmpleado(Scanner sc){ 
        System.out.println("Ingrese Nombre del empleado: ");
        String nameEmp = sc.next();
        System.out.println("Ingrese cedula del empleado: ");
        String cedulaEmp = sc.next();
        System.out.println("Ingrese telefono del empleado: ");
        String telEmp = sc.next();
        System.out.println("Ingrese email del empleado: ");
        String emailEmp = sc.next();
                
        Empleado nuevoEmp = new Empleado(true, cedulaEmp, nameEmp, telEmp, emailEmp);
        return nuevoEmp; 
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + '}';
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
    
    
}