package org.edu.unal.pc.ejemplosbasicos;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		char opcion;
		
		System.out.println("Ingrese una de las siguientes opciones: ");
		
		System.out.println("A. ");
		System.out.println("B. ");
		System.out.println("C. ");
		System.out.println("D. ");
		System.out.println("E. ");
		
		String variable=entrada.next();
		opcion=variable.charAt(0);
	
		switch(opcion) {
		
		case 'A':
			System.out.println("Seleccionó la opción A");
			break;
		case 'B':
			System.out.println("Seleccionó la opción B");
			break;
		case 'C':
			System.out.println("Seleccionó la opción C");
			break;
		case 'D':
			System.out.println("Seleccionó la opción D");
			break;
		case 'E':
			System.out.println("Seleccionó la opción E");
			break;
		default:
			System.out.println("No seleccionó ninguna opción valida");
		
		
		}
		
		
		
		
		
	}

}
