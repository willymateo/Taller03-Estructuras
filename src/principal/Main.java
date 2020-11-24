/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
        boolean Inicio = true;  
       
        String opcion = Util.desplegarMenu();
        while (Inicio){
            switch(opcion)
            {
                case "1":
                break;
                
                case "2":
                break;
                
                default:
                    Inicio = false;
                break;
            }
        }
    }
}
}