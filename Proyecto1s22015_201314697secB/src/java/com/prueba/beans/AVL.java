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
public class AVL {
    
    
    private NodoA raiz;
    private NodoA Aux, Aux2;
    private boolean apuntado = false;
    private boolean apuntados = false;
    
    public AVL()
    {
        raiz = null;
    }
    
    public NodoA obtenerRaiz()
    {
        return raiz;
    }
    
    
    public NodoA buscar(String correo, int d, NodoA r){
        if(raiz==null)
        {
            return null;
        }
        else if(r.dato == d)
        {
            return r;
        }
        else if(r.dato < d)
        {
            return buscar(correo, d, r.hijoDerecho);
        }
        else
        {
            return buscar(correo, d, r.hijoIzquierdo);
        }
    }
    
    public int obtenerFE(NodoA x){
        if(x==null)
        {
            return -1;
        }
        else
        {
            return x.fe;
        }
    }
    
    //rotacion simple a la izquierda
        public NodoA rotacionIzquierda(NodoA c){
            NodoA auxiliar = c.hijoIzquierdo;
            c.hijoIzquierdo = auxiliar.hijoDerecho;
            auxiliar.hijoDerecho = c;
            
            c.fe = Math.max(obtenerFE(c.hijoIzquierdo),obtenerFE(c.hijoDerecho)) + 1;
            auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo),obtenerFE(auxiliar.hijoDerecho)) + 1;
             
            return auxiliar;
        }
        
    //rotacion simple a la Derecha
        public NodoA rotacionDerecha(NodoA c){
            NodoA auxiliar = c.hijoDerecho;
            c.hijoDerecho = auxiliar.hijoIzquierdo;
            auxiliar.hijoIzquierdo = c;
            
            c.fe = Math.max(obtenerFE(c.hijoIzquierdo),obtenerFE(c.hijoDerecho)) +1;
            auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo),obtenerFE(auxiliar.hijoDerecho)) +1;
             
            return auxiliar;
        }
        
    // rotacion IZQUIERDA-DERECHA
        public NodoA rotacionDobleIzquierda(NodoA c){
            NodoA temporal;
            c.hijoIzquierdo = rotacionDerecha(c.hijoIzquierdo);
            temporal = rotacionIzquierda(c);
            return temporal;
        }
  
    // rotacion DERECHA-IZQUIERDA
        public NodoA rotacionDobleDerecha(NodoA c){
            NodoA temporal;
            c.hijoDerecho = rotacionIzquierda(c.hijoDerecho);
            temporal = rotacionDerecha(c);
            return temporal;
        }
        
    //metodo para insertar AVL 
        public NodoA insertarAVL(NodoA nuevo, NodoA subAr){
            NodoA nuevoPadre = subAr;
            if(nuevo.dato<subAr.dato)
            {
                if(subAr.hijoIzquierdo == null)
                {
                    subAr.hijoIzquierdo = nuevo;
                }
                else
                {
                    subAr.hijoIzquierdo = insertarAVL(nuevo,subAr.hijoIzquierdo);
                    if(obtenerFE(subAr.hijoIzquierdo) - obtenerFE(subAr.hijoDerecho)== 2)
                    {
                        if(nuevo.dato<subAr.hijoIzquierdo.dato)
                        {
                            nuevoPadre = rotacionIzquierda(subAr);
                        }
                        else
                        {
                            nuevoPadre = rotacionDobleIzquierda(subAr);
                        }
                    }
                }
            }
            else if(nuevo.dato > subAr.dato)
            {
                if(subAr.hijoDerecho == null)
                {
                    subAr.hijoDerecho = nuevo;
                }
                else
                {
                    subAr.hijoDerecho = insertarAVL(nuevo,subAr.hijoDerecho);
                    if(obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoIzquierdo)== 2)
                    {
                        if(nuevo.dato>subAr.hijoDerecho.dato)
                        {
                            nuevoPadre = rotacionDerecha(subAr);
                        }
                        else
                        {
                            nuevoPadre = rotacionDobleDerecha(subAr);
                        }
                    }
                }
            }
            else
            {
                System.out.println("NODO DUPLICADO");
            }
            
            //Actualizar altura
            if((subAr.hijoIzquierdo==null)&&(subAr.hijoDerecho!=null))
            {
                subAr.fe=subAr.hijoDerecho.fe +1;
            }
            else if((subAr.hijoDerecho==null) && (subAr.hijoIzquierdo!=null))
            {
                subAr.fe=subAr.hijoIzquierdo.fe +1;
            }
            else
            {
                subAr.fe =Math.max(obtenerFE(subAr.hijoIzquierdo),obtenerFE(subAr.hijoDerecho))+1;
            }
           return nuevoPadre;

        }
        
        //metodo para insertar
        public void insertar(String correo,String contraseña, String tipo, int id)
        {
            NodoA nuevo = new NodoA(correo,contraseña,tipo, id);
            
            if(raiz == null)
            {
                raiz = nuevo;
            }
            else
            {
                raiz = insertarAVL(nuevo,raiz);
            }
        }
        
        //metodo para eliminar
        public void eliminar(int llave)
        {
            eliminar(llave,raiz);
        }
        
        public void eliminar(int llave,NodoA A)
        {
            if(raiz.hijoIzquierdo!=null || raiz.hijoDerecho!=null)
            {
                if(A!=null)
                {
                    if(A.dato<llave)
                    {
                        eliminar(llave,A.hijoDerecho);
                        if(apuntado==true)
                        {
                            A.hijoDerecho=Aux;
                            apuntado=false;
                        }
                    }
                    else
                    {
                        if(A.dato>llave)
                        {
                            eliminar(llave,A.hijoIzquierdo);
                            if(apuntado==true)
                            {
                                A.hijoIzquierdo=Aux;
                                apuntado=false;
                            }
                        }
                        else
                        {
                            if(A.dato==llave)
                            {
                                apuntado=true;
                                if(A.hijoIzquierdo == null)
                                {
                                    Aux = A.hijoDerecho;
                                }
                                else
                                {
                                    if(A.hijoDerecho == null)
                                    {
                                        Aux = A.hijoIzquierdo;
                                    }
                                    else
                                    {
                                    System.out.println("REMPLAZAR");//Aux=Reemplazar(A,A,true);                   
                                    }
                                }  
                            }
                        }
                    }
                }
            }
            else
            {
            raiz=null;
            }
        }
     
    private NodoA Reemplazar(NodoA A,NodoA buscado,boolean estado){
        boolean Apuntado2 = false;
        if(estado==true){
         Reemplazar(A.hijoIzquierdo,buscado,false);
         if(buscado.hashCode()==raiz.hashCode()){
              raiz=Aux2;
         }
         if(Aux2.hashCode()!=buscado.hijoIzquierdo.hashCode()){
            Aux2.hijoIzquierdo=buscado.hijoIzquierdo; buscado.hijoIzquierdo=null;
         }else{Aux2.hijoIzquierdo=null;buscado.hijoIzquierdo=null;}
            Aux2.hijoDerecho = buscado.hijoDerecho;   buscado.hijoDerecho=null;
        }else{
        if(A.hijoDerecho==null){
            Aux2=A;
            Apuntado2=true;
        }else{ 
            Reemplazar(A.hijoDerecho,buscado,estado);
            if(Apuntado2==true){
                A.hijoDerecho=Aux2.hijoIzquierdo;
                Apuntado2=false;
            }
         }
     }
      return Aux2;
     }    
    
        //metodo para recorrer
        public void inOrden(NodoA r){
            if(r!=null){
                inOrden(r.hijoIzquierdo);
                System.out.println(r.Correo + ",");
                inOrden(r.hijoDerecho);
            }
        }
        
        public void preOrden(NodoA r){
            if(r!=null){
                System.out.println(r.Correo + ",");
                inOrden(r.hijoIzquierdo);
                inOrden(r.hijoDerecho);
            }
        }
        
        public void postOrden(NodoA r){
            if(r!=null){
                inOrden(r.hijoIzquierdo);
                inOrden(r.hijoDerecho);
                System.out.println(r.Correo + ",");
            }
        }
    
    
}
