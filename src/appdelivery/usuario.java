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
public abstract class usuario {
    Scanner entrada = new Scanner(System.in);
    String nombre;
   
    public usuario (String _nombre){
    this.nombre = _nombre; 
    }
    
    public String getNombre () {
    return nombre; 
    }
}