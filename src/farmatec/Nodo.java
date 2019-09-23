/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmatec;

/**
 *
 * @author J.I
 */
public class Nodo {
     //Se definen los atributos de la clase Nodo
        private ListaPedidos elemento;
        private Nodo next;
        //Se crea el constructor del Nodo especial
        public Nodo (){
            this.elemento = null;
            this.next = null;
        }
        /**
         * Se crea un constructor de Nodo, cuando el elemento sea el único o el último
         * @param elemento el elemento que se asignará
         */
        public Nodo (ListaPedidos elemento){
            this.elemento = elemento;
            this.next = null;
        }
        /**
         * Se crea otor constructor para nodo, el cual recibe un elemento y asigna al siguente
         * @param elemento el elemento que se asignará
         * @param next elemento al que se referenciará
         */
        public Nodo (ListaPedidos elemento, Nodo next){
            this.elemento = elemento;
            this.next = next;
        }
//Se crean los métodos de la clase Nodo
        /** Método para retornar el elemento
         * @return el elemento
         */
        public Object getElement() {
            return elemento;
        }

        /**Método para establecer el elemento
         * @param elemento el elemento a establecer
         */
        public void setElement(ListaPedidos elemento) {
            this.elemento = elemento;
        }

        /**Método para retornar el valor del siguiente elemento
         * @return el siguiente elemento
         */
        public Nodo getNext() {
            return next;
        }

        /**Método para establecer el siguiente elemento a referenciar
         * @param next el elemento a referenciar
         */
        public void setNext(Nodo next) {
            this.next = next;
        }
        
    
}
