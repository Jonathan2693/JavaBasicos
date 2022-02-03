package Metodos;

public class Metodos {
	int a,b;
	public void sumar() {
		int resultado = a+b;
		System.out.println("El resultado de la suma es " + resultado);
	}
	public int sumaRetorno() {
		int resultado = a+b;
		return resultado;
	}
}
