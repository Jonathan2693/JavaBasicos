import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		float n1 = sc.nextFloat();
		System.out.println("Ingresa el segundo numero");
		float n2 = sc.nextFloat();
		System.out.println("�Qu� operaci�n deseas realizar? Escr�bela");
		System.out.println("Suma");
		System.out.println("Resta");
		System.out.println("Multiplicaci�n");
		System.out.println("Divisi�n");
		String operacion = sc.next();
		switch(operacion.toLowerCase().trim()) {
		case "suma":
			System.out.println("La suma de los numeros es " + (float)(n1+n2));
			break;
		case "resta":
			System.out.println("La resta de los numeros es " + (float)(n1-n2));
			break;
		case "multiplicacion":
			System.out.println("La multiplicaci�n de los numeros es " + (float)(n1*n2));
			break;
		case "division":
			System.out.println("La divisi�n de los numeros es " + (float)(n1/n2));
			break;
		default:
			System.out.println("La operaci�n no esta definida");
			break;
		}
		sc.close();
	}
}
