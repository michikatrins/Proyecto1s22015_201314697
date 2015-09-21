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
public class NodoArbolAVL {
    int dato, fe;
    String nombre, contraseña, tipo;
    
    NodoArbolAVL hijoDerecho, hijoIzquierdo;
    
    public NodoArbolAVL(int d, String n, String c, String t){
        this.dato=d;
        this.nombre = n;
        this.contraseña = c;
        this.tipo = t;
        this.fe=0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
}
