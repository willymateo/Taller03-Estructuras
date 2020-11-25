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

    public PuntoReferencia(Coordenada coord, double puntaje, String nombre) {
        this.coord = coord;
        this.puntaje = puntaje;
        this.nombre = nombre;
    }

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

    @Override
    public String toString() {
        return nombre;
    }
    
}
