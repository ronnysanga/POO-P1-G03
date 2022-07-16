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
    
   
    public void crearCita (Cita ci){
        String empleado = ci.getEmpleadoC().getNombre();
        String fecha = ci.getFechaC();
        String hora = ci.getHora();
        for (int i = 0; i < listCita.size(); i++){
            Cita c = listCita.get(i);
            if(c.getEmpleadoC().getNombre().equals(empleado)){
                if(ci.getEmpleadoC().isEstado()){
                    if((c.getFechaC().equals(fecha)) && (c.getHora().equals(hora))){
                        System.out.println("El empleado se encuenta ocupado en esa fecha y hora");
                        i = listCita.size();
                    }else{
                        listCita.add(ci);
                        System.out.println("Se creo la nueva cita: " + ci);

                        i = listCita.size();
                    }
                }else{
                    System.out.println("El empleado se encuentra inactivo");
                }
            }else{
                System.out.println("No se encuentra al empleado ingresado");
            }
        }    
    }
    
 
    
    
    public void eliminarCita (Scanner sc, String Cedula){
        //Imprime Citas del Cliente con su cedula              
        for (Cita c: listCita){
            if(c.getCliente().getCedula().equals(Cedula)){             
                System.out.println(c);              
            }
        }
        
        System.out.println("Ingrese Fecha de la cita a eliminar: ");
        String fec = sc.next();
        System.out.println("Ingrese Hora de la cita a eliminar: ");
        String hor = sc.next();  
        listCita.remove(buscarCita(fec, hor));       
        System.out.println("Se elimino la Cita de la fecha "+fec+ " y hora " + hor);
        
    }
    
    //BuscarCita por fecha
    public void buscarCitaPorFecha (String fecha ){
        System.out.println("Aqui estan las citas de la fecha ingresada:");
        for (Cita cit: listCita ){
            if(cit.getFechaC().equals(fecha)){
                System.out.println(cit);   
            }
        }

    }
    
    //metodos de atencion
    
    public void registrarAtencion(Scanner entrada){
        System.out.println("Ingrese la cedula del cliente atendido: ");
        String cedula=entrada.next();
        Cita cita=buscarCita(entrada,cedula);
        System.out.println("Ingrese la duracion de la atencion: ");
        int duracion=entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nameEmpleado=entrada.next();
        Empleado empl = buscarEmpleado(nameEmpleado);
        
        Atencion at= new Atencion(duracion,empl,cita);
        listAtencion.add(at);
        System.out.println("Se ha registrado la atencion "+at);
    }
    
    public Cita buscarCita(Scanner entrada, String cedula){
        Cita cita=null;
        System.out.println("Ingrese la fecha: ");
        String fecha=entrada.next();
        System.out.println("Ingrese la hora: ");
        String hora=entrada.next();
        for (Cita c: listCita){
            if(c.getCliente().getCedula().equals(cedula)){
                
                if((c.getFechaC().equals(fecha))&&(c.getHora().equals(hora))){
                  cita=c;  
                }else{
                    System.out.println("No se encuentra la cita ");
                }
            }
        }
        return cita;
    }
    
    public void consultarAtencion(Scanner entrada){
        entrada.useDelimiter("\n");
        char op = ' ';
        do{
            System.out.println("Seleccione el criterio de búsqueda:\r\n"+
                    " 1. Cédula de cliente\r\n"+" 2. Cédula de empleado\r\n"+
                    " 3. Fecha de atención\r\n"+" 4. Salir\r\n");
            System.out.println("Opcion:");
            op = entrada.next().charAt(0);
            switch(op){
                case '1':
                    System.out.println("Ingrese la cedula de cliente: ");
                    String cedula=entrada.next();
                    for(Atencion at:listAtencion){
                        if(at.getCita().getCliente().getCedula().equals(cedula)){
                            System.out.println(at);
                        }
                    }
                    
                    
                    break;
                case '2':
                    System.out.println("Ingrese la cedula de empleado: ");
                    String cedulaE=entrada.next();
                    for(Atencion at:listAtencion){
                        if(at.getEmpleadoA().getCedula().equals(cedulaE)){
                            System.out.println(at);
                        }
                    }
                    
                  
                    break;
                case '3':
                    System.out.println("Ingrese la fecha de atención: ");
                    String fecha=entrada.next();
                    for(Atencion at:listAtencion){
                        if(at.getCita().getFechaC().equals(fecha)){
                            System.out.println(at);
                        }
                    }
                    
                    
                    break;
                case '4':
                    System.out.println("Se ha retirado de consultar atención");
                    break;
                default:
                    System.out.println("Opcion no valida...");
                    break;
            
            }
        }
        while(op!='4');
    }
    
    
    
    public static void inicializarSistema(TodoLista t){

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

