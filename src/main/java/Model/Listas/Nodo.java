/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Listas;

import Model.Monomio;

/**
 *
 * @author Jahir Gómez
 */
public class Nodo {
    public Monomio dato;
    public Nodo siguiente;
    
    public Nodo(){}
    
    public Nodo (Monomio dato){
        this.dato = dato;
        siguiente = null;
    }
    
    public Nodo (Monomio dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public Monomio getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato (Monomio dato){
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
