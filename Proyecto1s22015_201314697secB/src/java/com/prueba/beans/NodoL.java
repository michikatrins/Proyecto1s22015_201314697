/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

/**
 *
 * @author usuario
 */
public class NodoL {
    String Correo;
    String Contraseña;
    String Tipo;
    int id;
    
    public NodoL siguiente;
    public NodoL anterior;
            
    public NodoL(String C, String Con, String T, int I ){
        this(C, Con, T, I ,null,null);
    }
    
    public NodoL(String C, String Con, String T, int id, NodoL siguiente, NodoL anterior)
    {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.Correo = C;
        this.Contraseña = Con;
        this.Tipo = T;
        this.id = id;
    }   
    
    public String getCorreo(){
        return Correo;
    }
    
    public String getContraseña(){
        return Contraseña;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public int getId(){
        return id;
    }
    
    
    
    
}
