package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		/*
		 * Set tiene 3 implementaciones Las colecciones no tienen ELEMENTOS REPETIDOS
		 * //HashSet //TreeSet //LinkedHashSet /* HashSet Los elementos no tienen orden
		 */

		/*
		 * Set<String> frutas = new HashSet<String>(); frutas.add("Mango");
		 * frutas.add("Papaya"); frutas.add("Sandia"); frutas.add("Manzana");
		 * frutas.add("Platano"); frutas.add("Mamey"); frutas.add("Mango"); //No
		 * almacena el elemento por ser repetido
		 * 
		 * for( String fruta : frutas) { System.out.println(fruta); }
		 * 
		 * 
		 * 
		 * // Treeset //Muestra elementos ordenados
		 * 
		 * Set<String> frutas2 = new TreeSet<String>(); frutas2.add("Mango");
		 * frutas2.add("Papaya"); frutas2.add("Sandia"); frutas2.add("Manzana");
		 * frutas2.add("Platano"); frutas2.add("Mamey"); frutas2.add("Mango"); //No
		 * almacena el elemento por ser repetido for( String fruta : frutas2) {
		 * System.out.println(fruta); //Ordena por orden alfabetico }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * LinkedHashSet Ordena los elementos basados en su ingreso
		 * 
		 * Set<String> frutas3 = new LinkedHashSet<String>(); frutas3.add("Mango");
		 * frutas3.add("Papaya"); frutas3.add("Sandia"); frutas3.add("Manzana");
		 * frutas3.add("Platano"); frutas3.add("Mamey"); frutas3.add("Mango"); //No
		 * almacena el elemento por ser repetido for( String fruta : frutas3) {
		 * System.out.println(fruta); //Ordena por orden alfabetico }
		 * 
		 * 
		 * List Permite elementos duplicados y posee metodos de busqueda
		 * 
		 * 
		 * ArrayList
		 * 
		 * System.out.println("********************"); List<String> pokemones = new
		 * ArrayList<String>(); pokemones.add("chicorita"); pokemones.add("Eevee");
		 * pokemones.add("patamon"); pokemones.add("Dragonite");
		 * pokemones.add("charizard");
		 * 
		 * 
		 * pokemones.add(2,"psyduck");
		 * 
		 * System.out.println("********************");
		 * System.out.println(pokemones.get(2));
		 * System.out.println("********************");
		 * System.out.println(pokemones.indexOf("patamon"));
		 * System.out.println("********************");
		 * System.out.println(pokemones.remove(4));
		 * System.out.println("********************");
		 * System.out.println(pokemones.set(4,"pokemonset"));
		 * 
		 * 
		 * for(String pokemon:pokemones) { System.out.println(pokemon); }
		 */
		/*
		 * Linked List es una lista doblemente enlazada cada elemento tiene informacion
		 * sobre el elemento anterior y posterior
		 */
		/*
		 * List<String> digimones = new LinkedList<String>(); digimones.add("digimon1");
		 * digimones.add("digimon2"); digimones.add("digimon3");
		 * digimones.add("digimon4"); digimones.add("digimon5");
		 */

		/*Mapas
		 * 
		 * asocia claves y valores, no hay claves repetidas y solo puede tener un valor asociado
		 * 
		 * 
		 * HashMap
		 * Buen rendimiento, pero elementos desordenados
		 */
		/*
		 * Map<Integer,String> usuarios = new HashMap<Integer, String>();
		 * usuarios.put(1,"Jonathan"); usuarios.put(2,"Omar"); usuarios.put(3,"Quino");
		 * usuarios.put(4,"Reyes"); System.out.println(usuarios.get(2));
		 * System.out.println(usuarios.keySet());
		 */
		
		/*Treemap
		 * Menor rendimiento pero muestra datos como fueron insertados
		 */
		Map<Integer,String> usuarios2 = new TreeMap<Integer, String>();
		usuarios2.put(1, "Jonathan");
		usuarios2.put(2,"Omar");
		usuarios2.put(3,"Quino");
		//System.out.println(usuarios2.keySet().toString() + usuarios2.values().toString());
		usuarios2.entrySet().forEach(clave -> {
			System.out.println(clave.getKey().toString() + clave.getValue().toString());
		});
		
		Map<Integer,String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1,"prius");
		carros.put(2,"");
		carros.put(3,"CRV");
	}
}
