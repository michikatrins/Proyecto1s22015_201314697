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
        ListaDoblementeEnlazadaB list = new ListaDoblementeEnlazadaB();
        list.agregarAlInicio(Integer.parseInt(bus));
        
        return list.buscar(Integer.parseInt(bus));
    }


    
}
