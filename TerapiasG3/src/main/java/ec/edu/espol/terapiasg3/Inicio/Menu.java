package ec.edu.espol.terapiasg3.Inicio;
import ec.edu.espol.terapiasg3.Agenda.Servicio;
import ec.edu.espol.terapiasg3.Agenda.Cita;
import ec.edu.espol.terapiasg3.Personas.Cliente;
import ec.edu.espol.terapiasg3.Personas.Empleado;
import java.util.Scanner;

public class Menu {
    public static void menuPrincipal(){
        //Gargamos objetos con metodo InicializarSistema
        TodoLista t = new TodoLista();
        TodoLista.inicializarSistema(t);
        
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        char op = ' ';
        do{
            System.out.println("Menu de opciones:\r\n"+
                    " 1. Servicios\r\n"+" 2. Empleados\r\n"+
                    " 3. Clientes\r\n"+" 4. Citas\r\n"+
                    " 5. Atenciones\r\n"+" 6. Salir\r\n");
            System.out.println("Opcion:");
            op = entrada.next().charAt(0);
            switch(op){
                //1. Servicios
                case '1':
                    System.out.println("Estos son los servicios");
                    System.out.println(t.listServicio);
                    char opc = ' ';
                    do{
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Agregar Servicio\r\n"+" 2. Editar Servicio\r\n"+
                                " 3. Eliminar Servicio\r\n"+" 4. Regresar");
                        System.out.println("Opcion:");
                        opc = entrada.next().charAt(0);
                        switch(opc){
                            case '1':
                                System.out.println("Agregar Nuevo Servicio");
                                Servicio nuevoServicio = Servicio.nextServicio(entrada);                              
                                t.agregarServicios(nuevoServicio);
                                System.out.println(t.listServicio);
                                break;


                            case '2':
                                System.out.println("Editar Servicio: ");
                                System.out.println("Ingrese el nombre del Servicio a editar: ");
                                String nombServ = entrada.next();
                                t.editarServicios(nombServ);
                                System.out.println(t.listServicio);
                                break;

                            case '3':
                                System.out.println("Eliminar Servicio: ");
                                System.out.println("Ingrese el nombre del Servicio a eliminar: ");
                                String nombServOne = entrada.next();
                                t.eliminarServicios(nombServOne); 
                                System.out.println(t.listServicio);
                                break;
                                
                            case '4':
                                System.out.println("Se ha retirado de Servicios");                               
                                break;

                            default:
                                System.out.println("Opcion no valida...");
                                break;

                        }
                    }while(opc != '4');                                     
                    break;
              
                //2. Empleados
                case '2':
                    System.out.println("Estos son los empleados");
                    System.out.println(t.listEmpleado);
                    char opc2 = ' ';
                    do{
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Agregar Empleado\r\n"+" 2. Editar Empleado\r\n"+
                                " 3. Eliminar Empleado\r\n"+" 4. Regresar");
                        System.out.println("Opcion:");
                        opc2 = entrada.next().charAt(0);
                        switch(opc2){
                            case '1':
                                System.out.println("Agregar Nuevo Empleado");
                                Empleado nuevoEmpleado = Empleado.nextEmpleado(entrada);                              
                                t.agregarEmpleado(nuevoEmpleado);
                                System.out.println(t.listEmpleado);
                                break;

                            case '2':
                                System.out.println("Editar empleado: ");                               
                                System.out.println("Ingrese el nombre del Empleado a editar: ");
                                String nombEmp = entrada.next();
                                t.editarEmpleado(nombEmp);
                                System.out.println(t.listEmpleado);
                                break;

                            case '3':
                                System.out.println("Eliminar empleado: ");
                                System.out.println("Ingrese el nombre del Empleado a eliminar: ");
                                String nombEmpl = entrada.next();
                                t.eliminarEmpleado(nombEmpl); 
                                System.out.println(t.listEmpleado);
                                break;
                            case '4':
                                System.out.println("Se ha retirado de Empleados");
                                break;

                            default:
                                System.out.println("Opcion no valida...");
                                break;
                        }
                    }while(opc2!='4');

                    break;                
                 
                //3. Clientes
                case '3':
                    System.out.println("Estos son los Clientes");
                    System.out.println(t.listCliente);
                    char opc3 = ' ';
                    do{
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Agregar Cliente\r\n"+" 2. Editar Cliente\r\n"+
                                " 3. Regresar");
                        System.out.println("Opcion:");
                        opc3 = entrada.next().charAt(0);
                        switch(opc3){
                            case '1':
                                System.out.println("Agregar Nuevo Cliente");
                                Cliente nuevoCliente = Cliente.nextCliente(entrada);                               
                                t.agregarCliente(nuevoCliente);
                                System.out.println(t.listCliente);
                                break;

                            case '2':
                                System.out.println("Editar cliente: ");                               
                                System.out.println("Ingrese el nombre del Cliente a editar: ");
                                String nombCliente = entrada.next();
                                t.editarCliente(nombCliente);
                                System.out.println(t.listCliente);
                                break;

                            case '3':
                                System.out.println("Se ha retirado de Clientes");
                                break;
                          
                            default:
                                System.out.println("Opcion no valida...");
                                break;
                        }
                    }while(opc3!='3');

                    break;
                 
                //4. Citas
                case '4':
                    char opc4= ' ';
                    do{
                        
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Crear Cita\r\n"+" 2. Eliminar Cita\r\n"+
                                " 3. Consultar cita por fechas\r\n" + " 4. Salir");
                        System.out.println("Opcion:");
                        opc4 = entrada.next().charAt(0); 
                        switch(opc4){
                            case '1':
                                System.out.println("Crear Cita");
                                Cita nuevaCita = Cita.nextCita(entrada,t);
                                t.crearCita(nuevaCita);
                                
                                break;
                            case '2':
                                System.out.println("Eliminar Cita");
                                
                                System.out.println("Ingrese la cedula del cliente: ");
                                String cedula = entrada.next();
                                t.eliminarCita(entrada, cedula);
                                break;
                            
                            case '3':
                                System.out.println("Consultar cita por fechas");
                                System.out.println("Ingrese la fecha de la cita (DD/MM/AAAA):");
                                String fecha = entrada.next();
                                t.buscarCitaPorFecha(fecha);
                                break;
                           
                            case '4':
                                System.out.println("Se ha retirado de citas");                              
                                break;

                            default:
                                System.out.println("Opcion no valida...");
                                break;
                        }              
                    }while(opc4!='4');
                    break;
                
                //5. Atenciones
                case '5':
                    char opc5= ' ';
                    do{
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Registrar atencion\r\n"+" 2. Consultar atencion\r\n"+
                                " 3. Salir");
                        System.out.println("Opcion:");
                        opc5 = entrada.next().charAt(0); 
                        switch(opc5){
                            case '1':
                                System.out.println("Registrar atencion");
                                System.out.println(t.listCita);
                                t.registrarAtencion(entrada);                                
                                break;
                                
                            case '2':
                                System.out.println("Consultar atencion");
                                t.consultarAtencion(entrada);                              
                                break;
                           
                            case '3':
                                System.out.println("Se ha retirado de atenciones");                               
                                break;

                            default:
                                System.out.println("Opcion no valida...");
                                break;
                        }              
                    }while(opc5!='3');
                    
                    

                    break;
                //6. Salir 
                case '6':
                    System.out.println("Gracias por su tiempo.");
                    break;
  
                default:
                    System.out.println("Opcion no valida...");
                    break;
                   
            }
        }while(op != '6');

   }
    
}
