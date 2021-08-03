package org.edu.unal.pc.ejemplosbasicos;

import java.util.*;

public class Condicionales {

	static double nota = 3.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite la nota obtenida");

		double notaobtenida = entrada.nextDouble();

		if (notaobtenida > 5) {
			System.out.println("Este no es una nota valida, intente nuevamente");
		} else {
			if (notaobtenida >= nota) {
				System.out.println("Paso la materia");
			} else {
				System.out.println("No paso la materia");
			}
		}
	}

}
