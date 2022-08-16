/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdelivery;

import java.util.Scanner;

/**
 *
 * @author Fabricio Laureano
 */
public class cliente extends usuario{
    protected String direccion;
   protected  String producto;
   protected  int precio; 
    
    public cliente(String _nombre, String _direccion, String _producto, int _precio){
    super (_nombre);
    this.direccion=_direccion;
    this.producto=_producto;
    this.precio=_precio;
    }

   public void mostrarDatosCliente(){
   
   System.out.println("Nombre: "+getNombre()+ " Direccion: "+direccion+ " El producto que lleva es: "+producto+ " El precio de producto es: "+precio);
   }  
}