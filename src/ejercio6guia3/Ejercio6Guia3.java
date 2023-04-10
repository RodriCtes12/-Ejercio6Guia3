/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
opción y el programa deberá mostrar el resultado por pantalla y 
luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez 
de salir del programa directamente, se debe mostrar el siguiente mensaje de 
confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a 
mostrar el menú.

 */
package ejercio6guia3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo y Ale
 */
public class Ejercio6Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
                     int num1 = 0, num2 = 0; 
                     int opcion=0, resultado =0;
                     boolean salir = false;
                     String repuesta ="S";
        
            System.out.println("Ingreda dos numeros");
           
            num1= entrada.nextInt();
            num2=entrada.nextInt();
          
            while  (!salir){
                System.out.println("------------------------------");
           
                System.out.println("Selecciona una opcion");
            System.out.println("1)sumar");
            System.out.println("2)resta");
            System.out.println("3)multiplica");
            System.out.println("4)divide");
            System.out.println("5)salir");
           //System.out.println("1)suma,2)resta,3)multiplica,4)divide");
             opcion= entrada.nextInt();
             //System.out.println("deseas continuar?");
                      //   repuesta = entrada.nextLine();
              
             switch (opcion){
                 case 1: 
                     
                     System.out.println("el resultado de tu suma es " + sumar(num1,num2));
                     
                     break;
                 case 2:
                     
                    System.out.println("el resultado de tu resta es " + restar( num1,num2));
                     
                     break;  
                  case 3:
                     
                    System.out.println("el resultado de tu multiplicacion es " + multiplicar( num1, num2));
                     
                     break;  
                     case 4:
                     
                    System.out.println("el resultado de tu division es " + dividir(num1,num2));
                     break; 
                     case 5 :
                         System.out.println("¿Estas seguro que deseas salir? (S/N)");
                         String respuesta = entrada.next();
                         if (respuesta.equalsIgnoreCase("S")){
                             salir = true;
                             
                         }
                         break;
                         }
                      
           }
             
                     
                        
                    }
                         
                         
                        
                     
    
             public static int sumar(int num1, int num2){
    	int suma;
    	suma = num1 + num2;
    	return suma;
	}
            
        public static int restar(int num1, int num2) {
    	int resta;
    	resta = num1 - num2;
    	return resta;
	}
        public static int multiplicar(int num1 , int num2) {
    	int multi;
    	multi = num1 * num2;
    	return multi;
	}

        public static int dividir(int num1, int num2) {
    	int divide;
    	divide= num1 / num2;
    	return divide;
	}
}

    

