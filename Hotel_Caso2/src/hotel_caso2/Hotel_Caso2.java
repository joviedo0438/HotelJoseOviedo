/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel_caso2;

import java.util.Scanner;

/**
 *
 * @author joviedo
 */
public class Hotel_Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] numero = {"101.", "102.", "103.", "201.", "202", "203","301","302", "303","401","402","403"};
        String[] nuPiso = {"1", "2", "3", "4"};
        Habitaciones[] Reservar = new Habitaciones[numero.length];
        Piso[] reservar = new Piso[nuPiso.length];
         Scanner scanner = new Scanner(System.in);
         
          
         
          
    }
       while (true)
    private Piso[] reservar;
    private Piso nuPiso;
    private boolean[] Reservar;
    private boolean numero;
{
            System.out.println(" Sistema de Reservas del hotel ");
            System.out.println("1 Rservar Habitacion");
            System.out.println("1 Reservar piso");
            System.out.println("2 Consultar estado de habitacion");
            System.out.println("3 Salir");
            System.out.print("Seleccione una opción: ");
            int elegir = scanner.nextInt();
            

             
 switch (elegir) {
                case 1 -> {
                    System.out.println(" Habitaciones disponibles ");
                    for (int i = 0; i < numero.length; i++) {
                        if (Reservar[i] == null) {
                            System.out.println((i + 1) + "  " + numero[i]);
                        }
                    }
                    
                    System.out.print("Seleccione una habitacion (número): ");
                    int seleccionar = scanner.nextInt()-1;
                    
                    if (Reservar[seleccionar] != numero) {
                        System.out.println("La habitacion ya está reservado. Por favor, elija otro.");
                    }
                    else {
                        System.out.print("Ingrese el numero de habitacion: ");
                        String numeroHabitacion = scanner.next();
                        

                        Reservar[seleccionar] = new Habitaciones(numeroHabitacion);
                        System.out.println("Reserva realizada con éxito");
                    }
            }
                case 2 -> {
                    System.out.println(" Pisos disonibles ");
                    for (int i = 0; i < nuPiso.length; i++) {
                        if (reservar[i] == null) {
                            System.out.println((i + 1) + "  " + nuPiso[i]);
                        }
                    }
                    
                    System.out.print("Seleccione un piso (número): ");
                    int seleccionar = scanner.nextInt()-1;
                    
                    if (reservar[seleccionar] != nuPiso) {
                        System.out.println("El numero de piso es. Por favor, elija otro.");
                    }
                    else {
                        System.out.print("Ingrese el numero de piso: ");
                        String numeroPiso = scanner.next();
                        

                        reservar[seleccionar] = new Piso(numeroPiso);
                        System.out.println("Reserva realizada con éxito");
                    }
            }
                case 3 -> {
                    System.out.println("¡el precio por habitaciones !");
                    int Habitacionpiso1 = 1000;
                    int Habitacionpiso2 = 2000;
                    int Habitacionpiso3 = 3000;
                    int Habitacionpiso4 = 4000;
                    
                    System.out.println("escoja el precio de habitacion");
                    System.out.print("el precio es");
            }
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        
        
        
        
    

}
    
    
}
