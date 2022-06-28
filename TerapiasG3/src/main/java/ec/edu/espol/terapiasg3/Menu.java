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
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        char op = ' ';
        do{
            System.out.println("Menu de opciones:\r\n"+
                    " 1. Servicios\r\n"+" 2. Empleados\r\n"+
                    " 3. Clientes\r\n"+" 4. Citas\r\n"+
                    " 5. Atenciones\r\n"+" 6. Salir\r\n"+
                    " 7. Salir");
            System.out.println("Opcion:");
            op = entrada.next().charAt(0);
            switch(op){
                case '1':
                    System.out.println("Estos son los servicios");
                    //Para cada servicio incluir el nombre, la duración de atención (en minutos), precio y estado(Activo, Inactivo)
                    System.out.println("Agregar Servicio");
                    char opc = ' ';
                    do{
                        System.out.println("Menu de opciones:\r\n"+
                                " 1. Agregar Servicio\r\n"+" 2. Editar Servicio\r\n"+
                                " 3. Eliminar Servicio\r\n"+" 4. Regresar");
                        System.out.println("Opcion:");
                        opc = entrada.next().charAt(0);
                        switch(opc){
                            case '1':
                                System.out.println("Agregar Servicio: ");
                                

                                break;

                            case '2':
                                System.out.println("Editar Servicio: ");

                                break;

                            case '3':
                                System.out.println("Eliminar Servicio: ");

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
        /*        
                case '2':
                    System.out.println("Ingreso la opcion 2");

                    break;                
                    
                case '3':
                    System.out.println("Ingreso la opcion 3");

                    break;
                    
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
