/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import cola.Cola;
import modelo.Personas;

/**
 *
 * @author valeria.garcia_perez
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cola<Personas> colaP= new Cola<>();
        colaP.encolar(new Personas("Valeria", "valeria@uao.edu.co"));
        colaP.encolar(new Personas("Sebastian", "Sebastian@uao.edu.co"));
        colaP.encolar(new Personas("Luisa", "Luisa@uao.edu.co"));
        
        
        System.out.println("Elementos en cola " +colaP.toString());
        
        for (int i = 0; i < 3; i++) {
            if(!colaP.estaVacia()){
                colaP.desencolar();
                 System.out.println("Elementos en cola " +colaP.toString());       
            }else{
                System.out.println("Cola vacia");
            }
            
        }
        
        colaP.desencolar();
        System.out.println("Elementos en cola " +colaP.toString());
    }
    
}
