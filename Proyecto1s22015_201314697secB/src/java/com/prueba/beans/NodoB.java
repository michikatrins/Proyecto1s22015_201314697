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
public class NodoB {
    int id;
    
    public NodoB siguiente;
    public NodoB anterior;
            
    public NodoB(int id){
        this(id,null,null);
    }
    
    public NodoB(int id, NodoB siguiente, NodoB anterior)
    {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.id = id;
    } 
}
