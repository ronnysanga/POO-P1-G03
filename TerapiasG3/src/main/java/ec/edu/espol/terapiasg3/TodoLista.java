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
    
    public void agregarEmpleado (Empleado e){
        listEmpleado.add(e);
        System.out.println("Se agrego el nuevo empleado: " + e.getNombre());
    }
    
    public void editarEmpleado(String nameEmp){
        for (Empleado e: listEmpleado){
            if(e.getNombre().equals(nameEmp)){
                //Nombre de Empleado
                System.out.println("Nombre del Empleado: " + e.getNombre());
                System.out.println("Nuevo Nombre del Empleado: ");
                String newname = sc.next();
                e.setNombre(newname);
                //Telefono del empleado
                System.out.println("Telefono del Empleado: " + e.getTelefono());
                System.out.println("Nuevo Telefono del Empleado: ");
                String newtelf = sc.next();
                e.setTelefono(newtelf);
                //Email
                System.out.println("Email del empleado: " + e.getEmail());
                System.out.println("Nuevo email del empleado: ");
                String newmail = sc.next();
                e.setEmail(newmail);
                
                
            }
        }
    }
    
    public void eliminarEmpleado(String nameEmp){
        for (Empleado e: listEmpleado){
            if(e.getNombre().equals(nameEmp)){
                e.setEstado(false);
            }
        }
    }
    
    
    //agregar cliente editar cliente michelle
    
    
    
    public static void inicializarSistema(TodoLista t){
//        TodoLista t = new TodoLista();
        //creando un empleado
        Empleado emp1 = new Empleado(true,"0911111111","Jorge","09222222222","jorge@correo.com");
        //creando dos clientes
        Cliente cl1 = new Cliente("datos de representante cl1","09333333333","Daniela","0944444444","daniela@correo.com");
        Cliente cl2 = new Cliente("datos de representante cl2","09555555555","Karina","0966666666","karina@correo.com");
        //creando servicios
        Servicio ser1 = new Servicio("Terapia de lenguaje",120,20.00,true);
        Servicio ser2 = new Servicio("Terapia psicopedagógica",60,10.00,true);
        //creando dos citas sin atender
        Cita cit1 = new Cita("26/06/2022","16:00",cl1,emp1);
        Cita cit2 = new Cita("27/06/2022","16:00",cl1,emp1);
        Cita cit3 = new Cita("24/06/2022","13:00",cl2,emp1);
        //creando una atencion
        Atencion ate1 = new Atencion(120,emp1,cit3); 
        

        t.listEmpleado.add(emp1);
        t.listCliente.add(cl1);
        t.listCliente.add(cl2);
        t.listServicio.add(ser1);
        t.listServicio.add(ser2);
        t.listCita.add(cit1);
        t.listCita.add(cit2);
        t.listCita.add(cit3);
        t.listAtencion.add(ate1);
    }

}

