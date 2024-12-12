/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_caso2;

/**
 *
 * @author joviedo
 */
public class Habitaciones {
    
    private int numeroHabitacion;
    private String tipo;
    private int precioNoche;
    private String estadoActual;
    private String Libre;
    private String Sucia;
    private String Ocupada;
    private int piso;
    private String Reservar;
    
    public Habitaciones (String Reservar,int piso,int numeroHabitacion ,String tipo , int precioNoche, String estadoActual, String Libre, String Sucia, String Ocupada){
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.estadoActual = estadoActual;
        this.piso =piso;
        this.Reservar =Reservar;
        
    
  

    
    public int getnumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getestadoActual() {
        return estadoActual;
    }
    
      public int getprecioNoche() {
        return precioNoche;  
    }
       public int getPiso() {
        return Piso;  
    } 
}
        
        
    
    

