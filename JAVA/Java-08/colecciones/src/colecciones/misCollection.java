package colecciones;

public class misCollection {

	public static void main(String[] args) {

		wrapperClass();
		
	}
	
	private void listasCollections() {

		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2;
		miLista.add(3);
	}
	
	
	private void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos: collection) {
			System.out.println();
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
