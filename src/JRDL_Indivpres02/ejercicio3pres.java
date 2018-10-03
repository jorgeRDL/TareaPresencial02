
package JRDL_Indivpres02;

import java.util.Scanner;


public class ejercicio3pres {
    public static void main(String[] args){
    
     
        Scanner teclado = new Scanner(System.in);
         int mes;       
        do{
        System.out.print("Introduce el numero del mes ");
        mes = teclado.nextInt();
        if (mes < 1 || mes > 12)System.out.println("Error");
         } while (mes < 1 || mes >12);
    switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
        case 11:
        System.out.println("El mes"+ mes+"Tiene 31 dias");
        break;
        case 2:
        System.out.println("Este mes tiene 28 dias");
        break;
        case 4:
        case 6:
        case 8:
        case 10:
        case 12:
        System.out.println("El mes"+ mes+"Tiene 30 dias");
        break;
    }

    }
    
}
