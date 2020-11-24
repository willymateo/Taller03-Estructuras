/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import data.Comparador;
import data.ReadRefPoint;
import java.util.PriorityQueue;
import ubicacion.PuntoReferencia;
import util.Util;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     {
        String accion1;
        String accion2;
        boolean Inicio = true;  
        
        
       
        String opcion = Util.desplegarMenu();
        PriorityQueue<PuntoReferencia> colaP = new PriorityQueue<>(new Comparador());
        while(!ReadRefPoint.readFile().isEmpty()){
            
        }
        while (Inicio){
            switch(opcion)
            {
                case "1":
                    accion1 = Util.menuCiudades();
                    if (accion1.equals("1")){
                      Util.cantPuntosTurist();   
                    }
                    if(accion1.equals("2")){
                        opcion = Util.desplegarMenu();
                    }
                break;
                
                case "2":
                    accion2 = Util.menuCiudades();
                    if (accion2.equals("1")){
                      Util.cantPuntosTurist();   
                    }
                    if(accion2.equals("2")){
                        opcion = Util.desplegarMenu();
                    }
                break;
                
                default:
                    Inicio = false;
                break;
            }
        }
    }
}
}