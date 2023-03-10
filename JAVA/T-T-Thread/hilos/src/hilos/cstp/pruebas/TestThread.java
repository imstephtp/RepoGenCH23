package hilos.cstp.pruebas;

import hilos.cstp.formathread.hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread h = new hilo1 ("Juan");
			h.start();
			Thread h0 = new hilo1 ("Maria");
			h0.start();
			Thread h1 = new hilo1 ("Raul");
			h1.start();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println(h.getState());
					
					
	}

}
