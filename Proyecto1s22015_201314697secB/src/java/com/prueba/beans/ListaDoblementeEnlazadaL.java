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
public class ListaDoblementeEnlazadaL {
  
private NodoL inicio,fin;
    
    
    //Insertar en Cualquier 
    public void insertar(String C, String Con, String T, int I){ 
        NodoL nuevo=new NodoL(C, Con, T, I);
        String x="";
        
        x=nuevo.Correo;
        
        if(inicio==null)
        { 
        inicio=nuevo; 
        }
        else
        {       
        if(x.compareTo(inicio.Correo)<0)
        { 
            nuevo.siguiente=inicio;
            inicio=nuevo;
        }
        else
        { 
        NodoL auxiliar=inicio;
        fin=inicio;
        while((x.compareTo(auxiliar.Correo)>=0) && (auxiliar.siguiente!=null))
        { 
        fin=auxiliar;
        auxiliar=auxiliar.siguiente;
        }
        if(x.compareTo(auxiliar.Correo)>0)
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
    
    
    public ListaDoblementeEnlazadaL(){
        inicio=fin=null;
    }
    
    //metodo para si esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //agregar al final
    public void agregarAlFinal(String C, String Con, String T, int I){
        if(estaVacia()){
            inicio=fin=new NodoL(C, Con, T, I);
        }else{
            fin = new NodoL(C, Con, T, I,null,fin);
            fin.anterior.siguiente=fin;
        }
        //System.out.println(fin.dato);
    }
    
    //agregar al inicio
    public void agregarAlInicio(String C, String Con, String T, int I){
        if(estaVacia()){
            inicio=fin=new NodoL(C, Con, T, I);
        }else{
            inicio=new NodoL(C, Con, T, I,inicio,null);
            inicio.siguiente.anterior = inicio;
        }
        //System.out.println(inicio.dato);
    }
    
    AVL avl = new AVL();
    int ahora;
    String Correo, Contraseña, Tipo;
    //mostrar lista de inicio a fin
    public void mostrarListaInicioFin(){
        int contador = 1;
        if(!estaVacia()){
            String datos = "<=>";
            NodoL auxiliar = inicio;
            while(auxiliar!=null){
                ahora = auxiliar.id = contador;
                Correo = auxiliar.Correo;
                Contraseña = auxiliar.Contraseña;
                Tipo = auxiliar.Tipo;
                datos = datos + " "+auxiliar.id+ auxiliar.Correo +"<=>";
                auxiliar = auxiliar.siguiente;
                
                avl.insertar(Correo, Contraseña, Tipo ,ahora);
                contador = contador + 1;
            }
            avl.inOrden(avl.obtenerRaiz());
            System.out.println(datos);
        }
    }
    
    
    
    public NodoL getInicio(){
        return inicio;
    }
    
    
    public void Ordenar(NodoL lista) {
        NodoL aux1, aux2;
        String t;
        aux1 = lista;
        while (aux1.siguiente != null) {
            System.out.println(aux1.Correo);
            aux2 = aux1.siguiente;
            while (aux2!= null) {
                System.out.println(aux2.Correo);
                String a = aux1.Correo;
                String b = aux2.Correo;
        
                int comparison = a.compareTo(b);
                System.out.println(comparison);
                /*int result = (aux1.Correo.compareTo(aux2.Correo));
                //System.out.println("" + result);
                if ((aux1.Correo.compareTo(aux2.Correo)) == 0) {
                System.out.println("SON IGUALES");
                }
                else if (result > 0)
                {
                    System.out.println(aux1.Correo + ">" +aux2.Correo);
                    t = aux2.Correo;
                    aux2.Correo = aux1.Correo;
                    aux1.Correo = t;
                } 
                else if (result < 0){
                    System.out.println(aux1.Correo + "<" + aux2.Correo);
                    t = aux2.Correo;
                    aux2.Correo = aux1.Correo;
                    aux1.Correo = t;
                }
                */
                aux2 = aux2.siguiente;
            }
            aux1 = aux1.siguiente;
            aux2 = aux1.siguiente;
        }
        System.out.println("lista Ordenada");
    }
    
     public void Ordenando(NodoL lis) {
        NodoL aux1, aux2;
        aux2 = lis;
        int aux;
        while (aux2 != null) {
            aux1 = aux2.siguiente;
            while (aux1 != null) {
                String a = aux1.Correo;
                String b = aux2.Correo;
                int result = a.compareTo(b);
                System.out.println(result);
                if (result > 0) {
                    aux = aux2.id;
                    aux2.id = aux1.id;
                    aux1.id = aux;
                }
                else if(result < 0){
                    aux = aux2.id;
                    aux2.id = aux1.id;
                    aux1.id = aux;
                }
                aux1 = aux1.siguiente;
            }
            aux2 = aux2.siguiente;
        }
        System.out.println("Lista");
    }
    
    
    
    //buscar
    public void buscar(int d){
        boolean valor = false;
        if(estaVacia()==true){
            System.out.println("lista vacia");
        }
        else
        {
            NodoL auxiliar = fin;
            while(auxiliar!=null){
                if(auxiliar.id == d){
                    valor = true;
                }
                auxiliar = auxiliar.anterior;
            }
            if(valor ==true){
               System.out.println("encontrado"); 
            }
            else
            {
                System.out.println("no encontrado");
            }
        }
    }
    
    //metodo lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            String datos = "<=>";
            NodoL auxiliar = fin;
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
