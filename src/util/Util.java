/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Util {
    public static String desplegarMenu() {
        System.out.println("\t****Rutas turisticas****");
        System.out.println("Menú de Opciones");
        System.out.println("1. Ciudad1"
                + "2. Ciudad2" // Recordar que esto no es estatico
                + "3. Salir");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Su opción:");
        String opcion = sc.next();
        System.out.println("");
        return opcion;
    }
    
}
