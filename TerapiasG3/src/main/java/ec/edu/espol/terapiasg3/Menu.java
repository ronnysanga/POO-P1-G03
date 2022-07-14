/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.terapiasg3;

import java.util.Scanner;

/**
 *
 *
 */
public class Menu {
    public static void menuPrincipal(){
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
                                //Validar solo la parte si el usuario puede poner el estado activo o No
                                System.out.println("Agregar Nuevo Servicio");
                                Servicio nuevoServicio = Servicio.nextServicio(entrada);
                               
                                t.agregarServicios(nuevoServicio);
                                System.out.println("Nuemero de elementos de lista Servicios: "+ t.listServicio.size());
                                break;


                            case '2':
                                //System.out.println(t.listServicio);
                                System.out.println("Editar Servicio: ");
                                System.out.println("Ingrese el nombre del Servicio: ");
                                String nombServ = entrada.next();
                                t.editarServicios(nombServ);
                                //System.out.println(t.listServicio);

                                break;

                            case '3':
                                //System.out.println(t.listServicio);
                                System.out.println("Eliminar Servicio: ");
                                System.out.println("Ingrese el nombre del Servicio: ");
                                String nombServone = entrada.next();
                                t.eliminarServicios(nombServone);                                                            

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
                                System.out.println("Numero de elementos de lista Empleados: "+ t.listEmpleado.size());
                                

                                break;

                            case '2':
                                System.out.println("Editar empleado: ");
                                

                                break;

                            case '3':
                                System.out.println("Eliminar empleado: ");

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
                                System.out.println("Numero de elementos de lista Clientes: "+ t.listCliente.size());
                                

                                break;

                            case '2':
                                System.out.println("Editar cliente: ");
                                

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
          /*          
                case '4':
                    System.out.println("Ingreso la opcion 4");                   

                    break;
                    
                case '5':
                    System.out.println("Ingreso la opcion 5");

                    break;
                    
                case '6':
                    System.out.println("Gracias por su tiempo");

                    break;
  
                default:
                    System.out.println("Opcion no valida...");
                    break;
         */          
            }
        }while(op != '6');
      
   }
    
}
