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
public class ListaDoblementeEnlazadaB {
    private NodoB inicio,fin;
    
    public ListaDoblementeEnlazadaB(){
        inicio=fin=null;
    }
    
    //metodo para si esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //agregar al final
    public void agregarAlFinal(int id){
        if(estaVacia()){
            inicio=fin=new NodoB(id);
        }else{
            fin = new NodoB(id,null,fin);
            fin.anterior.siguiente=fin;
        }
        //System.out.println(fin.dato);
    }
    
    //agregar al inicio
    public void agregarAlInicio(int id){
        if(estaVacia()){
            inicio=fin=new NodoB(id);
        }else{
            inicio=new NodoB(id,inicio,null);
            inicio.siguiente.anterior = inicio;
        }
        //System.out.println(inicio.dato);
    }
    
    //mostrar lista de inicio a fin
    public void mostrarListaInicioFin(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoB auxiliar = inicio;
            while(auxiliar!=null){
                datos = datos + " "+auxiliar.id+ " <=>";
                auxiliar = auxiliar.siguiente;
            }
            System.out.println(datos);
        }
    }
    
    public NodoB getInicio(){
        return inicio;
    }
    
    
    void Ordenar(NodoB lista) {
        NodoB aux1, aux2;
        int t;
        aux1 = lista;
        while (aux1.siguiente != null) {
            aux2 = aux1.siguiente;
            while (aux2 != null) {
                if (aux1.id > aux2.id) {
                    t = aux2.id;
                    aux2.id = aux1.id;
                    aux1.id = t;
                }
                aux2 = aux2.siguiente;
            }
            aux1 = aux1.siguiente;
            aux2 = aux1.siguiente;
        }
        System.out.println("lista Ordenada");
    }
    
    //buscar
    public String buscar(int d){
        String hola = null;
        boolean valor = false;
        if(estaVacia()==true){
            System.out.println("lista vacia");
        }
        else
        {
            NodoB auxiliar = fin;
            while(auxiliar!=null){
                if(auxiliar.id == d){
                    valor = true;
                }
                auxiliar = auxiliar.anterior;
            }
            if(valor ==true){
               System.out.println("encontrado"); 
               hola = "encontrado";
            }
            else
            {
                System.out.println("no encontrado");
                hola = "no encontrado";
            }
        }
        return hola;
    }
    
    //metodo lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoB auxiliar = fin;
            while(auxiliar!=null){
                datos = datos + "<=>" + auxiliar.id+ "<=>";
                auxiliar = auxiliar.anterior;
            }
           System.out.println(datos);
        }
    }
    
    //metodo para eliminar del inicio
    public int eliminarDelInicio(){
        int elemento = inicio.id;
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
    public int eliminarDelFinal(){
        int elemento = fin.id;
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
