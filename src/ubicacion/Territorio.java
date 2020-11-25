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
public class Territorio implements Comparable<Territorio>{
    private String nombre;
    private double poblacion;
    private double area;

    public Territorio(String nombre) {
        this.nombre = nombre;
    }

    public Territorio(String nombre, double poblacion, double area) {
        this(nombre);
        this.poblacion = poblacion;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPoblacion() {
        return poblacion;
    }

    @Override
    public int compareTo(Territorio territorio2) {
        return this.nombre.compareTo(territorio2.nombre);
    }
    
}
