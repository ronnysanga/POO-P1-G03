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
     public static Cliente nextCliente(Scanner sc){ 
        System.out.println("Ingrese Nombre del cliente: ");
        String nameCliente = sc.next();
        System.out.println("Ingrese cedula del cliente: ");
        String cedulaCliente = sc.next();
        System.out.println("Ingrese telefono del cliente: ");
        String telCliente = sc.next();
        System.out.println("Ingrese email del cliente: ");
        String emailCliente = sc.next();
        System.out.println("Ingrese datos del representante: ");
        String datoRepres = sc.next();
                
        Cliente nuevoClient = new Cliente(datoRepres,cedulaCliente, nameCliente, telCliente, emailCliente);
        return nuevoClient; 
    }
     @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
}
