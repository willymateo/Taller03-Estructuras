/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import ubicacion.Coordenada;
import ubicacion.PuntoReferencia;

/**
 *
 * @author Willy Mateo
 */
public class ReadRefPoint {
    public static ArrayList<PuntoReferencia> readFile(String filePath){
        ArrayList<PuntoReferencia> puntosRef = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            
            while ((line = br.readLine()) != null) {                
                String elementos[] = line.strip().split(",");
                String nombre = elementos[0].strip();
                double latitud = Double.parseDouble(elementos[1].strip());
                double longitud = Double.parseDouble(elementos[2].strip());
                double puntaje = Double.parseDouble(elementos[3].strip());
                Coordenada newCord = new Coordenada(latitud, longitud);
                PuntoReferencia newPointRef = new PuntoReferencia(newCord, puntaje, nombre);
                puntosRef.add(newPointRef);
            }
        } catch (IOException e) {
            System.out.println("Se han producido problemas al leer el archivo: \n" +filePath +"\n" +e.getMessage());
            return puntosRef;
        }
        return puntosRef;
    }
}
