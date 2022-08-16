/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appdelivery;

import java.util.Scanner;

/**
 *
 * @author Fabricio Laureano
 */
public class AppDelivery {

    /**
     * @param args the command line arguments
     */


      public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
        System.out.println("MENU");
        System.out.println("1. Cliente");
        System.out.println("2. Vendedor");
        System.out.println("3. Repartidor");
        System.out.println("4. Salir ");
        System.out.print("Elija el usuario al que corresponde: ");


        opcion= entrada.nextInt(); 
        
        
        
      if (opcion == 1) {
              cliente customer = new cliente("Fabricio","Col. Fesitranh","Hamburguesa", 2000);
              System.out.println("\n");
                customer.mostrarDatosCliente(); 
                } 
      
      if (opcion ==2) {
               vendedor seller = new vendedor ("Johan", 4736383);
               System.out.println("\n");
               seller.mostrarDatosVendedor();
              }
      if (opcion ==3) {
                repartidor delivery = new repartidor ("Carlos ","40 minutos");
                System.out.println("\n");
                delivery.mostrarDatosRepartidor();
      }
        }
        while(opcion!=4);
        }
    }