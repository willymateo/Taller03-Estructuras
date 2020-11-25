/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.Scanner;
import ubicacion.Ciudad;

/**
 *
 * @author USER
 */
public class Util {
    private static Scanner sc = new Scanner(System.in);
    
    public static int MenuCiudad(ArrayList<Ciudad> ciudades) {
        System.out.println("\t****Ciudades****");
        System.out.println("Menú de Opciones\n");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(i+1 +". " +ciudades.get(i));
        }
        System.out.println(ciudades.size()+1 +". Salir" );
        return pedirOp();
    }

    public static int menuPuntosRef() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de puntos turísticos que desea consultar.");
        return pedirOp();
    }
    
    private static int pedirOp(){
        System.out.print("Su opción:\t");
        Integer opcion = Integer.valueOf(sc.nextLine());
        return opcion;
    }
}
