/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicacion;

import java.util.PriorityQueue;

/**
 *
 * @author Rafael
 */
public class Ciudad extends Territorio{
    private PriorityQueue<PuntoReferencia> puntosRef;

    public Ciudad(String nombre) {
        super(nombre);
    }
    
    public Ciudad(PriorityQueue<PuntoReferencia> puntosRef, String nombre, double poblacion, double area) {
        super(nombre, poblacion, area);
        this.puntosRef = puntosRef;
    }

    public PriorityQueue<PuntoReferencia> getPuntosRef() {
        return puntosRef;
    }

    public void setPuntosRef(PriorityQueue<PuntoReferencia> puntosRef) {
        this.puntosRef = puntosRef;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
