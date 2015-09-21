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
public class NodoA {
    String Correo;
    String Contraseña;
    String Tipo;
    int dato;
    int fe;
    NodoA hijoDerecho, hijoIzquierdo;
    
    public NodoA(String C, String Con, String T, int I ){
        this(C, Con, T, I ,null,null);
    }
    
    public NodoA(String C, String Con, String T, int id, NodoA hijoDerecho, NodoA hijoIzquierdo)
    {
        this.Correo = C;
        this.Contraseña = Con;
        this.Tipo = T;
        this.dato = id;
        this.fe=0;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }    
    
}
