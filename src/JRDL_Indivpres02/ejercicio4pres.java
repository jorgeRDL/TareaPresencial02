
package JRDL_Indivpres02;

import java.util.Scanner;


public class ejercicio4pres {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero para calcular factorial ");
        int n=teclado.nextInt();
        int fac=1;
        for(int x=0; x< n+1; x++){
            if (x==0){
                x=1;
            }
            fac=fac*x;
        }
        System.out.println("El resultado de calcular factorial es"+ fac);
    }
    
    
}
