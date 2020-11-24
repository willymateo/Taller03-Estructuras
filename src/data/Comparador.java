/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Comparator;
import ubicacion.PuntoReferencia;

/**
 *
 * @author Rafael
 */
public class Comparador implements Comparator<PuntoReferencia>{

    @Override
    public int compare(PuntoReferencia o1, PuntoReferencia o2) {
        if(o2.getPuntaje()>o1.getPuntaje()) return 1;
        else if( o2.getPuntaje()== o1.getPuntaje()){
            if(o2.getCoord().getLongitud()> o1.getCoord().getLongitud())return 1;
            else if(o2.getCoord().getLongitud()==o1.getCoord().getLongitud()){
                if(o2.getCoord().getLatitud()>o2.getCoord().getLatitud()) return 1;
                
            }
            
            
        }
        return -1;
    }
    
    
}
