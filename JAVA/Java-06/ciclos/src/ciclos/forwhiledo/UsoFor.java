package ciclos.forwhiledo;

public class UsoFor {

	public void cicloFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("El iterador --> " + i);

		}

	}

	public void lefrasFor() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("Soy -->" + i + ", ");
			
			char letra = (char) i;
			System.out.println("Soy --->" + letra + ", ");
		}
	}

}
