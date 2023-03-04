package colecciones;

import java.util.*;

public class misCollection {

	public static void main(String[] args) {
		
		misCollection c = new misCollection();
		
		
		//imprimir(c.listasCollections());
		//imprimir(c.setCollections());
		//imprimir(c.tsetCollections());
		//wrapperClass();
		
	mapCollections();
	
		
	}//final main string
	

	private staqtic void mapCollections() {

		Map miMap = new HashMap();
		
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		return miMap;
		
	}
	
	
	
	
	
	Set setCollections() {
	Set miSet = new HashSet ();
	miSet.add("uno");
	miSet.add("dos");
	miSet.add("tres");
	miSet.add("cuatro");
	miSet.add("cinco");
	miSet.add("seis");
	
			return miSet;
	}
	
	Set tsetCollections() {
	Set miTSet = new TreeSet();
	miTSet.add("uno");
	miTSet.add("dos");
	miTSet.add("tres");
	miTSet.add("cuatro");
	miTSet.add("cinco");
	miTSet.add("seis");
	
			return miTSet;
			
	}
	
	
	
	private List listasCollections() {

		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("está vacía " + miLista.isEmpty());
		miLista.add("1");
		miLista.add(2);
		miLista.add(3);
		miLista.add(0,"Pato");
		miLista.set(0, miLista);
		miLista.remove(2);
		
		System.out.println(miLista + "Tamaño de la lista después " + miLista.size());
		System.out.println("está vacía " + miLista.isEmpty());
		
		boolean e = miLista.contains(2);
		System.out.println("--->" + e);
		
		return miLista;
	}//termina listasCollections
	
	public static void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos: collection) {
			System.out.println("Elementos " + elementos);
		}
	}
	
	
	
	
	
	
	
	

	static void wrapperClass() {
	//Datos primitivos: byte, short, char, long, float, int
	
		byte numeroB = -128;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("--> " + numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamaño de un entero: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Max " + Integer.MAX_VALUE);
		System.out.println("Valor Min " + Integer.MIN_VALUE);
		System.out.println("--> " + numeroI);
		
		short numeroS = 365;
		System.out.println("Tamaño de un entero: " + Short.BYTES);
		System.out.println("Tamaño de un entero: " + Short.SIZE);
		System.out.println("Valor Max " + Short.MAX_VALUE);
		System.out.println("Valor Min " + Short.MIN_VALUE);
		System.out.println("--> " + numeroS);
		
		long numeroL = 9223372036854775807l;
		System.out.println("Tamaño de un entero: " + Long.BYTES);
		System.out.println("Tamaño de un entero: " + Long.SIZE);
		System.out.println("Valor Max " + Long.MAX_VALUE);
		System.out.println("Valor Min " + Long.MIN_VALUE);
		System.out.println( numeroL);
	}
	
	
}
