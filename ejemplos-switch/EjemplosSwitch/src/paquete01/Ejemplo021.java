/*
//Dia: 7 
  Mes: 2 
  year: 19809 

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int diaNacimiento;
        int mesNacimiento;
        int yearNacimiento;
        
        System.out.println("Ingrese su dia de Nacimiento");
        diaNacimiento = entrada.nextInt();
        System.out.println("Ingrese su mes de Nacimiento");
        mesNacimiento = entrada.nextInt();

        System.out.println("Ingrese su año de Nacimiento");
        yearNacimiento = entrada.nextInt();

        String mesCadena = "";
        switch (mesNacimiento){
            case 1:
               mesCadena = "enero";
                break;

            case 2:
                 mesCadena = "febrero";
                
                break;

           

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }
}
