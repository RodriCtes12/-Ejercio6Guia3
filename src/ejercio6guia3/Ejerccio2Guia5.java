
package ejercio6guia3;

import java.util.Scanner;


public class Ejerccio2Guia5 {

    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int vector[]= new int [20];
        
         for (int i = 0; i < 20; i++) {
            vector[i]=  (int)(Math. random()*10+1);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("["+ vector[i]+ "]");
        }
        System.out.println("-----------");
        System.out.println("elija un numero para ver si se encuentra en el vector"); 
        int num = sc.nextInt();
        int cont = 0;
        int pos = -1;
        for (int i = 0; i < 20; i++) {
           if (vector[i]==num){
               cont ++;
               pos = i;
               System.out.println("el numero ingresado esta " + cont + 
                       " veces" + " y esta en la posicion "+ i);
           }
            
        } 
        
    }
    
}
