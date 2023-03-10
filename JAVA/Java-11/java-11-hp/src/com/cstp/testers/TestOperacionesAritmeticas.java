package com.cstp.testers;

import com.cstp.clases.Mensajes;
import com.cstp.clases.OperacionesAritmeticas;
import com.cstp.clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma (5,2);
		OperacionesAritmeticas ss= new Suma (10,3);
		Mensajes sss = new Suma();
		
		System.out.println("suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + ss.sumar());
		s.mensaje();
		sss.mensaje();
		
	}

}
