/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Rafael
 */
public class Compare {
    public int compare(float puntaje1,float puntaje2, long longitud1, long longitud2,long latitud1,long latitud2){
        if(puntaje1>puntaje2)return -1;
        else if( puntaje1==puntaje2){
            if(longitud1>longitud2)return -1;
            else if(longitud1==longitud2){
                if(latitud1>latitud2)return-1;
                else return 1;
            }
        }
        return 0;
        
    }
}
