package testers;

import oop.clases.Fecha;

public class TestFecha {

	public static void main(String[] args) {

		Fecha f = new Fecha();
		f.setDia(6);
		f.setMes(3);
		f.setAnio(2023);
		
		System.out.println(f.diaMesAnio());
		System.out.println("---> " + f.toString());
	}

}
