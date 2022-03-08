package Model;

import Model.Listas.ListaDoble;
import Model.Listas.NodoDoble;

public class Polinomio extends ListaDoble{
    public Polinomio (){

    }

    public Polinomio suma (Polinomio a) {
        Polinomio nuevoPolinomio = new Polinomio();
        for (int i=6; i>=0; i--){
            NodoDoble actual = this.inicio;
            NodoDoble actualA = a.inicio;
            Monomio nuevoMonomio = new Monomio(0, i);
            int flag=0;
            while (actual != null && actualA != null){
                if(actual.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()+actual.dato.getCoeficiente());
                    flag++;
                }
                actual=actual.siguiente;

                if (actualA.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()+actualA.dato.getCoeficiente());
                    flag++;
                }
                actualA=actualA.siguiente;

                if (flag==2){
                    break;
                }
            }
            if (nuevoMonomio.coeficiente != 0){
                nuevoPolinomio.insertaOrdenado(nuevoMonomio);
            }
        }

        return nuevoPolinomio;
    }

    public Polinomio resta (Polinomio a) {
        int i=0;
        NodoDoble actualA = a.inicio;
        while (i<6 && actualA != null){
            NodoDoble actual = this.inicio;

            int flag=0;
            while (actual != null){
                if(actualA.dato.getGrado() == actual.dato.getGrado()){
                    actual.dato.setCoeficiente(actual.dato.getCoeficiente()-actualA.dato.getCoeficiente());
                    flag++;
                }

                if (flag==1){
                    break;
                }

                actual=actual.siguiente;
            }
            if (flag == 0){
                Monomio nuevoMonomio = new Monomio((actualA.dato.getCoeficiente()*-1), (actualA.dato.getGrado()));
                this.insertaOrdenado(nuevoMonomio);
            }
            actualA=actualA.siguiente;
        }

        return this;
    }

    public Polinomio multiplica (Polinomio a){
        Polinomio nuevoPolinomio = new Polinomio();
        NodoDoble actual = this.inicio;
        while (actual!=null){
            NodoDoble aux = a.inicio;
            while (aux!=null){
                Monomio nuevoMonomio = new Monomio((actual.dato.coeficiente*aux.dato.coeficiente), (actual.dato.grado+aux.dato.grado));
                nuevoPolinomio.insertaOrdenado(nuevoMonomio);
                aux=aux.siguiente;
            }
            actual=actual.siguiente;
        }

        return nuevoPolinomio;
    }

    public Polinomio multiplicarPorEscalar (int a){
        Polinomio nuevoPolinomio = new Polinomio();
        NodoDoble actual = this.inicio;
        while (actual!=null){
            Monomio nueMonomio = new Monomio((a*actual.dato.coeficiente), actual.dato.grado);
            nuevoPolinomio.insertaOrdenado(nueMonomio);
            actual=actual.siguiente;
        }

        return nuevoPolinomio;
    }

    public void sortList() { 
        int i = 0;
        NodoDoble current = null, index = null;
        Monomio temp = new Monomio(0,i);
        //Check whether list is empty
        if(inicio == null) {
            return;
        }
        else {
            //Current will point to head
            for(current = inicio; current.siguiente != null; current = current.siguiente) {
                //Index will point to node next to current
                for(index = current.siguiente; index != null; index = index.siguiente) {
                    //If current's data is greater than index's data, swap the data of current and index
                    if(current.dato.grado < index.dato.grado) {
                        temp = current.dato;
                        current.dato = index.dato;
                        index.dato = temp;
                    }
                }
            }
        }
    }
}