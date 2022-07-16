package ec.edu.espol.terapiasg3.Personas;

import java.util.Scanner;

public class Cliente extends Persona{
    private String datoRepres;

    //Contructor
    public Cliente(String datoRepres, String cedula, String nombre, String telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.datoRepres = datoRepres;
    }

    //getters y setters
    public String getDatoRepres() {
        return datoRepres;
    }

    public void setDatoRepres(String datoRepres) {
        this.datoRepres = datoRepres;
    }
    
   //nextcliente llamando al metodo estatico de padre  
     public static Cliente nextCliente(Scanner sc){ 
        Persona newP = Persona.nextPersona(sc); 
        System.out.println("Ingrese datos del representante: ");
        String datoRepres = sc.next();
                
        Cliente nuevoClient = new Cliente(datoRepres,newP.getCedula(), newP.getNombre(), newP.getTelefono(), newP.getEmail());
        return nuevoClient; 
    }
     @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
}
