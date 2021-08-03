package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Operadorternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un número entero: ");

		int numero = entrada.nextInt();

		String etiqueta = (numero % 2 == 0) ? "Par" : "Impar";

		System.out.println(numero + " es número " + etiqueta);

	}

}
