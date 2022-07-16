package ec.edu.espol.terapiasg3.Personas;

import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;

    //Contructor
    public Persona(String cedula, String nombre, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //metodo para los inputs del usuario
    public static Persona nextPersona(Scanner sc){ 
        System.out.println("Ingrese Nombre: ");
        String name = sc.next();
        System.out.println("Ingrese cedula: ");
        String cedula = sc.next();
        System.out.println("Ingrese telefono: ");
        String telefono = sc.next();
        System.out.println("Ingrese email: ");
        String email = sc.next();
                
        Persona newPerson = new Persona(cedula, name, telefono, email);
        return newPerson; 
    }
    
   

    @Override
    public String toString() {
        return "{ cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
      
    
}
