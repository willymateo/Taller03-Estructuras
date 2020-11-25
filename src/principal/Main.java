/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import data.ReadRefPoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import ubicacion.Ciudad;
import ubicacion.Pais;
import ubicacion.PuntoReferencia;
import util.Util;

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
        ciudades.add(quito);
        ciudades.add(guayaquil);

        Pais ec = new Pais("Ecuador");
        ec.setCiudades(ciudades);
        
        paises.add(ec);
    }
    
    private static void cargarArchivos(){
        for (Pais pais : paises) {
            for (Ciudad ciudad : pais.getCiudades()) {
                String filePath = "resources/" +ciudad +".txt";
                PriorityQueue<PuntoReferencia> refPoints = ReadRefPoint.readFile(filePath);
                ciudad.setPuntosRef(refPoints);
            }
            Collections.sort(pais.getCiudades());
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datosIniciales();
        cargarArchivos();
        boolean continuar = true;
        
        while (continuar){
            ArrayList<Ciudad> ciudades = paises.get(0).getCiudades();
            int opcion = Util.MenuCiudad(ciudades);
            
            if (opcion >= 1 && opcion<=ciudades.size()) {
                int cantPR = Util.menuPuntosRef();
                Ciudad ciudadSelec = ciudades.get(opcion-1);
                PriorityQueue<PuntoReferencia> copiaPF = new PriorityQueue<>();
                
                for (PuntoReferencia pR : ciudadSelec.getPuntosRef()) {
                    copiaPF.offer(pR);
                }
                
                for (int i = 0; i < cantPR; i++) {
                    System.out.println(i+1 +". " +copiaPF.poll());
                }
            }else if (opcion == ciudades.size()+1) {
                continuar = false;
            }
        }
    }

}