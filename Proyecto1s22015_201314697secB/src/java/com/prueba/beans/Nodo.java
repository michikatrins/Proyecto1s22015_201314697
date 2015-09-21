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
public class Nodo {
    
    int id;
    String ruta;
    int clavechofer;
    String horarioInicio;
    String horarioFinal;
    String fecha;
    
    public Nodo siguiente;
    public Nodo anterior;
            
    public Nodo(int id, String ruta, int clavechofer, String horaIni, String horaFi, String fecha){
        this(id,ruta,clavechofer,horaIni,horaFi,fecha,null,null);
    }
    

    public Nodo(int id, String ruta, int clavechofer, String horaIni, String horaFi, String fecha, Nodo siguiente, Nodo anterior)
    {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.id = id;
        this.ruta = ruta;
        this.clavechofer = clavechofer;
        this.horarioInicio = horaIni;
        this.horarioFinal = horaFi;
        this.fecha = fecha;
    }
    
    /*
    public int getId()
    {
        return id;
    }
    
    public String getRuta()
    {
        return ruta;
    }
    
    public int getChofer()
    {
        return clavechofer;
    }
    
    public String gethorarioIni()
    {
        return horarioInicio;
    }
    
    public String gethorarioFinal()
    {
        return horarioFinal;
    }
    
    public String getFecha()
    {
        return fecha;
    }
    */
    
}
