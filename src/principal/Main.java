/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import data.ReadRefPoint;
import java.util.ArrayList;
import java.util.PriorityQueue;
import ubicacion.Ciudad;
import ubicacion.Pais;
import ubicacion.PuntoReferencia;

/**
 *
 * @author USER
 */
public class Main {

    private static ArrayList<Pais> paises;
    
    private static void datosIniciales(){
        paises = new ArrayList<>();
        
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Ciudad guayaquil = new Ciudad("Guayaquil");
        Ciudad quito = new Ciudad("Quito");
        ciudades.add(guayaquil);
        ciudades.add(quito);

        Pais ec = new Pais("Ecuador");
        ec.setCiudades(ciudades);
        
        paises.add(ec);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datosIniciales();
        boolean continuar = true;
        
        PriorityQueue<PuntoReferencia> colaP = ReadRefPoint.readFile("/resources/Guayaquil");
        
        while (continuar){
            
        }
    }

    
}