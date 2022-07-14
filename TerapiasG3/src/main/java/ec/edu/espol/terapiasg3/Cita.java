
package ec.edu.espol.terapiasg3;

import java.util.Scanner;



/**
 *
 * @author noeliapasaca
 */
public class Cita {
    private String fechaC;
    private String hora;
    private Cliente cliente;
    //EMPLEADO QUE ESTA AGENDADO A ATENDER
    private Empleado empleadoC;

    //CONSTRUCTOR
    public Cita(String fechaC, String hora, Cliente cliente, Empleado empleadoC) {
        this.fechaC = fechaC;
        this.hora = hora;
        this.cliente = cliente;
        this.empleadoC = empleadoC;
    }
    
    //GETTERS Y SETTERS
    public String getFechaC() {
        return fechaC;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleadoC() {
        return empleadoC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleadoC(Empleado empleadoC) {
        this.empleadoC = empleadoC;
    }
    
    //nextCita
    /*
    public static Cliente nextCita(Scanner sc){ 
        System.out.println("Ingrese fecha de la cita: ");
        String fechaC = sc.next();
        System.out.println("Ingrese hora de la cita: ");
        String hora = sc.next();
        System.out.println("Ingrese nombre del cliente: ");
        String cliente = sc.next();
        System.out.println("Ingrese nombre del empleado: ");
        String Empleado = sc.next();
        
       }         
        //Cita nuevaCita= new Cita(String fechaC, String hora, Cliente cliente, Empleado empleadoC);
       // return nuevaCita; 
    */
    
}
