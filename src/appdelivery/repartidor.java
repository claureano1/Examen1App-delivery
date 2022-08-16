/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdelivery;

/**
 *
 * @author Fabricio Laureano
 */
public class repartidor extends usuario{
     protected  String tiempoRepartir;
    
    
    public repartidor(String nombre, String tiempoRepartir ){
    super(nombre);
    this.tiempoRepartir=tiempoRepartir;
    }
   public void mostrarDatosRepartidor(){
   
   System.out.println("Nombre: "+getNombre()+" Tiempo de Entrega: " +tiempoRepartir);
   } 
}
