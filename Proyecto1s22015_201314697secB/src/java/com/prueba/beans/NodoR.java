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
public class NodoR {
    
    String nombre;
    ListaDoblementeEnlazadaR lista;
    public NodoR siguiente;
    public NodoR anterior;
    
    public NodoR(String nombre, String nombre2){
        this(nombre, nombre2 ,null,null);
    }
    
    public NodoR(String nombre, String nombre2, NodoR siguiente, NodoR anterior)
    {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.nombre= nombre;
        lista = new ListaDoblementeEnlazadaR();
        this.lista.insertar(nombre,nombre2);
    } 
}
