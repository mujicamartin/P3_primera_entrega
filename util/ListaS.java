package ProgramacionIII.util;

public class ListaS {  
	protected Node primero;
	protected int tamaño;
	
	public ListaS() {
		primero = null;
		tamaño = 0;
	}
	
	public ListaS(int x) {
		primero = null;

		tamaño = 0;
		for (int i = 0; i < x; i++) {
			this.add((i));
		}
	}
	
	public void add(int o) {
		Node n = new Node(o, null);
		n.setSig(primero);
		primero = n;
		tamaño ++;
	}
	


	public void addOrd(int v) { 
		Node aux = primero;
		Node n = primero;		
				
		if ((n == null) || (n.valor() > v)){
			insertarPrimero(v);
		}
		else {
			while( n.valor() < v && n.siguiente() != null) {
				aux = n;
				n = n.siguiente();
			} 
			if ( n.siguiente() == null && n.valor() < v )
				insertarFin(n,v);
			else
				insertarEnPos(aux,v);
			
		}	
	
	}
	
	public void insertarFin (Node pos,int v) { 
		Node n = new Node(v, null);
		pos.setSig(n);
		tamaño ++;
	}
	
	public void insertarPrimero(int v) { 
		Node n = new Node(v, null);
		if (primero == null) {
			primero = n;
		}
		else {
			n.setSig(primero);
			primero=n;
		}
		tamaño ++;
	}
	public void insertarEnPos(Node pos,int v) { 
		Node n = new Node(v, null);
		n.setSig(pos.siguiente());
		pos.setSig(n);
		tamaño ++;
	}
	
	
	public Object extract() {
		Node tmp = primero;
		primero = primero.siguiente();
		tamaño --;
		return tmp;
	}
	
	public Object AtElement(int pos) {
		int aux = 0;
		Node n = primero;		
		while( (pos > 0 ) && (n != null) && (pos > aux )){ 
			aux++;
			n=n.siguiente();
		}
		if ((pos == aux)&& (n != null))
			return (int)n.valor();
		else
			return -1;
	}
		
	public void imprimirListaSimple() {
		for (int i = 0; i < size(); i++)
				System.out.print(this.AtElement(i)+" - ");
		System.out.println();
	}
	

	public boolean isEmpty() {
		return primero == null;
	}
	public int size () {
		return tamaño;
	}

	
	public void ordenarBurbuja(){
		Node n = new Node();
		for (int i=0; i< this.tamaño; i++) {
			n =  this.primero;
			for (int j=0; j< this.tamaño; j++ ) {
				if (n.siguienteMenor())
					n.cambiarSig();
				n = n.siguiente();
		}
		
		}

}
	
	
	
	

	
}



