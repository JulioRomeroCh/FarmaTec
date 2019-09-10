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
public class listaFarmacias {
     public class Nodo {
        //Se definen los atributos de la clase Nodo
        private Object farmacia;
        private Nodo next;
        // Se crea un constructor de la clase Nodo, su función es ser el nodo especial para que no haya error de puntero nulo
        public Nodo (){
            this.farmacia = null;
            this.next = null;
        }
        /**
         * Se crea otro constructor, cuando el elemento sea el único en la lista
         * @param farmacia cuando el elemento es el único
         */
        public Nodo (Object farmacia){
            this.farmacia = farmacia;
            this.next = null;
        }
        /**
         * Se crea otro constructor, que su función sea asignar un elemento y referenciar al siguiente
         * @param farmacia asigna el elemento
         * @param next referencia el siguiente elemento
         */
        public Nodo (Object farmacia, Nodo next){
            this.farmacia = farmacia;
            this.next = next;
        }

        /**Método que retorna el objeto
         * @return el elemento
         */
        public Object getElement() {
            return this.farmacia;
        }

        /**Método para establecer el objeto
         * @param farmacia el objeto a establecer
         */
        public void setElement(Object farmacia) {
            this.farmacia = farmacia;
        }

        /** Método para retornar el siguiente objeto referente al puntero actual
         * @return el siguiente objeto
         */
        public Nodo getNext() {
            return this.next;
        }

        /**Método para establecer el siguiente elemento a referenciar
         * @param next establece el siguiente objeto a referenciar
         */
        public void setNext(Nodo next) {
            this.next = next;
        }
        
    } 
    //Atributos de la clase listaFarmacias
    private Nodo head;
    private Nodo current;
    private Nodo tail;
    private int posicion;
    private int tamaño;
    // Se crea el constructor por defecto de la clase ListaReproduccion, que asigne los valores por defecto a los atributos
    public listaFarmacias (){
        //Se definen los atributos de la clase
        this.head = new Nodo();
        this.current = this.head;
        this.tail = this.head;
        this.posicion = -1;
        this.tamaño = 0;
    }
    /**
     * Se crea un constructor que crea una lista vacía
     * @param farmacias lista vacía donde se almacenarán las canciones
     */
    public listaFarmacias (listaFarmacias farmacias){
    }
    
	/**
         * Método para agregar una canción al final de la lista
         * @param farmacia canción para agregar al final
         */
	public void append(Object farmacia) {
		//siempre se agrega al final de la lista
		Nodo newNode = new Nodo(farmacia);
		this.tail.setNext(newNode);
		this.tail = newNode;
		this.tamaño++;
	}
        public void remove() {
		//verificar que la lista no esté vacía
		if ((this.head == this.current) && (this.head == this.tail)){
			System.out.println("Lista vacía");
			return;
		}
                if (this.tamaño == 0){
                    System.out.println("Lista vacía");
                }
		
		Nodo temporal = this.head;
		while (temporal != this.current) {
			temporal = temporal.getNext();
		}
		//borrar la referencia al nodo actual
		temporal.setNext(this.current.getNext());
                System.out.println("ok");
		//necesario si se esta borrando el último nodo
              
                
		if (this.current == this.tail) {
			this.current = this.tail = temporal;
			this.posicion--;
                        System.out.println("if");
		}
                else{
			//necesario si se está borrando un nodo diferente al último
			this.current = this.current.getNext();
                        System.out.println("else");
                        
                }
                
		//disminuir el tamaño
		this.tamaño--;
                System.out.println(tamaño);
	}

   
       

    
    /**
     *Método para convertir la lista en string
     * @return la lista en formato "String"
     */
        @Override
         public String toString() {
	Nodo Nodocurrent;
        Nodocurrent = this.head.getNext();
		
	StringBuffer resultado = new StringBuffer();
        //Ciclo for para agregar comas(,) cada vez que el contador sume
        for (int contador = 0; Nodocurrent != null; contador++) 
		{
        	if (contador > 0) 
			{
        		resultado.append(",");
        	}
        	Farmacia elemento = (Farmacia) Nodocurrent.getElement();
			
        	resultado.append(elemento == null ? "" : elemento.getNombre());
        	Nodocurrent = Nodocurrent.getNext();
        }
        return resultado.toString();
        }
        }
