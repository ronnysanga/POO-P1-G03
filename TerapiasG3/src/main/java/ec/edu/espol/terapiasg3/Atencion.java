
package ec.edu.espol.terapiasg3;

/**
 *
 * @author noeliapasaca
 */
public class Atencion {
    //duracion en minutos
    private int duracion;
    //empleado que atiende
    private Empleado empleadoA;
    private Cita cita;
    
    //CONSTRUCTOR

    public Atencion(int duracion, Empleado empleadoA, Cita cita) {
        this.duracion = duracion;
        this.empleadoA = empleadoA;
        this.cita = cita;
    }
    
    //GETTERS Y SETTERS

    public int getDuracion() {
        return duracion;
    }

    public Empleado getEmpleadoA() {
        return empleadoA;
    }

    public Cita getCita() {
        return cita;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEmpleadoA(Empleado empleadoA) {
        this.empleadoA = empleadoA;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    
    
}

