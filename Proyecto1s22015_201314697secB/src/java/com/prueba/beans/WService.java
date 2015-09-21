/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.beans;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author usuario
 */
@WebService(serviceName = "WService")
public class WService {

    /**
     * This is a sample web service operation
     */
    
    ListaDoblementeEnlazadaB list = new ListaDoblementeEnlazadaB();
    ListaDoblementeEnlazadaL listaArbol = new ListaDoblementeEnlazadaL();
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return "hola" + nombre + ":D";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarBus")
    public String agregarBus(@WebParam(name = "bus") String bus) {
        //TODO write your implementation code here:
        list.agregarAlInicio(Integer.parseInt(bus));
        list.mostrarListaInicioFin();
        
        return "Agregado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaArbol")
    public String ListaArbol(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Contrase\u00f1a") String Contraseña) {
        //TODO write your implementation code here:
        listaArbol.insertar(Nombre, Contraseña, "Estacion Clave", 0);
        listaArbol.mostrarListaInicioFin();
        return "Agregado";
    }
}
