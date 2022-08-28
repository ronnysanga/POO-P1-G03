package modelo;
import java.util.Scanner;

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
    
    //metodo para los inputs del usuario
    /*
    public static Cita nextCita(Scanner sc,TodoLista t){ 
        Cita nuevaCita = null;
        System.out.println("Ingrese fecha de la cita(DD/MM/AAAA): ");
        String fechaC = sc.next();
        System.out.println("Ingrese hora de la cita(hh:mm Formato de 24 horas): ");
        String hora = sc.next();
        System.out.println("Ingrese nombre del cliente: ");
        String nameCliente = sc.next();
        System.out.println("Ingrese nombre del empleado: ");
        String nameEmpleado = sc.next();
        
        if ((t.buscarCliente(nameCliente)==null)||(t.buscarEmpleado(nameEmpleado)==null)){
            System.out.println("El empleado o cliente ingresado no existe");
        }else{
            Cliente client = t.buscarCliente(nameCliente);
            Empleado empl = t.buscarEmpleado(nameEmpleado);
            nuevaCita = new Cita(fechaC, hora, client, empl);
            return nuevaCita;
        }
        return nuevaCita;
       }   
*/

    @Override
    public String toString() {
        return "Cita{" + "fechaC=" + fechaC + ", hora=" + hora + ", cliente=" + cliente.getNombre() + ", empleadoC=" + empleadoC.getNombre() + '}';
    }
         
    
}
