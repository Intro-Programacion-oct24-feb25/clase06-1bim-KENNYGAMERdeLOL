/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método para colocar las letras de forma minusculas
        // toUpperCase es un método para colocar las letras de forma mayusculas 
        //y en este caso se impre LOJA en mayusculas ya que al inicio hemos colocado solo 
        //una variable la cual nos dice que LOJA sera escrita de forma mayusculas
    }
}
