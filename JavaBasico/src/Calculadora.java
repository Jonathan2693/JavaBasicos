import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		float n1 = sc.nextFloat();
		System.out.println("Ingresa el segundo numero");
		float n2 = sc.nextFloat();
		System.out.println("¿Qué operación deseas realizar? Escríbela");
		System.out.println("Suma");
		System.out.println("Resta");
		System.out.println("Multiplicación");
		System.out.println("División");
		String operacion = sc.next();
		switch(operacion.toLowerCase().trim()) {
		case "suma":
			System.out.println("La suma de los numeros es " + (float)(n1+n2));
			break;
		case "resta":
			System.out.println("La resta de los numeros es " + (float)(n1-n2));
			break;
		case "multiplicacion":
			System.out.println("La multiplicación de los numeros es " + (float)(n1*n2));
			break;
		case "division":
			System.out.println("La división de los numeros es " + (float)(n1/n2));
			break;
		default:
			System.out.println("La operación no esta definida");
			break;
		}
		sc.close();
	}
}
