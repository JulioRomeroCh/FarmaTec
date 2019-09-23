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
public class Atencion {
     private Nodo front;
	private Nodo rear;
	private int size;
	
	public Atencion (){
		this.front = new Nodo ();
		this.rear = this.front;
		this.size = 0;
	}
	
	public void enqueue(ListaPedidos pedido){
		this.rear.setNext(new Nodo (pedido, null));
		this.rear = rear.getNext();
		this.size++;
	}
	
	public ListaPedidos dequeue(){
		if(this.size == 0){
			System.out.println("No hay pedidos");
			
		}
		ListaPedidos temp = (ListaPedidos) this.front.getNext().getElement();
		Nodo nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
		return temp;
	}
	
	public ListaPedidos first(){
		if(this.size == 0){
			System.out.println("No hay pedidos");
			return null;
		}
		return (ListaPedidos) this.front.getNext().getElement();
	}
	
	public int size(){
		return this.size;
	}
	
	public void clear(){
		this.front = new Nodo ();
		this.rear = this.front;
		this.size = 0;
	}
        
 @Override
	public String toString(){
		String result = " Cola: ";
		Nodo tFront = this.front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getNext().getElement() + " ";
			tFront = tFront.getNext();
			tSize--;
		}
		return result;
	}
	
	public void rotate(){
		if (this.size == 0) {
			System.out.println("No hay pedidos");
		} else {
			Nodo current = this.front.getNext();
			Nodo temp = null;
			Nodo  newRear = null;
			while (current != null) {
				if (current == this.front.getNext()){
					temp = new Nodo ((ListaPedidos) current.getElement(), null);
					newRear = temp;
				} else if (current == this.rear) {
					temp = new Nodo ((ListaPedidos) current.getElement(), temp);
					this.front.setNext(temp);
				} else {
					temp = new Nodo ( (ListaPedidos) current.getElement(), temp);
				}
				current = current.getNext();
			}
			this.rear = newRear;
		}	
	}
	
	public void rotate2(){
		if (this.size == 0) {
			System.out.println("No hay pedidos");
		} else {
			Nodo next = this.front.getNext();
			Nodo afterNext = next.getNext();
			Nodo temp = null;
			
			while (afterNext != null) {
				if (next == this.front.getNext()){
					next.setNext(null);
					this.front.setNext(this.rear);
					this.rear = next;
				} 
				temp =  afterNext.getNext();
				afterNext.setNext(next);
				next = afterNext;
				afterNext = temp;
			}
			
		}	 
    
}
    public String encontrar (Usuario med){
        return med.getMedicamentoSolicitado().getNombre();
    }
    int cantidad;
    public int reducir (Usuario med){
        this.cantidad = med.getMedicamentoSolicitado().getCantidad();
        if (cantidad == 0){
            System.out.println("No hay más medicamentos");
            med.getMedicamentoSolicitado().setCantidad(cantidad);
            return this.cantidad;
        }
        this.cantidad --;
        med.getMedicamentoSolicitado().setCantidad(cantidad);
        return this.cantidad;
          }
    
   /**int cantidad;
    public ListaPedidos atender (ListaPedidos lista, Usuario med){
        Atencion cola = new Atencion();
        cola.enqueue(lista);
        
        while (cola != null){
            System.err.println(cola.toString());
            System.out.println("Atendiendo a: " + med.getNombreUsuario());
            System.out.println("Su medicamento es: " + med.getMedicamentoSolicitado().getNombre());
            this.cantidad = med.getMedicamentoSolicitado().getCantidad();
            this.cantidad--;
           med.getMedicamentoSolicitado().setCantidad(this.cantidad);
             System.out.println("Cantidad actual de: " + med.getMedicamentoSolicitado().getNombre() +" es " + med.getMedicamentoSolicitado().getCantidad());
            System.out.println("Gracias por su compra");
            
            if (this.size == 0){
                System.out.println("No hay más pedidos");
                break;
            }
            cola.dequeue();
            System.err.println(cola.toString());
       
    }
         return lista;
}**/
}
