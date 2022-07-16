package ec.edu.espol.terapiasg3.Agenda;

import java.util.Scanner;

public class Servicio {
    //atributos
    private String nombreServ ;
    //CONFIRMAR EL TIPO DE DATO DURACION DE ATENCION
    private int duracionAtencion;
    private double precio;
    private boolean estado;
    
    //constructores
    public Servicio(String nombreServ,int duracionAtencion,double precio,boolean estado){
        this.nombreServ = nombreServ;
        this.duracionAtencion = duracionAtencion;
        this.precio = precio;
        this.estado = estado;
    }

    // getters & setters
    public String getNombreServ() {
        return nombreServ;
    }

    public void setNombreServ(String nombreServ) {
        this.nombreServ = nombreServ;
    }

    public int getDuracionAtencion() {
        return duracionAtencion;
    }

    public void setDuracionAtencion(int duracionAtencion) {
        this.duracionAtencion = duracionAtencion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //Metodo creado para ver el estado
    public static String verEstadoServicios(boolean estado){
        String estadoactual = "";
        if(estado){
            estadoactual = "Activo";
        }else{
            estadoactual = "Inactivo";
        }
        return estadoactual;
    }
    
    //Metodo para poner un String Activo o Inactivo 
    //validar que se compare en minuscula
    public static boolean verBooleanEstadoServicios(String estado){
        boolean estadoactual = true;
        if((estado.toLowerCase()).equals("activo")){
            estadoactual = true;
        }else if((estado.toLowerCase()).equals("inactivo")){
            estadoactual = false;
        }else{
            System.out.println("Ingreso mal el Estado debe ser Activo o Inactivo");           
        }
        return estadoactual;
    }
    
    //metodo para los inputs del usuario
    public static Servicio nextServicio(Scanner sc){ 
        System.out.println("Ingrese Nombre del Servicio: ");
        String nombreServ = sc.next();
        System.out.println("Ingrese Duracion de la Atencion: ");
        int duracionAtencion = sc.nextInt();
        //ese nexline para que no haya problemas al input
        sc.nextLine();
        System.out.println("Ingrese precio (utilice coma para decimales) : ");
        double precio = sc.nextDouble();
                
        Servicio newServicio = new Servicio(nombreServ,duracionAtencion,precio,true);
        return newServicio;
        
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombreServ=" + nombreServ + ", duracionAtencion=" + duracionAtencion + ", precio=" + precio + '}';
    }
    
    
    
}
