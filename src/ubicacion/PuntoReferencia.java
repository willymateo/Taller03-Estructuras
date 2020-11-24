/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicacion;

/**
 *
 * @author Willy Mateo
 */
public class PuntoReferencia {
    private Coordenada coord;
    private double puntaje;
    private String nombre;

    public Coordenada getCoord() {
        return coord;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
}
