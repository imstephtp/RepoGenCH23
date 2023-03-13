package pruebas.Junit.cstp.app;

public class Calculadora {

	
	public int sumar(int n1, int n2) {
		
		return (n1+n2);
	}
	
	
	public int restar(int n1, int n2) {
		
		return (n1-n2);
	}
	
	public double dividir(double d1, double d2) {
		
		return (d1/d2);
	}
	
	public double divisionbyZero(double v1, double v2) {
		if (v2 == 0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}
		return (v1/v2);
	}
	
}
