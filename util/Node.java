package ProgramacionIII.util;

public class Node {
	private int info;
	private Node next;
	
	public Node() {
	next = null;
	}
	
	public Node(int v, Node n) {
	setValor(v);
	setSig(n);
	}
	public void setValor(int v) {
	info = v;
	}
	public void setSig(Node n) {
	next = n;
	}
	public int valor() {
	return info;
	}
	public Node siguiente() {
	return next;
	}
	
	public boolean siguienteMenor() {
		return (this.siguiente() != null) && (this.valor() > this.siguiente().valor());
		
	}
	public boolean siguienteMayor() {
		return (this.siguiente() != null) && (this.valor() < this.siguiente().valor());
		
	}
	
	public void cambiarSig() {
		int aux = this.valor();
		this.setValor(this.siguiente().valor());
		this.siguiente().setValor(aux);
	}
	
	
}
