package ProgramacionIII.util;

public class PrimeraEntrega {
	
	
	public static ListaS armarListaMezclaOrd(ListaS l1, ListaS l2) {
		ListaS l3 = new ListaS();
		
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				if ((int)l1.AtElement(i) == (int)l2.AtElement(j)){
					l3.addOrd((int)l1.AtElement(i));
				}
			}
		}
		return l3;
	}
	
/*
 * Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
 * suponiendo que: a) las listas están desordenadas y la lista resultante debe quedar
 *ordenada. b) las listas están ordenadas y la lista resultante debe mantenerse ordenada.
 */
	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();

		
		// a)

		ListaS l1 = new ListaS();
		ListaS l2 = new ListaS();
		ListaS l3 = new ListaS();

		l1.add(10);
		l1.add(5);
		l1.add(30);
		l1.add(3);
		l1.add(17);
		l1.add(2);
		
		l2.add(50);
		l2.add(17);
		l2.add(10);
		l2.add(2);
		
		System.out.println("A) ");
		System.out.print("Lista A: ");
		l1.imprimirListaSimple();	
		System.out.print("Lista B: ");
		l2.imprimirListaSimple();
		l3 = armarListaMezclaOrd(l1,l2);
		System.out.print("Lista Repetidos: ");
		l3.imprimirListaSimple();

		// b)


		
		ListaS l4 = new ListaS();
		ListaS l5 = new ListaS();
		ListaS l6 = new ListaS();
	
		l4.add(10);
		l4.add(5);
		l4.add(30);
		l4.add(3);
		l4.add(17);
		l4.add(2);
		l4.ordenarBurbuja();
		
		l5.addOrd(50);
		l5.addOrd(17);
		l5.addOrd(10);
		l5.addOrd(2);
		
		System.out.println("B) ");
		System.out.print("Lista A: ");
		l4.imprimirListaSimple();	
		System.out.print("Lista B: ");
		l5.imprimirListaSimple();
		l6 = armarListaMezclaOrd(l4,l5);
		System.out.print("Lista Repetidos: ");
		l6.imprimirListaSimple();

		
		
		System.out.print("Tardo: ");
		System.out.println(t.stop());
	}

}
