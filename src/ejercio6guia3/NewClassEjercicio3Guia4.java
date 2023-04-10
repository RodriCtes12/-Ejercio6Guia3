/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una aplicación que a través de una función nos
convierta una cantidad de euros introducida por teclado a 
otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la 
moneda a convertir que será una cadena, este no devolverá
ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package ejercio6guia3;

import java.util.Scanner;

/**
 *
 * @author Rodrigo y Ale
 */
public class NewClassEjercicio3Guia4 {
    public static void main (String[] args) {
        //Scanner input = new Scanner(System.in);
         Scanner entrada = new Scanner(System.in);
        double dolar = 1.28611 , libras = 0.86 , yenes = 129.852; 
        
        int opcion = 0;
        double resultado = 0.0;
        double num = 0.0;
         boolean salir = false;
         //String repuesta = "";
         String repuesta ="S";
         
        System.out.print("Ingrese el monto euros a convertir ");
        
        
        num = entrada.nextDouble();
        

      while  (!salir){
            System.out.println("Selecciona una opcion");
            System.out.println("1)Cambia a dolar");
            System.out.println("2)Cambia a yenes");
            System.out.println("3)Cambia a libras");
            //System.out.println("4)divide");
            System.out.println("4)salir");
           //System.out.println("1)suma,2)resta,3)multiplica,4)divide");
             opcion= entrada.nextInt();
             //System.out.println("deseas continuar?");
                      //   repuesta = entrada.nextLine();
              
             switch (opcion){
                 case 1: 
                     
                     System.out.println("el resultado de tu suma es " + dolar1(num,dolar));
                     
                     break;
                 case 2:
                     
                    System.out.println("el resultado es " + yenes1( num,yenes));
                     
                     break;  
                 case 3:
                     
                   System.out.println("el resultado de tu multiplicacion es " + libras1( num,libras));
                     
                     break;  
                 //    case 4:
                     
                 //   System.out.println("el resultado de tu division es " + dividir(num1,num2));
                     case 4:
                         System.out.println("¿Estas seguro que deseas salir? (S/N)");
                         String respuesta = entrada.next();
                         if (respuesta.equalsIgnoreCase("S")){
                             salir = true;
                             
                         }
                         break;
                         }
                      
           }
             
                     
                        
     }
                         
                         
                        
                     
    
             public static double dolar1(double num, double dolar){
    	double suma;
        
    	suma = num * dolar;
    	return suma;
	}
            
        public static double yenes1(double num, double yenes) {
    	double resta;
    	resta = num - yenes;
    	return resta;
	}
        public static double libras1(double num , double libras) {
    	double multi;
    	multi = num * libras;
    	return multi;
	}
}
