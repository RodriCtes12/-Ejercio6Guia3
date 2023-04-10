/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio6guia3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo y Ale
 */
public class Ejercicio2Guia3NombreYEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respuesta = "S";
          boolean n = false;
        
         // respuesta = false;
      // String nombre = "";
       //int edad = 0 ;
       int cantidad ;
       
       do {
            
       
         
    System.out.print("Ingrese un su nombre ");
          String   nombre = input.nextLine();
          
    input.nextLine();
   
    //input.close();
    System.out.print("Ingrese tu edad ");
     int edad  = input.nextInt();
     
       if (edad >= 18){
           
            System.out.println( nombre + " sos mayor de edad y tenes " + edad);
       } else {
           System.out.println(nombre + "sos menor y tenes " + edad );
           
         }
        System.out.println("Deseas ingresar mas personas? S/N");
       respuesta = input.next();
                        //if (respuesta.equalsIgnoreCase("S")){
                          //   n = true;
               } while (!respuesta.equalsIgnoreCase("n") );               
       }
           
    }
    
    

