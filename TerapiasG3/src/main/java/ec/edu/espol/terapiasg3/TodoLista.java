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
    public ArrayList<Servicio> listServicio=new ArrayList<>();
    public ArrayList<Empleado> listEmpleado=new ArrayList<>();
    public ArrayList<Cliente> listCliente=new ArrayList<>();
    public ArrayList<Cita> listCita=new ArrayList<>();
    public ArrayList<Atencion> listAtencion=new ArrayList<>();
    
    //Comentario
    Scanner sc = new Scanner(System.in);
    
    
    public void agregarServicios(Servicio s){
        listServicio.add(s); 
        System.out.println("Se agrego su nuevo servicio: "+ s.getNombreServ());
    }
    
    public void editarServicios(String nombServ ){
        
        boolean a = true;
        
        for (Servicio s: listServicio ){
                    
            if(s.getNombreServ().equals(nombServ)){
                a = false;
                //Nombre de Servicio
                System.out.println("Nombre del Servicio: " + s.getNombreServ());
                System.out.println("Nuevo Nombre del Servicio: ");
                String newserv = sc.nextLine();
                s.setNombreServ(newserv);
                //Duracion de Servicio
                System.out.println("Duracion del Servicio: " + s.getDuracionAtencion());
                System.out.println("Nuevo Duracion del Servicio: ");
                int newdura = sc.nextInt();
                sc.nextLine();
                s.setDuracionAtencion(newdura);
                //Precio
                System.out.println("Precio del Servicio: " + s.getPrecio());
                System.out.println("Nuevo Precio del Servicio(Poner coma para decimales): ");
                double newprice = sc.nextDouble();
                s.setPrecio(newprice);   
                
            }
           
        }
        
        if(a){
            System.out.println("NO EXISTE EL SERVICIO BUSCADO");
        }
        
    }
    
    public void eliminarServicios( String nombServ ){
        for (Servicio s: listServicio ){
            if(s.getNombreServ().equals(nombServ)){
                s.setEstado(false);
                System.out.println("Se cambio a estado:");
                System.out.println(Servicio.verEstadoServicios(s.isEstado()));
            }
        }
        
    }
    
    
    //buscar empleado
    public Empleado buscarEmpleado (String nameEmpleado){
        Empleado e = null;
        for (Empleado emple: listEmpleado ){
            if(emple.getNombre().equals(nameEmpleado)){
                e = emple;
            }
        }
        return e;
    }
    
    public void agregarEmpleado (Empleado e){
        listEmpleado.add(e);
        System.out.println("Se agrego el nuevo empleado: " + e.getNombre());
    }
    
    public void editarEmpleado(String nameEmp){
        
        boolean a = true;
        
        for (Empleado e: listEmpleado){
                    
            if(e.getNombre().equals(nameEmp)){
                a = false;
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
        
        if(a){
            System.out.println("NO EXISTE EL EMPLEADO BUSCADO");
        }
        
    }
    
    
    public void eliminarEmpleado( String nameEmp ){
        for (Empleado e: listEmpleado){
            if(e.getNombre().equals(nameEmp)){
                e.setEstado(false);
                System.out.println("Se cambio a estado:");
                System.out.println(Empleado.verEstadoEmpleado(e.isEstado()));
            }
        }
        
    }
    
    
    //metodo buscar cliente
    public Cliente buscarCliente (String nameCliente){
        Cliente c = null;
        for (Cliente client: listCliente ){
            if(client.getNombre().equals(nameCliente)){
                c = client;
            }
        }
        return c;
    }
    
    public void agregarCliente (Cliente c){
        listCliente.add(c);
        System.out.println("Se agrego el nuevo cliente: " + c.getNombre());
    }
    
    public void editarCliente(String nameCliente){
        boolean a = true;
        for (Cliente c: listCliente){
            if(c.getNombre().equals(nameCliente)){
                a = false;
                //Nombre de cliente
                System.out.println("Nombre del Cliente: " + c.getNombre());
                System.out.println("Nuevo Nombre del Cliente: ");
                String newname = sc.next();
                c.setNombre(newname);
                //Telefono del cliente
                System.out.println("Telefono del Cliente: " + c.getTelefono());
                System.out.println("Nuevo Telefono del Cliente: ");
                String newtelf = sc.next();
                c.setTelefono(newtelf);
                //Email
                System.out.println("Email del Cliente: " + c.getEmail());
                System.out.println("Nuevo email del Cliente: ");
                String newmail = sc.next();
                c.setEmail(newmail);
                //datos del representante
                System.out.println("datos del representante: " + c.getDatoRepres());
                System.out.println("Nuevo dato del representante: ");
                String newdato = sc.next();
                c.setDatoRepres(newdato);
                
            }
        }
        if(a){
            System.out.println("NO EXISTE EL CLIENTE BUSCADO");
        }
    }
    //metodo buscar cita con fecha y hora
    public Cita buscarCita (String fecha, String hora ){
        Cita c = null;
        for (Cita cit: listCita ){
            if(cit.getFechaC().equals(fecha)){
                if(cit.getHora().equals(hora)){
                    c = cit;
                }
            }
        }
        return c;
    }
    
    //BuscarCita por fecha
    public void buscarCitaporFecha (String fecha ){
        for (Cita cit: listCita ){
            if(cit.getFechaC().equals(fecha)){
                System.out.println(cit);   
            }
        }

    }
    
    public void eliminarCita (Scanner sc, String Cedula, String fecha, String hora){
        //Imprime Citas del Cliente con su cedula              
        for (Cita c: listCita){
            if(c.getCliente().getCedula().equals(Cedula)){             
                System.out.println(c);              
            }
        }
        
        System.out.println("Ingrese Fecha de la cita a eliminar: ");
        String fec = sc.nextLine();
        System.out.println("Ingrese Hora de la cita a eliminar: ");
        String hor = sc.nextLine();  
        listCita.remove(buscarCita(fec, hor));       
        System.out.println("Se elimino la Cita de la fecha "+fec+ " y hora" + hor);
        
    }
    
    public void crearCita (Cita ci){
        listCita.add(ci);
        System.out.println("Se creo una nueva cita: " );
    }
    
    
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

