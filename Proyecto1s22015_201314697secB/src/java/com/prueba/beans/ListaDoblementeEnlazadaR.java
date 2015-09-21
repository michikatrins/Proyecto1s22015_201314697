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
public class ListaDoblementeEnlazadaR {
    
    private NodoR inicio, fin;
    
    //Insertar en Cualquier 
    public void insertar(String C, String L){ 
        NodoR nuevo=new NodoR(C,L);
        String x="";
        
        x=nuevo.nombre;
            if(inicio==null)
            { 
                inicio=nuevo; 
            }
            else
            {       
                if(x.compareTo(inicio.nombre)<0)
                { 
                nuevo.siguiente=inicio;
                inicio=nuevo;
                }
                else
                { 
                NodoR auxiliar=inicio;
                fin=inicio;
                    while((x.compareTo(auxiliar.nombre)>=0) && (auxiliar.siguiente!=null))
                    { 
                        fin=auxiliar;
                        auxiliar=auxiliar.siguiente;
                    }
                    if(x.compareTo(auxiliar.nombre)>0)
                    { 
                        auxiliar.siguiente=nuevo;
                    }
                    else
                    { 
                        nuevo.siguiente=auxiliar;
                        fin.siguiente=nuevo;
                    } 
                } 
            }
        }      
    
   
    public ListaDoblementeEnlazadaR(){
        inicio=fin=null;
    }
    
    //metodo para si esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //agregar al final
    public void agregarAlFinal(String C, String L){
        if(estaVacia()){
            inicio=fin=new NodoR(C, L);
        }else{
            fin = new NodoR(C, L);
            fin.anterior.siguiente=fin;
        }
        //System.out.println(fin.dato);
    }
    
    //agregar al inicio
    public void agregarAlInicio(String C, String L){
        if(estaVacia()){
            inicio=fin=new NodoR(C, L);
        }else{
            inicio=new NodoR(C, L);
            inicio.siguiente.anterior = inicio;
        }
        //System.out.println(inicio.dato);
    }
    
    String nombre;
    //mostrar lista de inicio a fin
    public void mostrarListaInicioFin(){
        int contador = 1;
        if(!estaVacia()){
            String datos = "<=>";
            NodoR auxiliar = inicio;
            while(auxiliar!=null){
                nombre = auxiliar.nombre = nombre;
                datos = datos + " "+auxiliar.nombre + "<=>";
                auxiliar = auxiliar.siguiente;
                contador = contador + 1;
            }
            System.out.println(datos);
        }
    }
    
    
    
    public NodoR getInicio(){
        return inicio;
    }
    
    //buscar
    public boolean buscar(String nombre){
        boolean encontrado = false;
        boolean valor = false;
        if(estaVacia()==true){
            System.out.println("lista vacia");
        }
        else
        {
            NodoR auxiliar = fin;
            while(auxiliar!=null){
                if(auxiliar.nombre == nombre){
                    valor = true;
                }
                auxiliar = auxiliar.anterior;
            }
            if(valor ==true){
               encontrado = true;
            }
            else
            {
               encontrado = false;
            }
        }
        return encontrado;
    }
    
    //metodo lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoR auxiliar = fin;
            while(auxiliar!=null){
                datos = datos + "<=>" + auxiliar.nombre+ "<=>";
                auxiliar = auxiliar.anterior;
            }
           System.out.println(datos);
        }
    }
    
    //metodo para eliminar del inicio
    public String eliminarDelInicio(){
        String elemento = inicio.nombre;
        if(inicio==fin){
            inicio=fin=null;
        }
        else
        {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    //metodo para eliminar del final
    public String eliminarDelFinal(){
        String elemento = fin.nombre;
        if(inicio==fin){
            inicio=fin=null;
        }
        else
        {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }   
}
