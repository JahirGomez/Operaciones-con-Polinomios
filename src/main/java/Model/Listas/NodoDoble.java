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
public class NodoDoble extends Nodo{
    public NodoDoble siguiente;
    public NodoDoble anterior;
    
    public NodoDoble(){}
    
    public NodoDoble(Monomio dato, NodoDoble siguiente, NodoDoble anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NodoDoble(Monomio dato){
        this.dato = dato;
        siguiente = anterior = null;
    }

    /**
     * @return the siguiente
     */
    @Override
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    @Override
    public Monomio getDato (){
        return dato;
    }
    
    
}
