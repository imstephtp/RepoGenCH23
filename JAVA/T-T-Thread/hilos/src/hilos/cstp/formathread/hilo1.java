package hilos.cstp.formathread;

public class hilo1 extends Thread {
	
	
	public hilo1(String name) {
		super(name);
	}



	@Override
	public void run() {
		
		System.out.println("Se inicia el thread o hilo " + this.getName());
		
		
		System.out.println("Termina el thread o hilo " + this.getName());
		
	}
}
