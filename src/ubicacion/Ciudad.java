/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicacion;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Ciudad extends Territorio{
    private ArrayList<PuntoReferencia> puntosRef;

    public Ciudad(ArrayList<PuntoReferencia> puntosRef, String nombre, double poblacion, double area) {
        super(nombre, poblacion, area);
        this.puntosRef = puntosRef;
    }

    public ArrayList<PuntoReferencia> getPuntosRef() {
        return puntosRef;
    }

}
