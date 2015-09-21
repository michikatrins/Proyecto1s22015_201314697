/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // LEER ARCHIVO
        leerArchivo lee = new leerArchivo();
        try {
            lee.leer("leer.txt");
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // LISTA DE BUSES
        ListaDoblementeEnlazadaB listaB = new ListaDoblementeEnlazadaB();
        
        listaB.agregarAlFinal(10);
        listaB.agregarAlInicio(20);
        listaB.agregarAlFinal(30);
        listaB.agregarAlInicio(40);
        listaB.agregarAlFinal(50);
        listaB.agregarAlInicio(60);
        listaB.Ordenar(listaB.getInicio());
        listaB.mostrarListaInicioFin();
        
        listaB.buscar(10);
        listaB.buscar(80);
        listaB.buscar(20);
        
        //Arbol De Estaciones 
        
        ArbolAVL arbol = new ArbolAVL();
        
        arbol.insertar(1, "Estructuras", "luna" , "Estacion General" );
        arbol.insertar(6, "Orga", "sol", "Estacion General");
        arbol.insertar(5, "Compi", "estrella", "Estacion General");
        arbol.insertar(10, "Ipc2", "marte", "Estacion General");
        arbol.insertar(13, "Ipc1", "pluton", "Estacion General");
        arbol.insertar(16, "lenguajes", "tierra", "Estacion General");
        arbol.insertar(17, "Archivos" , "mercurio", "Estacion General");
        System.out.println("SE INSERTO TODOS LOS ELEMENTOS");
        arbol.preOrden(arbol.obtenerRaiz());
        System.out.println("SE ELIMINO TODOS LOS ELEMENTOS");
        arbol.eliminar(1);
        arbol.eliminar(13);
        arbol.preOrden(arbol.obtenerRaiz());
        System.out.println("SE ELIMINO UNA RAIZ");
        arbol.eliminar(16);
        arbol.preOrden(arbol.obtenerRaiz());
        
        //Asignar Buses
        ListaDoblementeEnlazada list = new ListaDoblementeEnlazada();
        list.agregarAlFinal(10, "nom" , 15, "19:00", "12:00", "19/09/20");
        list.agregarAlInicio(20,"A",10,"12:00","14:00","19/09/2015");
        list.agregarAlFinal(30, "B", 15,"12:00","14:00","19/09/2015");
        list.agregarAlInicio(40, "C", 10,"12:00","14:00","19/09/2015");
        list.agregarAlFinal(50, "D", 10,"12:00","14:00","19/09/2015");
        list.agregarAlInicio(60, "E", 10,"12:00","14:00","19/09/2015");
        list.Ordenar(list.getInicio());
        list.mostrarListaInicioFin();
        list.buscar(10);
        list.buscar(80);
        list.buscar(20);
        
        
        System.out.println("LISTA");
        
        //Asignar Administradores
        ListaDoblementeEnlazadaL listaArbol = new ListaDoblementeEnlazadaL();
        
        listaArbol.insertar("Mario", "123", "Administrador", 12);
        listaArbol.insertar("Daniel", "123","Administrador", 13);
        listaArbol.insertar("Juan", "123", "Administrador", 14);
        listaArbol.insertar("Goido", "123", "Administrador", 15);
        listaArbol.insertar("Serena", "123", "Administrador", 16);
        listaArbol.mostrarListaInicioFin();
        
        
       //RUTAS
        
        ListaDoblementeEnlazadaR ruta = new ListaDoblementeEnlazadaR();
        ruta.insertar("mishel","amore");
    }
    
}
