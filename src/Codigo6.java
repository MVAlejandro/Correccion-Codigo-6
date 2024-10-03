
// El programa genera 20 números al azar y se pregunta al usuario cuáles quiere resaltar,
// si los multiplos de 5 o 7, y al final regresa los mismos números pero con la opción seleccionada resaltada.

import java.util.Scanner; // Se importa la clase Scanner

public class Codigo6 {
	  public static void main(String[] args) { // Se agrega el método main
		  int[] n = new int[20]; // Se agrega new

		  for (int i = 0; i < 20; i++) { // Faltaba otro signo +
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " "); // Falta out para el correcto funcionamiento
		  } // for
		  
		  Scanner sc = new Scanner(System.in); // Se añade un scanner para leer el input del usuario
		    
		  System.out.println("\n¿Qué números quiere resaltar? "); // Faltaba la n del println
		  System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		  int opcion = sc.nextInt(); // Se cambia la sentencia por el scanner

		  int multiplo = (opcion == 1)? 5 : 7; // Se invierte la posición de los simbolos para su corecto uso

		  for (int e : n) { // se debe usar for, no foreach. También se cambia el tipo de variable
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      } else { // Hacia falta el } del if
		        System.out.print(e + " "); // Se corrige System.in por .out
		      } // else
		  } // for
		  
		  sc.close(); // Se cierra el scanner
	} // main
	    
	  
} // class Codigo6