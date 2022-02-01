package Arreglos;

public class Arreglos {
	public static void main(String[] args) {
	
		int[] numeros;	//Tipo de variable
		numeros = new int[4];	//numeros es un arreglo entero dimension 4
		
		String[] nombres = new String[5];	//Declarar arreglos con dimension 10
		String[] nombreFrutas = new String[] {	//Declaracion de arreglo con valores
				"Manzana",
				"Platano",
				"Fresa",
				"Uva"
		};
		
		numeros[0] = 10;
		numeros[1]=100;
		numeros[2]=200;
		numeros[3]=300;
		nombres[0] = "Jonathan";
		nombres[1] = "Omar";
		nombres[2] = "Quino";
		nombres[3] = "Reyes";
		System.out.println(numeros[1]);
		System.out.println(numeros);
		System.out.println("---------------");
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("---------------");
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
		System.out.println("---------------");
		for(int i=0;i<nombreFrutas.length;i++) {
			System.out.println(nombreFrutas[i]);
		}
	}
}
