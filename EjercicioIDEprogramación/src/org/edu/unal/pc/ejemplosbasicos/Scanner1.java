package org.edu.unal.pc.ejemplosbasicos;

import java.util.*;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner personaje = new Scanner(System.in);
		
		System.out.println("Cual es su edad");
		int e= personaje.nextInt();
		
		personaje.nextLine();//LIMPIAR EL SCANNER
		
		System.out.println("Diga su  nombre");
		
		String nombre = personaje.nextLine();
		
		System.out.println("Bienvenido "+ nombre + e);
		
		personaje.close();
		

	}
	}


