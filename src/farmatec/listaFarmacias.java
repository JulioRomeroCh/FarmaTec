package farmatec;
import java.util.Scanner;
public class listaFarmacias {

    public class Nodo {//Inicio clase Nodo
        //oo
        private Farmacia farmacia;
        private Nodo next;
        //Constructores
        public Nodo() {
            this.farmacia = null;
            this.next = null;
        }

        public Nodo(Object farmacia) {
            this.farmacia = (Farmacia) farmacia;
            this.next = null;
        }

        public Nodo(Object farmacia, Nodo next) {
            this.farmacia = (Farmacia) farmacia;
            this.next = next;
        }

        //Métodos
        public Object getElement() {
            return this.farmacia;
        }

        public void setElement(Object farmacia) {
            this.farmacia = (Farmacia) farmacia;
        }

        public Nodo getNext() {
            return this.next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

    }//Fin de la clase Nodo
    
    //Atributos de la clase listaFarmacias
    private Nodo head;
    private Nodo current;
    private Nodo tail;
    private int position;
    private int size;
    // Se crea el constructor por defecto de la clase listaFarmacias, que asigne los valores por defecto a los atributos
    public listaFarmacias() {
        this.head = new Nodo();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;
        this.size = 0;
    }

    //Constructor
    public listaFarmacias(listaFarmacias farmacias) {

    }
    
    //Métodos
    public void append(Object element) {
        //siempre se añade al final de la lista
        Nodo newNode = new Nodo(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void insert(Object element) {
        //Insertar en cualquier posición
        Nodo newNode = new Nodo(element, this.current.getNext());
        this.current.setNext(newNode);
        //Necesario si se está insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;

    }

    public void clear() {
        this.head = this.tail = this.current = new Nodo();
        this.position = -1;
        this.size = 0;
    }

    public void remove() {

        if ((this.head == this.current) && (this.head == this.tail)) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
        }
        temp.setNext(this.current.getNext());

        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        } else {
            this.current = this.current.getNext();
        }

        this.size--;
    }

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

    //Método para buscar la farmacia en la lista, para luego poder añadirle los medicamentos que se desea
    public void goTonom(String nom) {
        this.current = this.head;
        this.current = this.current.getNext();
        if (this.current == this.tail) {
            //System.out.println("Último nodo, no se puede avanzar");
        }

        while (current != null) {

            if (nom.equals(current.farmacia.getNombre())) {
                //System.out.println("YEEEEEEEEEESSSS");
                break;
            } else {
                //System.out.println("todavia no lo encuentro");
                this.current = this.current.getNext();
            }

        }

        //System.out.println("mameiiiichoooon -.-");
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
            Farmacia element = (Farmacia) currentNode.getElement();

            result.append(element == null ? "" : element.getNombre());
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }
    //Este metodo y el siguiente son pruebas...
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
            Medicamentos element = (Medicamentos) currentNode.getElement();

            result.append(element == null ? "" : element.getNombre());
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }
    
    public listaMedicamentos VerMedicamentos(){
        Scanner input=new Scanner(System.in);
        System.out.println("Digite la farmacia a la que quiere accesar");
        String eleccion=input.nextLine();
        Nodo temporal=head.getNext();
        while (temporal!=null){
            if (eleccion.equals(temporal.farmacia.getNombre())){
                System.out.println(temporal.farmacia.listameds);
                return temporal.farmacia.listameds;
            }
            temporal=temporal.getNext();
        }
        return null;
    }
    
    

}
