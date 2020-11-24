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
public class Pais extends Territorio{
    private String idiomaOfficial; 
    private ArrayList<Ciudad> ciudades;

    public Pais(String nombre) {
        super(nombre);
    }

    public Pais(String idiomaOfficial, ArrayList<Ciudad> ciudades, String nombre, double poblacion, double area) {
        super(nombre, poblacion, area);
        this.idiomaOfficial = idiomaOfficial;
        this.ciudades = ciudades;
    }

    public String getIdiomaOfficial() {
        return idiomaOfficial;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
