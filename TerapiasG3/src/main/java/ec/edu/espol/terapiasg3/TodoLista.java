/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.terapiasg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 */
public class TodoLista {
    ArrayList<Servicio> listServicio=new ArrayList<>();
    ArrayList<Empleado> listEmpleado=new ArrayList<>();
    ArrayList<Cliente> listCliente=new ArrayList<>();
    ArrayList<Cita> listCita=new ArrayList<>();
    ArrayList<Atencion> listAtencion=new ArrayList<>();
    
    //Comentario
    Scanner sc = new Scanner(System.in);
    
    
    public void agregarServicios(Servicio s){
        listServicio.add(s); 
        System.out.println("Se agrego su nuevo servicio: "+ s.getNombreServ());
    }
    
    public void editarServicios(String nombServ ){
        
        for (Servicio s: listServicio ){
            if(s.getNombreServ().equals(nombServ)){
                //Nombre de Servicio
                System.out.println("Nombre del Servicio: " + s.getNombreServ());
                System.out.println("Nuevo Nombre del Servicio: ");
                String newserv = sc.next();
                s.setNombreServ(newserv);
                //Duracion de Servicio
                System.out.println("Duracion del Servicio: " + s.getDuracionAtencion());
                System.out.println("Nuevo Duracion del Servicio: ");
                int newdura = sc.nextInt();
                sc.nextLine();
                s.setDuracionAtencion(newdura);
                //Precio
                System.out.println("Precio del Servicio: " + s.getPrecio());
                System.out.println("Nuevo Precio del Servicio: ");
                double newprice = sc.nextDouble();
                s.setPrecio(newprice);
                
                
            }
        }
        
    }
    
    public void eliminarServicios( String nombServ ){
        for (Servicio s: listServicio ){
            if(s.getNombreServ().equals(nombServ)){
                s.setEstado(false);
            }
        }
    }
}
