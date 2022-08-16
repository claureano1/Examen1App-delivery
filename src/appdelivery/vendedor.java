/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdelivery;

/**
 *
 * @author Fabricio Laureano
 */
public class vendedor extends usuario{
    protected  int ID;
    
    
    public vendedor(String nombre, int codigo){
    super(nombre);
    this.ID=codigo;
    }
   public void mostrarDatosVendedor(){
   
   System.out.println("Nombre: "+getNombre()+"Codigo: "+ID);
   } 
}