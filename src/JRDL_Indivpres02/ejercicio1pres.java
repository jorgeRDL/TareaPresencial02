
package JRDL_Indivpres02;

import java.util.Scanner;
public class ejercicio1pres {
     public static void main(String[] args) {
     String edad = "";
        int n;
        System.out.println("Escriba una edad:");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        
        if (n > 0 && n < 18) {
            edad = " menor de edad";
        }  else if  (n >= 18 ) {
            edad = " mayor de edad";
    }
        System.out.println("Eres:" + edad);

    }
    
}
