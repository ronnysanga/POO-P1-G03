
package ec.edu.espol.terapiasg3;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author noeliapasaca
 */
public class Cita {
    private Date fechaC;
    private Time hora;
    private Cliente cliente;
    //EMPLEADO QUE ESTA AGENDADO A ATENDER
    private Empleado empleadoC;

    //CONSTRUCTOR
    public Cita(Date fechaC, Time hora, Cliente cliente, Empleado empleadoC) {
        this.fechaC = fechaC;
        this.hora = hora;
        this.cliente = cliente;
        this.empleadoC = empleadoC;
    }
    
    //GETTERS Y SETTERS
    public Date getFechaC() {
        return fechaC;
    }

    public Time getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleadoC() {
        return empleadoC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleadoC(Empleado empleadoC) {
        this.empleadoC = empleadoC;
    }
    
    
    
}
