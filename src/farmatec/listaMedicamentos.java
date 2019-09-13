package farmatec;

public class listaMedicamentos {//Inicio de la clase listaMedicamentos

    public class Nodo {//Inicio de la clase Nodo

        //Inicio Atributos
        private Object medicamento;
        private Nodo next;
        //Fin Atributos

        //Inicio Constructores
        public Nodo() {
            this.medicamento = null;
            this.next = null;
        }

        public Nodo(Object medicamento) {
            this.medicamento = medicamento;
            this.next = null;
        }

        public Nodo(Object medicamento, Nodo next) {
            this.medicamento = medicamento;
            this.next = next;
        }
        //Fin Constructores

        public Object getElement() {
            return this.medicamento;
        }

        public void setElement(Object medicamento) {
            this.medicamento = medicamento;
        }

        public Nodo getNext() {
            return this.next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

    }//Fin de la clase Nodo

//Inicio Atributos
    private Nodo head;
    private Nodo current;
    private Nodo tail;
    private int position;
    private int size;

//Fin Atributos

//Inicio constructores
    public listaMedicamentos() {

        this.head = new Nodo();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;
        this.size = 0;

    }

    public listaMedicamentos(listaMedicamentos medicamentos) {

    }
//Fin constructores


    public void append(Object element) {
        //siempre se agrega al final de la lista
        Nodo newNode = new Nodo(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
 
    }

    public void remove() {//Inicio del método remove
        if ((this.head == this.current) && (this.head == this.tail)) {
            System.out.println("Lista vacía");
            return;
        }
        if (this.size == 0) {
            System.out.println("Lista vacía");
        }

        Nodo temporal = head;
        while (temporal.getNext() != this.current) {
            temporal = temporal.getNext();
        }

        temporal.setNext(this.current.getNext());

        if (this.current == this.tail) {
            this.current = this.tail = temporal;
            this.position--;

        } else {
            this.current = this.current.getNext();

        }
        this.size--;

    }//Fin del método remove

    public Object getElement() {
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }

    public boolean previous() {
        if (this.current == this.head) {
            System.out.println("Primer nodo, no se puede retroceder");
            return false;
        }
        Nodo temp = head;
        this.position = -1;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
            this.position++;
        }
        this.current = temp;
        return true;
    }

    public int getPosition() {
        return this.position;
    }

    public void goToStart() {
        this.current = this.head;
        this.position = -1;
    }

    public void goToPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Posición inválida");
            return;
        }
        if (pos > this.position) {
            while (pos > this.position) {
                this.next();
            }
        } else if (pos < this.position) {
            while (pos < this.position) {
                this.previous();
            }
        }
    }

    public String toString() {
        Nodo currentNode = this.head.getNext();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++) {
            if (i > 0) {
                result.append(",");
            }
            Medicamentos element = (Medicamentos) currentNode.getElement();

            result.append(element == null ? "" : element.getNombre());
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

    public String tooString() {
        Nodo currentNode = this.head.getNext();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++) {
            if (i > 0) {
                result.append(",");
            }
            Object element = currentNode.getElement();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

    public String toooString() {
        Nodo currentNode = this.head.getNext();

        StringBuffer result = new StringBuffer();

        for (int i = 0; currentNode != null; i++) {
            if (i > 0) {
                result.append(",");
            }
            Farmacia element = (Farmacia) currentNode.getElement();

            result.append(element == null ? "" : element.getNombre());
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

}//Fin de la clase listaMedicamentos
