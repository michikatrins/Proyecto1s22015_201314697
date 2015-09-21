/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class leerArchivo {
    
    
    public void leer(String name) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(name)); 
        int contador = 1;
        String linea = null;
        
        while((linea = br.readLine())!= null){
            
            if(contador >= 2){
             StringTokenizer tokens = new StringTokenizer(linea, ","); 
            //Idbus,ruta,clavechofer,horarioinicio,horariofinalizacion,fecha
                String Idbus = tokens.nextToken().trim(); 
                String ruta = tokens.nextToken().trim(); 
                String clavechofer = tokens.nextToken().trim(); 
                String horarioinicio = tokens.nextToken().trim(); 
                String horariofinalizacion = tokens.nextToken().trim(); 
                String fecha = tokens.nextToken().trim();  
                
                if(Idbus==null){
                    System.out.println("se creo el buss");
                }
                if(ruta==null){
                    System.out.println("no hacer nada");
                }
                
                if(clavechofer== null){
                    System.out.println("se creo chofer");
                }
                
                
                System.out.println("" + Idbus);
                System.out.println("" + ruta);
                System.out.println("" + clavechofer);
                System.out.println("" + horarioinicio);
                System.out.println("" + horariofinalizacion);
                System.out.println("" + fecha);
                
                
            }
            contador = contador +1;
        }
    }
   
}
